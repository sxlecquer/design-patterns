package org.example.structural.composite.box.product;

public class Toy extends Product {
    public Toy(String title, double price) {
        super(title, price);
    }

    @Override
    public double calculatePrice() {
        return price;
    }
}
