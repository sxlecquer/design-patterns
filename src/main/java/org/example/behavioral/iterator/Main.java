package org.example.behavioral.iterator;

import org.example.behavioral.iterator.iterable.CityCollection;
import org.example.behavioral.iterator.iterators.CityIterator;

public class Main {
    public static void main(String[] args) {
        CityCollection cityCollection = new CityCollection();
        cityCollection.add("Lida");
        cityCollection.add("Wroclaw");
        cityCollection.add("Munich");
        cityCollection.add("Bern");
        cityCollection.add("Los Angeles");

        CityIterator cityIterator = cityCollection.geoIterator();
        while(cityIterator.hasNext()) {
            System.out.println(cityIterator.getNext());
        }
    }
}
