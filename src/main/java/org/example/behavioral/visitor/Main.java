package org.example.behavioral.visitor;

import org.example.behavioral.visitor.shape.Circle;
import org.example.behavioral.visitor.shape.CompoundShape;
import org.example.behavioral.visitor.shape.Rectangle;
import org.example.behavioral.visitor.visitors.XMLExportVisitor;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(1, 5, 4, 7);
        Rectangle rectangle = new Rectangle(2, 17, 23, 6, 8);

        CompoundShape compoundShape = new CompoundShape(4);
        compoundShape.add(circle);
        compoundShape.add(rectangle);

        CompoundShape c = new CompoundShape(3);
        c.add(circle);
        compoundShape.add(c);

        XMLExportVisitor visitor = new XMLExportVisitor();
        System.out.println(visitor.export(circle, rectangle, compoundShape));
    }
}
