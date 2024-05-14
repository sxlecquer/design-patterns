package org.example.behavioral.iterator.iterators;

import org.example.behavioral.iterator.iterable.CityCollection;

import java.util.NoSuchElementException;

public class CityIterator implements GeoIterator<String> {
    private final CityCollection cityCollection;
    private int position;

    public CityIterator(CityCollection cityCollection) {
        this.cityCollection = cityCollection;
    }

    @Override
    public boolean hasNext() {
        return position < cityCollection.size();
    }

    @Override
    public String getNext() {
        if(!hasNext()) throw new NoSuchElementException("There are no more cities to traverse.");
        return cityCollection.get(position++);
    }
}
