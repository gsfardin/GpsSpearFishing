package com.gpsfishing.service;

import static org.junit.jupiter.api.Assertions.assertSame;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.ArgumentMatchers.isA;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import com.diffblue.cover.annotations.MethodsUnderTest;
import com.gpsfishing.model.Fish;
import com.gpsfishing.repository.FishRepository;
import io.micronaut.data.model.Page;
import io.micronaut.data.model.Pageable;

import java.util.Optional;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class FishServiceDiffblueTest {
    @Mock
    private FishRepository fishRepository;

    @InjectMocks
    private FishService fishService;

    /**
     * Test {@link FishService#findById(Long)}.
     * <ul>
     *   <li>Given {@link Fish#Fish()} Id is one.</li>
     *   <li>Then return {@link Fish#Fish()}.</li>
     * </ul>
     * <p>
     * Method under test: {@link FishService#findById(Long)}
     */
    @Test
    @DisplayName("Test findById(Long); given Fish() Id is one; then return Fish()")
    @Tag("MaintainedByDiffblue")
    @MethodsUnderTest({"Fish FishService.findById(Long)"})
    void testFindById_givenFishIdIsOne_thenReturnFish() {
        // Arrange
        Fish fish = new Fish();
        fish.setId(1L);
        fish.setInitialScore(3);
        fish.setName("Name");
        fish.setScientificName("Scientific Name");
        Optional<Fish> ofResult = Optional.of(fish);
        when(fishRepository.findById(Mockito.<Long>any())).thenReturn(ofResult);

        // Act
        Fish actualFindByIdResult = fishService.findById(1L);

        // Assert
        verify(fishRepository).findById(eq(1L));
        assertSame(fish, actualFindByIdResult);
    }

    /**
     * Test {@link FishService#findAll(Pageable)}.
     * <p>
     * Method under test: {@link FishService#findAll(Pageable)}
     */
    @Test
    @DisplayName("Test findAll(Pageable)")
    @Tag("MaintainedByDiffblue")
    @MethodsUnderTest({"Page FishService.findAll(Pageable)"})
    void testFindAll() {
        // Arrange
        when(fishRepository.findAll(Mockito.<Pageable>any())).thenReturn(mock(Page.class));

        // Act
        fishService.findAll(mock(Pageable.class));

        // Assert
        verify(fishRepository).findAll(isA(Pageable.class));
    }

    /**
     * Test {@link FishService#save(Fish)}.
     * <p>
     * Method under test: {@link FishService#save(Fish)}
     */
    @Test
    @DisplayName("Test save(Fish)")
    @Tag("MaintainedByDiffblue")
    @MethodsUnderTest({"Fish FishService.save(Fish)"})
    void testSave() {
        // Arrange
        Fish fish = new Fish();
        fish.setId(1L);
        fish.setInitialScore(3);
        fish.setName("Name");
        fish.setScientificName("Scientific Name");
        when(fishRepository.save(Mockito.<Fish>any())).thenReturn(fish);

        Fish fish2 = new Fish();
        fish2.setId(1L);
        fish2.setInitialScore(3);
        fish2.setName("Name");
        fish2.setScientificName("Scientific Name");

        // Act
        Fish actualSaveResult = fishService.save(fish2);

        // Assert
        verify(fishRepository).save(isA(Fish.class));
        assertSame(fish, actualSaveResult);
    }

    /**
     * Test {@link FishService#update(Fish)}.
     * <p>
     * Method under test: {@link FishService#update(Fish)}
     */
    @Test
    @DisplayName("Test update(Fish)")
    @Tag("MaintainedByDiffblue")
    @MethodsUnderTest({"Fish FishService.update(Fish)"})
    void testUpdate() {
        // Arrange
        Fish fish = new Fish();
        fish.setId(1L);
        fish.setInitialScore(3);
        fish.setName("Name");
        fish.setScientificName("Scientific Name");
        when(fishRepository.update(Mockito.<Fish>any())).thenReturn(fish);

        Fish fish2 = new Fish();
        fish2.setId(1L);
        fish2.setInitialScore(3);
        fish2.setName("Name");
        fish2.setScientificName("Scientific Name");

        // Act
        Fish actualUpdateResult = fishService.update(fish2);

        // Assert
        verify(fishRepository).update(isA(Fish.class));
        assertSame(fish, actualUpdateResult);
    }

    /**
     * Test {@link FishService#delete(Fish)}.
     * <p>
     * Method under test: {@link FishService#delete(Fish)}
     */
    @Test
    @DisplayName("Test delete(Fish)")
    @Tag("MaintainedByDiffblue")
    @MethodsUnderTest({"void FishService.delete(Fish)"})
    void testDelete() {
        // Arrange
        doNothing().when(fishRepository).delete(Mockito.<Fish>any());

        Fish fish = new Fish();
        fish.setId(1L);
        fish.setInitialScore(3);
        fish.setName("Name");
        fish.setScientificName("Scientific Name");

        // Act
        fishService.delete(fish);

        // Assert
        verify(fishRepository).delete(isA(Fish.class));
    }

    /**
     * Test {@link FishService#deleteById(Long)}.
     * <p>
     * Method under test: {@link FishService#deleteById(Long)}
     */
    @Test
    @DisplayName("Test deleteById(Long)")
    @Tag("MaintainedByDiffblue")
    @MethodsUnderTest({"void FishService.deleteById(Long)"})
    void testDeleteById() {
        // Arrange
        doNothing().when(fishRepository).deleteById(Mockito.<Long>any());

        // Act
        fishService.deleteById(1L);

        // Assert
        verify(fishRepository).deleteById(eq(1L));
    }
}
