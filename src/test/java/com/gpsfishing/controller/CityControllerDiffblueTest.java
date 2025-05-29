package com.gpsfishing.controller;

import static org.junit.jupiter.api.Assertions.assertSame;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.ArgumentMatchers.isA;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import com.diffblue.cover.annotations.MethodsUnderTest;
import com.gpsfishing.model.City;
import com.gpsfishing.model.Country;
import com.gpsfishing.model.State;
import com.gpsfishing.service.CityService;
import io.micronaut.data.model.Page;
import io.micronaut.data.model.Pageable;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class CityControllerDiffblueTest {
    @InjectMocks
    private CityController cityController;

    @Mock
    private CityService cityService;

    /**
     * Test {@link CityController#findById(Long)}.
     * <p>
     * Method under test: {@link CityController#findById(Long)}
     */
    @Test
    @DisplayName("Test findById(Long)")
    @Disabled("TODO: Complete this test")
    @Tag("MaintainedByDiffblue")
    @MethodsUnderTest({"City CityController.findById(Long)"})
    void testFindById() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "com.gpsfishing.service.CityService.findById(java.lang.Long)" because "this.cityService" is null
        //       at com.gpsfishing.controller.CityController.findById(CityController.java:28)
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange and Act
        (new CityController()).findById(1L);
    }

    /**
     * Test {@link CityController#findById(Long)}.
     * <p>
     * Method under test: {@link CityController#findById(Long)}
     */
    @Test
    @DisplayName("Test findById(Long)")
    @Disabled("TODO: Complete this test")
    @Tag("MaintainedByDiffblue")
    void testFindById2() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at com.gpsfishing.controller.CityController.findById(CityController.java:28)
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange and Act
        (new CityController()).findById(1L);
    }

    /**
     * Test {@link CityController#findById(Long)}.
     * <p>
     * Method under test: {@link CityController#findById(Long)}
     */
    @Test
    @DisplayName("Test findById(Long)")
    @Tag("MaintainedByDiffblue")
    @MethodsUnderTest({"City CityController.findById(Long)"})
    void testFindById3() {
        // Arrange
        Country country = new Country();
        country.setCodeDdi("Code Ddi");
        country.setId(1L);
        country.setName("Name");

        Country country2 = new Country();
        country2.setCodeDdi("Code Ddi");
        country2.setId(1L);
        country2.setName("Name");

        State state = new State();
        state.setCountry(country2);
        state.setDescription("The characteristics of someone or something");
        state.setId(1L);
        state.setUf("Uf");

        City city = new City();
        city.setCodeDdd("Code Ddd");
        city.setCountry(country);
        city.setId(1L);
        city.setName("Name");
        city.setState(state);
        when(cityService.findById(Mockito.<Long>any())).thenReturn(city);

        // Act
        City actualFindByIdResult = cityController.findById(1L);

        // Assert
        verify(cityService).findById(eq(1L));
        assertSame(city, actualFindByIdResult);
    }

    /**
     * Test {@link CityController#findAll(Pageable)}.
     * <p>
     * Method under test: {@link CityController#findAll(Pageable)}
     */
    @Test
    @DisplayName("Test findAll(Pageable)")
    @Disabled("TODO: Complete this test")
    @Tag("MaintainedByDiffblue")
    @MethodsUnderTest({"io.micronaut.data.model.Page CityController.findAll(Pageable)"})
    void testFindAll() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "com.gpsfishing.service.CityService.findAll(io.micronaut.data.model.Pageable)" because "this.cityService" is null
        //       at com.gpsfishing.controller.CityController.findAll(CityController.java:33)
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange and Act
        (new CityController()).findAll(mock(Pageable.class));
    }

    /**
     * Test {@link CityController#findAll(Pageable)}.
     * <p>
     * Method under test: {@link CityController#findAll(Pageable)}
     */
    @Test
    @DisplayName("Test findAll(Pageable)")
    @Disabled("TODO: Complete this test")
    @Tag("MaintainedByDiffblue")
    void testFindAll2() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at com.gpsfishing.controller.CityController.findAll(CityController.java:33)
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange and Act
        (new CityController()).findAll(null);
    }

    /**
     * Test {@link CityController#findAll(Pageable)}.
     * <p>
     * Method under test: {@link CityController#findAll(Pageable)}
     */
    @Test
    @DisplayName("Test findAll(Pageable)")
    @Tag("MaintainedByDiffblue")
    @MethodsUnderTest({"Page CityController.findAll(Pageable)"})
    void testFindAll3() {
        // Arrange
        when(cityService.findAll(Mockito.<Pageable>any())).thenReturn(mock(Page.class));

        // Act
        cityController.findAll(mock(Pageable.class));

        // Assert
        verify(cityService).findAll(isA(Pageable.class));
    }

    /**
     * Test {@link CityController#save(City)}.
     * <p>
     * Method under test: {@link CityController#save(City)}
     */
    @Test
    @DisplayName("Test save(City)")
    @Disabled("TODO: Complete this test")
    @Tag("MaintainedByDiffblue")
    @MethodsUnderTest({"City CityController.save(City)"})
    void testSave() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "com.gpsfishing.service.CityService.save(com.gpsfishing.model.City)" because "this.cityService" is null
        //       at com.gpsfishing.controller.CityController.save(CityController.java:38)
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange
        CityController cityController = new CityController();

        Country country = new Country();
        country.setCodeDdi("Code Ddi");
        country.setId(1L);
        country.setName("Name");

        Country country2 = new Country();
        country2.setCodeDdi("Code Ddi");
        country2.setId(1L);
        country2.setName("Name");

        State state = new State();
        state.setCountry(country2);
        state.setDescription("The characteristics of someone or something");
        state.setId(1L);
        state.setUf("Uf");

        City city = new City();
        city.setCodeDdd("Code Ddd");
        city.setCountry(country);
        city.setId(1L);
        city.setName("Name");
        city.setState(state);

        // Act
        cityController.save(city);
    }

    /**
     * Test {@link CityController#save(City)}.
     * <p>
     * Method under test: {@link CityController#save(City)}
     */
    @Test
    @DisplayName("Test save(City)")
    @Disabled("TODO: Complete this test")
    @Tag("MaintainedByDiffblue")
    void testSave2() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at com.gpsfishing.controller.CityController.save(CityController.java:38)
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange
        CityController cityController = new CityController();

        Country country = new Country();
        country.setCodeDdi("Code Ddi");
        country.setId(1L);
        country.setName("Name");

        Country country2 = new Country();
        country2.setCodeDdi("Code Ddi");
        country2.setId(1L);
        country2.setName("Name");

        State state = new State();
        state.setCountry(country2);
        state.setDescription("The characteristics of someone or something");
        state.setId(1L);
        state.setUf("Uf");

        City city = new City();
        city.setCodeDdd("Code Ddd");
        city.setCountry(country);
        city.setId(1L);
        city.setName("Name");
        city.setState(state);

        // Act
        cityController.save(city);
    }

    /**
     * Test {@link CityController#save(City)}.
     * <p>
     * Method under test: {@link CityController#save(City)}
     */
    @Test
    @DisplayName("Test save(City)")
    @Tag("MaintainedByDiffblue")
    @MethodsUnderTest({"City CityController.save(City)"})
    void testSave3() {
        // Arrange
        Country country = new Country();
        country.setCodeDdi("Code Ddi");
        country.setId(1L);
        country.setName("Name");

        Country country2 = new Country();
        country2.setCodeDdi("Code Ddi");
        country2.setId(1L);
        country2.setName("Name");

        State state = new State();
        state.setCountry(country2);
        state.setDescription("The characteristics of someone or something");
        state.setId(1L);
        state.setUf("Uf");

        City city = new City();
        city.setCodeDdd("Code Ddd");
        city.setCountry(country);
        city.setId(1L);
        city.setName("Name");
        city.setState(state);
        when(cityService.save(Mockito.<City>any())).thenReturn(city);

        Country country3 = new Country();
        country3.setCodeDdi("Code Ddi");
        country3.setId(1L);
        country3.setName("Name");

        Country country4 = new Country();
        country4.setCodeDdi("Code Ddi");
        country4.setId(1L);
        country4.setName("Name");

        State state2 = new State();
        state2.setCountry(country4);
        state2.setDescription("The characteristics of someone or something");
        state2.setId(1L);
        state2.setUf("Uf");

        City city2 = new City();
        city2.setCodeDdd("Code Ddd");
        city2.setCountry(country3);
        city2.setId(1L);
        city2.setName("Name");
        city2.setState(state2);

        // Act
        City actualSaveResult = cityController.save(city2);

        // Assert
        verify(cityService).save(isA(City.class));
        assertSame(city, actualSaveResult);
    }

    /**
     * Test {@link CityController#update(City)}.
     * <p>
     * Method under test: {@link CityController#update(City)}
     */
    @Test
    @DisplayName("Test update(City)")
    @Disabled("TODO: Complete this test")
    @Tag("MaintainedByDiffblue")
    @MethodsUnderTest({"City CityController.update(City)"})
    void testUpdate() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "com.gpsfishing.service.CityService.update(com.gpsfishing.model.City)" because "this.cityService" is null
        //       at com.gpsfishing.controller.CityController.update(CityController.java:43)
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange
        CityController cityController = new CityController();

        Country country = new Country();
        country.setCodeDdi("Code Ddi");
        country.setId(1L);
        country.setName("Name");

        Country country2 = new Country();
        country2.setCodeDdi("Code Ddi");
        country2.setId(1L);
        country2.setName("Name");

        State state = new State();
        state.setCountry(country2);
        state.setDescription("The characteristics of someone or something");
        state.setId(1L);
        state.setUf("Uf");

        City city = new City();
        city.setCodeDdd("Code Ddd");
        city.setCountry(country);
        city.setId(1L);
        city.setName("Name");
        city.setState(state);

        // Act
        cityController.update(city);
    }

    /**
     * Test {@link CityController#update(City)}.
     * <p>
     * Method under test: {@link CityController#update(City)}
     */
    @Test
    @DisplayName("Test update(City)")
    @Disabled("TODO: Complete this test")
    @Tag("MaintainedByDiffblue")
    void testUpdate2() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at com.gpsfishing.controller.CityController.update(CityController.java:43)
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange
        CityController cityController = new CityController();

        Country country = new Country();
        country.setCodeDdi("Code Ddi");
        country.setId(1L);
        country.setName("Name");

        Country country2 = new Country();
        country2.setCodeDdi("Code Ddi");
        country2.setId(1L);
        country2.setName("Name");

        State state = new State();
        state.setCountry(country2);
        state.setDescription("The characteristics of someone or something");
        state.setId(1L);
        state.setUf("Uf");

        City city = new City();
        city.setCodeDdd("Code Ddd");
        city.setCountry(country);
        city.setId(1L);
        city.setName("Name");
        city.setState(state);

        // Act
        cityController.update(city);
    }

    /**
     * Test {@link CityController#update(City)}.
     * <p>
     * Method under test: {@link CityController#update(City)}
     */
    @Test
    @DisplayName("Test update(City)")
    @Tag("MaintainedByDiffblue")
    @MethodsUnderTest({"City CityController.update(City)"})
    void testUpdate3() {
        // Arrange
        Country country = new Country();
        country.setCodeDdi("Code Ddi");
        country.setId(1L);
        country.setName("Name");

        Country country2 = new Country();
        country2.setCodeDdi("Code Ddi");
        country2.setId(1L);
        country2.setName("Name");

        State state = new State();
        state.setCountry(country2);
        state.setDescription("The characteristics of someone or something");
        state.setId(1L);
        state.setUf("Uf");

        City city = new City();
        city.setCodeDdd("Code Ddd");
        city.setCountry(country);
        city.setId(1L);
        city.setName("Name");
        city.setState(state);
        when(cityService.update(Mockito.<City>any())).thenReturn(city);

        Country country3 = new Country();
        country3.setCodeDdi("Code Ddi");
        country3.setId(1L);
        country3.setName("Name");

        Country country4 = new Country();
        country4.setCodeDdi("Code Ddi");
        country4.setId(1L);
        country4.setName("Name");

        State state2 = new State();
        state2.setCountry(country4);
        state2.setDescription("The characteristics of someone or something");
        state2.setId(1L);
        state2.setUf("Uf");

        City city2 = new City();
        city2.setCodeDdd("Code Ddd");
        city2.setCountry(country3);
        city2.setId(1L);
        city2.setName("Name");
        city2.setState(state2);

        // Act
        City actualUpdateResult = cityController.update(city2);

        // Assert
        verify(cityService).update(isA(City.class));
        assertSame(city, actualUpdateResult);
    }

    /**
     * Test {@link CityController#delete(City)}.
     * <p>
     * Method under test: {@link CityController#delete(City)}
     */
    @Test
    @DisplayName("Test delete(City)")
    @Disabled("TODO: Complete this test")
    @Tag("MaintainedByDiffblue")
    @MethodsUnderTest({"void CityController.delete(City)"})
    void testDelete() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "com.gpsfishing.service.CityService.delete(com.gpsfishing.model.City)" because "this.cityService" is null
        //       at com.gpsfishing.controller.CityController.delete(CityController.java:48)
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange
        CityController cityController = new CityController();

        Country country = new Country();
        country.setCodeDdi("Code Ddi");
        country.setId(1L);
        country.setName("Name");

        Country country2 = new Country();
        country2.setCodeDdi("Code Ddi");
        country2.setId(1L);
        country2.setName("Name");

        State state = new State();
        state.setCountry(country2);
        state.setDescription("The characteristics of someone or something");
        state.setId(1L);
        state.setUf("Uf");

        City city = new City();
        city.setCodeDdd("Code Ddd");
        city.setCountry(country);
        city.setId(1L);
        city.setName("Name");
        city.setState(state);

        // Act
        cityController.delete(city);
    }

    /**
     * Test {@link CityController#delete(City)}.
     * <p>
     * Method under test: {@link CityController#delete(City)}
     */
    @Test
    @DisplayName("Test delete(City)")
    @Disabled("TODO: Complete this test")
    @Tag("MaintainedByDiffblue")
    void testDelete2() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at com.gpsfishing.controller.CityController.delete(CityController.java:48)
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange
        CityController cityController = new CityController();

        Country country = new Country();
        country.setCodeDdi("Code Ddi");
        country.setId(1L);
        country.setName("Name");

        Country country2 = new Country();
        country2.setCodeDdi("Code Ddi");
        country2.setId(1L);
        country2.setName("Name");

        State state = new State();
        state.setCountry(country2);
        state.setDescription("The characteristics of someone or something");
        state.setId(1L);
        state.setUf("Uf");

        City city = new City();
        city.setCodeDdd("Code Ddd");
        city.setCountry(country);
        city.setId(1L);
        city.setName("Name");
        city.setState(state);

        // Act
        cityController.delete(city);
    }

    /**
     * Test {@link CityController#delete(City)}.
     * <p>
     * Method under test: {@link CityController#delete(City)}
     */
    @Test
    @DisplayName("Test delete(City)")
    @Tag("MaintainedByDiffblue")
    @MethodsUnderTest({"void CityController.delete(City)"})
    void testDelete3() {
        // Arrange
        doNothing().when(cityService).delete(Mockito.<City>any());

        Country country = new Country();
        country.setCodeDdi("Code Ddi");
        country.setId(1L);
        country.setName("Name");

        Country country2 = new Country();
        country2.setCodeDdi("Code Ddi");
        country2.setId(1L);
        country2.setName("Name");

        State state = new State();
        state.setCountry(country2);
        state.setDescription("The characteristics of someone or something");
        state.setId(1L);
        state.setUf("Uf");

        City city = new City();
        city.setCodeDdd("Code Ddd");
        city.setCountry(country);
        city.setId(1L);
        city.setName("Name");
        city.setState(state);

        // Act
        cityController.delete(city);

        // Assert
        verify(cityService).delete(isA(City.class));
    }

    /**
     * Test {@link CityController#deleteById(Long)}.
     * <p>
     * Method under test: {@link CityController#deleteById(Long)}
     */
    @Test
    @DisplayName("Test deleteById(Long)")
    @Disabled("TODO: Complete this test")
    @Tag("MaintainedByDiffblue")
    @MethodsUnderTest({"void CityController.deleteById(Long)"})
    void testDeleteById() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "com.gpsfishing.service.CityService.deleteById(java.lang.Long)" because "this.cityService" is null
        //       at com.gpsfishing.controller.CityController.deleteById(CityController.java:53)
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange and Act
        (new CityController()).deleteById(1L);
    }

    /**
     * Test {@link CityController#deleteById(Long)}.
     * <p>
     * Method under test: {@link CityController#deleteById(Long)}
     */
    @Test
    @DisplayName("Test deleteById(Long)")
    @Disabled("TODO: Complete this test")
    @Tag("MaintainedByDiffblue")
    void testDeleteById2() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at com.gpsfishing.controller.CityController.deleteById(CityController.java:53)
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange and Act
        (new CityController()).deleteById(1L);
    }

    /**
     * Test {@link CityController#deleteById(Long)}.
     * <p>
     * Method under test: {@link CityController#deleteById(Long)}
     */
    @Test
    @DisplayName("Test deleteById(Long)")
    @Tag("MaintainedByDiffblue")
    @MethodsUnderTest({"void CityController.deleteById(Long)"})
    void testDeleteById3() {
        // Arrange
        doNothing().when(cityService).deleteById(Mockito.<Long>any());

        // Act
        cityController.deleteById(1L);

        // Assert
        verify(cityService).deleteById(eq(1L));
    }
}
