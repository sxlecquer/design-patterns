package org.example.behavioral.visitor.visitors;

import org.example.behavioral.visitor.shape.Circle;
import org.example.behavioral.visitor.shape.CompoundShape;
import org.example.behavioral.visitor.shape.Rectangle;
import org.example.behavioral.visitor.shape.Shape;

public class XMLExportVisitor implements Visitor {

    public String export(Shape... shapes) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("<?xml version=\"1.0\" encoding=\"utf-8\"?>\n");
        for(Shape shape : shapes) {
            stringBuilder.append(shape.accept(this)).append("\n\n");
        }
        return stringBuilder.toString();
    }

    @Override
    public String visitCircle(Circle circle) {
        return "<circle>" + "\n" +
                "\t<id>" + circle.id() + "</id>" + "\n" +
                "\t<x>" + circle.x() + "</x>" + "\n" +
                "\t<y>" + circle.y() + "</y>" + "\n" +
                "\t<radius>" + circle.radius() + "</radius>" + "\n" +
                "</circle>";
    }

    @Override
    public String visitRectangle(Rectangle rectangle) {
        return "<rectangle>" + "\n" +
                "\t<id>" + rectangle.id() + "</id>" + "\n" +
                "\t<x>" + rectangle.x() + "</x>" + "\n" +
                "\t<y>" + rectangle.y() + "</y>" + "\n" +
                "\t<width>" + rectangle.width() + "</width>" + "\n" +
                "\t<height>" + rectangle.height() + "</height>" + "\n" +
                "</rectangle>";
    }

    @Override
    public String visitCompoundShape(CompoundShape compoundShape) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("<compound_shape>\n")
                .append("\t<id>")
                .append(compoundShape.getId())
                .append("</id>\n");

        for(Shape shape : compoundShape.getChildren()) {
            stringBuilder.append("\t")
                    .append(shape.accept(this).replaceAll("\n", "\n\t"))
                    .append("\n");
        }
        stringBuilder.append("</compound_shape>");

        return stringBuilder.toString();
    }
}
