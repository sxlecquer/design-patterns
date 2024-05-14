package org.example.behavioral.iterator.iterable;

import org.example.behavioral.iterator.iterators.CityIterator;

import java.util.ArrayList;
import java.util.List;

public class CityCollection implements GeoIterable<String> {
    private final List<String> cities = new ArrayList<>();

    @Override
    public CityIterator geoIterator() {
        return new CityIterator(this);
    }

    public void add(String city) {
        cities.add(city);
    }

    public String get(int index) {
        return cities.get(index);
    }

    public int size() {
        return cities.size();
    }
}
