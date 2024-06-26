package org.example.behavioral.visitor.shape;

import org.example.behavioral.visitor.visitors.Visitor;

public record Rectangle(int id, int x, int y, int width, int height) implements Shape {

    @Override
    public void move(int dx, int dy) {
        System.out.println("Moving rectangle by " + dx + " units on X axis and by " + dy + " units on Y axis!");
        System.out.println("Its current location is (" + x() + "; " + y() + ").");
    }

    @Override
    public void draw() {
        System.out.println("Drawing a rectangle!");
    }

    @Override
    public String accept(Visitor visitor) {
        return visitor.visitRectangle(this);
    }
}
