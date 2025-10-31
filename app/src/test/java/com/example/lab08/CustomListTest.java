package com.example.lab08;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
public class CustomListTest {

    @Test
    void hasCityReturnsTrueForStoredCity() {
        CustomList list = new CustomList();
        City city = new City("Edmonton", "AB");
        list.addCity(city);

        assertTrue(list.hasCity(city));
    }

    @Test
    void hasCityReturnsFalseForMissingCity() {
        CustomList list = new CustomList();
        City stored = new City("Edmonton", "AB");
        City missing = new City("Calgary", "AB");
        list.addCity(stored);

        assertFalse(list.hasCity(missing));
    }

    @Test
    void deleteCityRemovesStoredCity() {
        CustomList list = new CustomList();
        City first = new City("Edmonton", "AB");
        City second = new City("Calgary", "AB");
        list.addCity(first);
        list.addCity(second);

        list.deleteCity(first);

        assertFalse(list.hasCity(first));
        assertTrue(list.hasCity(second));
    }

    @Test
    void countCitiesReflectsListSize() {
        CustomList list = new CustomList();
        assertEquals(0, list.countCities());

        list.addCity(new City("Edmonton", "AB"));
        list.addCity(new City("Calgary", "AB"));

        assertEquals(2, list.countCities());
    }
}
