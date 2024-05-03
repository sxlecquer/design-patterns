package org.example.structural.composite;

import org.example.structural.composite.box.CompositeBox;
import org.example.structural.composite.box.product.Book;
import org.example.structural.composite.box.product.Toy;
import org.example.structural.composite.service.DeliveryService;

public class Main {
    public static void main(String[] args) {
        DeliveryService deliveryService = new DeliveryService();

        deliveryService.setUpOrder(new CompositeBox(new CompositeBox(new Toy("Dinosaur", 15), new Book("Innovators", 10.99)),
                new Book("The Bad Apple", 13.49)),
                new CompositeBox(new Toy("Gengar", 22.99)),
                new Toy("Lego", 34));

        System.out.println("Order cost is " + deliveryService.getOrderPrice() + "$ (including delivery cost)");
    }
}
