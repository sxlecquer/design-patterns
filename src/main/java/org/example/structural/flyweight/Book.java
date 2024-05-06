package org.example.structural.flyweight;

// context class (extrinsic-mutable state)
@SuppressWarnings("unused")
public class Book {
    private String name;
    private double price;
    private BookType bookType;

    public Book(String name, double price, BookType bookType) {
        this.name = name;
        this.price = price;
        this.bookType = bookType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public BookType getBookType() {
        return bookType;
    }

    public void setBookType(BookType bookType) {
        this.bookType = bookType;
    }

    @Override
    public String toString() {
        String formattedPrice = String.format("%.2f", price).replace(",", ".");
        return String.format("Book{name='%s', price=%s, genre='%s', distributor='%s', condition='%s'}",
                name, formattedPrice, bookType.genre(), bookType.distributor(), bookType.condition());
    }
}
