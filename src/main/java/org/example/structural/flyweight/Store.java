package org.example.structural.flyweight;

import java.util.ArrayList;
import java.util.List;

public class Store {
    private final List<Book> books = new ArrayList<>();

    public void storeBook(String name, double price, String genre, String distributor, String condition) {
        BookType bookType = BookFactory.getBookType(genre, distributor, condition);
        books.add(new Book(name, price, bookType));
    }

    public void displayBooks() {
        books.forEach(System.out::println);
    }
}
