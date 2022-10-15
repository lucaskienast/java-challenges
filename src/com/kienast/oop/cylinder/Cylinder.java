package com.kienast.oop.cylinder;

public class Cylinder extends Circle {

    private double height;

    public Cylinder() {
        this(0, 0);
    }

    public Cylinder(double radius, double height) {
        super(radius);
        this.height = (height < 0 ) ? 0 : height;
    }

    public double getVolume() {
        return this.height * this.getArea();
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "height=" + height +
                '}';
    }
}
