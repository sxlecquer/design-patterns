package org.example.behavioral.visitor.visitors;

import org.example.behavioral.visitor.shape.Circle;
import org.example.behavioral.visitor.shape.CompoundShape;
import org.example.behavioral.visitor.shape.Rectangle;

public class XMLExportVisitor implements Visitor {
    @Override
    public String visitCircle(Circle circle) {
        return "<circle>" + "\n" +
                "    <id>" + circle.id() + "</id>" + "\n" +
                "    <x>" + circle.x() + "</x>" + "\n" +
                "    <y>" + circle.y() + "</y>" + "\n" +
                "    <radius>" + circle.radius() + "</radius>" + "\n" +
                "</circle>";
    }

    @Override
    public String visitRectangle(Rectangle rectangle) {
        return "<rectangle>" + "\n" +
                "    <id>" + rectangle.id() + "</id>" + "\n" +
                "    <width>" + rectangle.width() + "</width>" + "\n" +
                "    <height>" + rectangle.height() + "</height>" + "\n" +
                "</rectangle>";
    }

    @Override
    public String visitCompoundShape(CompoundShape compoundShape) {
        return "";
    }
}
