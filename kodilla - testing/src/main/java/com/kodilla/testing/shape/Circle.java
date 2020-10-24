package com.kodilla.testing.shape;

public class Circle implements Shape {

    String shapeName;
    double field;


    public Circle(double radius) {
        this.shapeName = "Circle";
        this.field = Math.PI * radius * radius;
    }

    public String getShapeName() {
        return this.shapeName;
    }

    public double getField() {
        return this.field;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "shapeName='" + shapeName + '\'' +
                ", field=" + field +
                '}';
    }
}
