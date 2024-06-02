package org.example.behavioral.visitor.shape;

import org.example.behavioral.visitor.visitors.Visitor;

@SuppressWarnings("unused")
public interface Shape {
    void move(int dx, int dy);
    void draw();
    String accept(Visitor visitor); // usage of Double Dispatch
}
