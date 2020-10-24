package com.kodilla.testing.shape;

public class Square implements Shape {

    String shapeName;
    double field;


    public Square(double sideLength) {
        this.shapeName = "Square";
        this.field = sideLength * sideLength;
    }

    public String getShapeName() {
        return this.shapeName;
    }

    public double getField() {
        return this.field;
    }

    @Override
    public String toString() {
        return "Square{" +
                "shapeName='" + shapeName + '\'' +
                ", field=" + field +
                '}';
    }
}
