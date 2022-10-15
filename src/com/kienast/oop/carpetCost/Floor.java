package com.kienast.oop.carpetCost;

public class Floor {

    private double width;
    private double length;

    public Floor() {
        this(0, 0);
    }

    public Floor(double width, double length) {
        this.width = (width < 0 ) ? 0 : width;
        this.length = (length < 0 ) ? 0 : length;
    }

    public double getArea() {
        return width * length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = (width < 0 ) ? 0 : width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = (length < 0 ) ? 0 : length;
    }

    @Override
    public String toString() {
        return "Carpet{" +
                "width=" + width +
                ", length=" + length +
                '}';
    }
}
