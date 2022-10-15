package com.kienast.oop.cylinder;

public class Circle {

    private double radius;

    public Circle() {
        this(0);
    }

    public Circle(double radius) {
        this.radius = (radius < 0 ) ? 0 : radius;
    }

    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = (radius < 0 ) ? 0 : radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
}
