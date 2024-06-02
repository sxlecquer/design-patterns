package org.example.behavioral.visitor.shape;

import org.example.behavioral.visitor.visitors.Visitor;

import java.util.ArrayList;
import java.util.List;

public class CompoundShape implements Shape {
    private final int id;
    private final List<Shape> children = new ArrayList<>();

    public CompoundShape(int id) {
        this.id = id;
    }

    @Override
    public void move(int dx, int dy) {
        System.out.println("Moving compound shape by " + dx + " units on X axis and by " + dy + " units on Y axis!");
    }

    @Override
    public void draw() {
        System.out.println("Drawing a compound shape!");
    }

    @Override
    public String accept(Visitor visitor) {
        return visitor.visitCompoundShape(this);
    }

    public void add(Shape shape) {
        children.add(shape);
    }

    public int getId() {
        return id;
    }

    public List<Shape> getChildren() {
        return children;
    }
}
