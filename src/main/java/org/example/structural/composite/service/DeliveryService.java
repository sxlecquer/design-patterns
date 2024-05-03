package org.example.structural.composite.service;

import org.example.structural.composite.box.Box;
import org.example.structural.composite.box.CompositeBox;

public class DeliveryService {
    private static final double DELIVERY_COST = 2.99;
    private Box box;

    public void setUpOrder(Box... boxes) {
        box = new CompositeBox(boxes);
    }

    public double getOrderPrice() {
        return box.calculatePrice() + DELIVERY_COST;
    }
}
