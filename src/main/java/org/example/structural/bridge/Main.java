package org.example.structural.bridge;

import org.example.structural.bridge.color.Blue;
import org.example.structural.bridge.color.Yellow;
import org.example.structural.bridge.shape.Circle;
import org.example.structural.bridge.shape.Shape;
import org.example.structural.bridge.shape.Triangle;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Shape> shapes = new ArrayList<>();
        shapes.add(new Triangle(new Yellow(), "triangle", 3, 4, 5));
        shapes.add(new Circle(new Blue(), "circle", 4.5));
        shapes.add(new Triangle(new Blue(), "triangle", 13, 7, 8));
        shapes.add(new Circle(new Yellow(), "circle", 7));
        shapes.forEach(Shape::printState);
    }
}
