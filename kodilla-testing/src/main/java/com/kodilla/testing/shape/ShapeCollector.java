package com.kodilla.testing.shape;

import java.util.ArrayList;
import java.util.List;

public class ShapeCollector {
    private List<Shape> shapes = new ArrayList<>();

    public void addFigure(Shape shape) {
        shapes.add(shape);
    }

    public boolean removeFigure(Shape shape) {
        return shapes.remove(shape);
    }

    public Shape getFigure(int n) {
        return n >= 0 && n < shapes.size() ? shapes.get(n) : null;
    }

    public String showFigures() {
        String figures = "";
        for (Shape shape : shapes) {
            figures = figures + shape.getShapeName() + ", ";
        }
        return figures.substring(0,figures.length()-2);
    }

    public int getQuantity() {
        return shapes.size();
    }
}
