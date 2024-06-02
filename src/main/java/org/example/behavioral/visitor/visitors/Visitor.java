package org.example.behavioral.visitor.visitors;

import org.example.behavioral.visitor.shape.Circle;
import org.example.behavioral.visitor.shape.CompoundShape;
import org.example.behavioral.visitor.shape.Rectangle;

public interface Visitor {
    String visitCircle(Circle circle);
    String visitRectangle(Rectangle rectangle);
    String visitCompoundShape(CompoundShape compoundShape);
}
