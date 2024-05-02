package org.example.structural.bridge.shape;

import org.example.structural.bridge.color.Color;

public class Circle extends Shape {
    private final double radius;

    public Circle(Color color, String name, double radius) {
        super(color, name);
        this.radius = radius;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * Math.pow(radius, 2);
    }
}
