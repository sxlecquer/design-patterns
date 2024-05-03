package org.example.structural.composite.box.product;

import org.example.structural.composite.box.Box;

public abstract class Product implements Box {
    protected final String title;
    protected final double price;

    public Product(String title, double price) {
        this.title = title;
        this.price = price;
    }
}
