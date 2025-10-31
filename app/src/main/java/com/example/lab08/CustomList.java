package com.example.lab08;

import java.util.ArrayList;
import java.util.List;

public class CustomList {
    private List<City> cities;

    public CustomList() {
        this.cities = new ArrayList<>();
    }

    public int getCount() {
        return cities.size();
    }

    public void addCity(City city) {
        // intentionally left blank for TDD demonstration
    }

    public boolean hasCity(City city) {
        return false;
    }

    public void deleteCity(City city) {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    public int countCities() {
        return 0;
    }
}
