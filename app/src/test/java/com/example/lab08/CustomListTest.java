package com.example.lab08;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
public class CustomListTest {

    private CustomList mockCityList() {
        return new CustomList();
    }

    @Test
    void addCityIncrementsCount() {
        CustomList list = mockCityList();
        int initialSize = list.getCount();
        list.addCity(new City("Estevan", "SK"));

        assertEquals(initialSize + 1, list.getCount());
    }

    @Test
    void hasCityReturnsTrueForStoredCity() {
        CustomList list = mockCityList();
        City city = new City("Edmonton", "AB");
        list.addCity(city);

        assertTrue(list.hasCity(city));
    }
}
