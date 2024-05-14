package org.example.behavioral.iterator.iterable;

import org.example.behavioral.iterator.iterators.GeoIterator;

public interface GeoIterable<T> {
    GeoIterator<T> geoIterator();
}
