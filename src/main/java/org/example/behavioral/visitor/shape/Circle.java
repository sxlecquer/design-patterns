package org.example.behavioral.visitor.shape;

import org.example.behavioral.visitor.visitors.Visitor;

public record Circle(int id, int x, int y, int radius) implements Shape {

    @Override
    public void move(int dx, int dy) {
        System.out.println("Moving circle by " + dx + " units on X axis and by " + dy + " units on Y axis!");
        System.out.println("Its current location is (" + x() + "; " + y() + ").");
    }

    @Override
    public void draw() {
        System.out.println("Drawing a circle!");
    }

    @Override
    public String accept(Visitor visitor) {
        return visitor.visitCircle(this);
    }
}
