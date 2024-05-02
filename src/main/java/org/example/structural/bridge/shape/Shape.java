package org.example.structural.bridge.shape;

import org.example.structural.bridge.color.Color;

// Abstraction hierarchy
public abstract class Shape {
    private final Color color; // being in aggregation with implementation hierarchy
    private final String name;

    public Shape(Color color, String name) {
        this.color = color;
        this.name = name;
    }

    public void printState() {
        System.out.println("This is a " + color.fill().toLowerCase() + " " + name);
        System.out.printf("Its perimeter is %.2f%n", calculatePerimeter());
        System.out.printf("The area is %.2f%n%n", calculateArea());
    }

    public abstract double calculatePerimeter();
    public abstract double calculateArea();
}
