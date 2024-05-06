package org.example.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class BookFactory {
    private static final Map<String, BookType> CACHE = new HashMap<>();

    public static BookType getBookType(String genre, String distributor, String condition) {
        BookType bookType = CACHE.get(genre);
        if(bookType == null) {
            bookType = new BookType(genre, distributor, condition);
            CACHE.put(genre, bookType);
        }
        return bookType;
    }
}
