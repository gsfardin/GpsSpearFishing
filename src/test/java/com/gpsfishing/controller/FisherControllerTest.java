package com.gpsfishing.controller;

import com.gpsfishing.model.*;
import com.gpsfishing.model.enums.BeaufortScale;
import com.gpsfishing.model.enums.FloorType;
import com.gpsfishing.model.enums.MoonPhase;
import com.gpsfishing.model.enums.WindRose;
import com.gpsfishing.repository.DiveRepository;
import com.gpsfishing.repository.FisherRepository;
import com.gpsfishing.repository.UserRepository;
import io.micronaut.data.model.Page;
import io.micronaut.http.HttpRequest;
import io.micronaut.http.HttpStatus;
import io.micronaut.http.client.HttpClient;
import io.micronaut.http.client.annotation.Client;
import io.micronaut.http.client.exceptions.HttpClientResponseException;
import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import jakarta.inject.Inject;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

@MicronautTest
class FisherControllerTest {

    @Inject
    FisherRepository fisherRepository;
    
    @Inject
    UserRepository userRepository;
    
    @Inject
    DiveRepository diveRepository;
    
    @Inject
    @Client("/")
    HttpClient client;
    
    private User testUser;
    private Dive testDive;
    private Fisher testFisher;
    private FishingPlace testFishingPlace;

    private Timestamp testTimestamp = new Timestamp(System.currentTimeMillis());
    
    @BeforeEach
    void setup() {
        // Clean up any existing data
        fisherRepository.deleteAll();
        
        // Create test user
        testUser = new User();
        testUser.setUserName("gabriel.fardin");
        testUser.setFullName("Gabriel Fardin");
        testUser.setPhoneNumber("27999479949");
        testUser.setBithDate(testTimestamp);
        testUser.setMail("test@example.com");
        testUser = userRepository.save(testUser);

        // Create test fishingPlace
        testFishingPlace = new FishingPlace();
        testFishingPlace.setName("Fishing Place");
        testFishingPlace.setMinDepth(5);
        testFishingPlace.setMaxDepth(18);
        testFishingPlace.setFloorType(FloorType.PEDRA);
        testFishingPlace.setCountry(new Country());
        testFishingPlace.setState(new State());
        testFishingPlace.setCity(new City());

        // Create test dive
        testDive = new Dive();
        testDive.setDateDive(testTimestamp);
        testDive.setInitialDiveHour(testTimestamp);
        testDive.setFinalDiveHour(testTimestamp);
        testDive.setVisibility(5);
        testDive.setMoonPhase(MoonPhase.CRESCENTE);
        testDive.setWindDirection(WindRose.LESTE);
        testDive.setSeaDirection(WindRose.LESTE);
        testDive.setSeaCondition(BeaufortScale.ARAGEM);
        testDive.setFishingPlace(testFishingPlace);
        testDive = diveRepository.save(testDive);
        
        // Create test fisher
        testFisher = new Fisher();
        testFisher.setUser(testUser);
        testFisher.setDive(testDive);
        testFisher.setFisherProductions(new ArrayList<>());
    }
    
    @Test
    void testFindById() {
        // Save the fisher first
        Fisher savedFisher = fisherRepository.save(testFisher);
        
        // Test the endpoint
        Fisher response = client.toBlocking()
                .retrieve(HttpRequest.GET("/fisher/" + savedFisher.getId()), Fisher.class);
        
        assertNotNull(response);
        assertEquals(savedFisher.getId(), response.getId());
        assertEquals(testUser.getId(), response.getUser().getId());
        assertEquals(testDive.getId(), response.getDive().getId());
    }
    
    @Test
    void testFindAll() {
        // Save multiple fishers
        fisherRepository.save(testFisher);
        
        Fisher anotherFisher = new Fisher();
        anotherFisher.setUser(testUser);
        anotherFisher.setDive(testDive);
        anotherFisher.setFisherProductions(new ArrayList<>());
        fisherRepository.save(anotherFisher);
        
        // Test the endpoint
        Page<Fisher> response = client.toBlocking()
                .retrieve(HttpRequest.GET("/fisher?page=0&size=10"), Page.class);
        
        assertNotNull(response);
        assertEquals(2, response.getContent().size());
    }
    
    @Test
    void testSave() {
        // Test the endpoint
        Fisher response = client.toBlocking()
                .retrieve(HttpRequest.POST("/fisher", testFisher), Fisher.class);
        
        assertNotNull(response);
        assertNotNull(response.getId());
        assertEquals(testUser.getId(), response.getUser().getId());
        assertEquals(testDive.getId(), response.getDive().getId());
        
        // Verify it was saved to the database
        Fisher fromDb = fisherRepository.findById(response.getId()).orElse(null);
        assertNotNull(fromDb);
    }
    
    @Test
    void testUpdate() {
        // Save the fisher first
        Fisher savedFisher = fisherRepository.save(testFisher);
        
        // Create updated fisher
        savedFisher.setUser(testUser); // Just to ensure we're not changing anything critical
        
        // Test the endpoint
        Fisher response = client.toBlocking()
                .retrieve(HttpRequest.PUT("/fisher", savedFisher), Fisher.class);
        
        assertNotNull(response);
        assertEquals(savedFisher.getId(), response.getId());
    }
    
    @Test
    void testDelete() {
        // Save the fisher first
        Fisher savedFisher = fisherRepository.save(testFisher);
        
        // Test the endpoint
        client.toBlocking().exchange(HttpRequest.DELETE("/fisher", savedFisher));
        
        // Verify it was deleted
        assertEquals(0, fisherRepository.count());
    }
    
    @Test
    void testDeleteById() {
        // Save the fisher first
        Fisher savedFisher = fisherRepository.save(testFisher);
        
        // Test the endpoint
        client.toBlocking().exchange(HttpRequest.DELETE("/fisher/" + savedFisher.getId()));
        
        // Verify it was deleted
        assertEquals(0, fisherRepository.count());
    }
    
    @Test
    void testFindByIdNotFound() {
        // Test with non-existent ID
        HttpClientResponseException exception = assertThrows(
            HttpClientResponseException.class,
            () -> client.toBlocking().retrieve(HttpRequest.GET("/fisher/999"), Fisher.class)
        );
        
        assertEquals(HttpStatus.INTERNAL_SERVER_ERROR, exception.getStatus());
    }
    
    @Test
    void testSaveWithInvalidData() {
        // Create invalid fisher (missing required user)
        Fisher invalidFisher = new Fisher();
        invalidFisher.setDive(testDive);
        
        // Test the endpoint
        HttpClientResponseException exception = assertThrows(
            HttpClientResponseException.class,
            () -> client.toBlocking().retrieve(HttpRequest.POST("/fisher", invalidFisher), Fisher.class)
        );
        
        assertEquals(HttpStatus.BAD_REQUEST, exception.getStatus());
    }
}
