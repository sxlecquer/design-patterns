package org.example.structural.flyweight;

import java.util.Random;

public class Main {
    private static final int NUMBER_OF_BOOKS = 1_000_000;
    private static final int BOOK_TYPES = 2;
    private static final String[] BOOK_TITLES = {"The Adventures of Tom Sawyer", "The Catcher in the Rye", "To Kill a Mockingbird", "The Great Gatsby", "Harry Potter and the Sorcerer's Stone", "1984", "Animal Farm", "Adventure Time", "Pride and Prejudice", "The Hobbit", "The Lord of the Rings", "Moby-Dick"};
    private static final Random RANDOM = new Random();

    public static void main(String[] args) {
        Store store = new Store();
        for(int i = 0; i < NUMBER_OF_BOOKS / BOOK_TYPES; i++) {
            store.storeBook(generateBookName(), generatePrice(), "Adventure", "Finn", "new");
            store.storeBook(generateBookName(), generatePrice(), "Thriller", "Jake", "used");
        }
        store.displayBooks();
        System.out.println();
        printMemoryStatistics();
    }

    private static void printMemoryStatistics() {
        System.out.println(NUMBER_OF_BOOKS + " books have been stored");
        System.out.println("-------------------------");
        System.out.println("Memory usage:");
        System.out.println("Book size (20 bytes) * " + NUMBER_OF_BOOKS + " + BookType size (30 bytes) * " + BOOK_TYPES);
        System.out.println("-------------------------");
        int optimized = (20 * NUMBER_OF_BOOKS + 30 * BOOK_TYPES) / 1024 / 1024;
        int inefficient = 50 * NUMBER_OF_BOOKS / 1024 / 1024;
        System.out.println("Total: " + optimized + "MB (instead of " + inefficient + "MB)");
    }

    private static String generateBookName() {
        return BOOK_TITLES[RANDOM.nextInt(BOOK_TITLES.length)];
    }

    private static double generatePrice() {
        return RANDOM.nextDouble(10, 100);
    }
}
