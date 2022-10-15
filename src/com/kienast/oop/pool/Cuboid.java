package com.kienast.oop.pool;

public class Cuboid extends Rectangle {

    private double height;

    public Cuboid() {
        this(0, 0, 0);
    }

    public Cuboid(double width, double length, double height) {
        super(width, length);
        this.height = (height < 0 ) ? 0 : height;
    }

    public double getVolume() {
        return this.getArea() * this.getHeight();
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = (height < 0 ) ? 0 : height;
    }

    @Override
    public String toString() {
        return "Cuboid{" +
                "height=" + height +
                '}';
    }
}
