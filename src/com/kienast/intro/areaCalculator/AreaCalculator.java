package com.kienast.intro.areaCalculator;

public class AreaCalculator {

    public static double area(double radius) {
        if (radius < 0) {
            System.out.println("Invalid radius");
            return -1d;
        }

        double area = Math.PI * Math.pow(radius, 2);
        System.out.println("Area of circle with radius=" + radius + " is: " + area);
        return area;
    }

    public static double area(double x, double y) {
        if ((x < 0) || (y < 0)) {
            System.out.println("Invalid x and y values");
            return -1d;
        }

        double area = x * y;
        System.out.println("Area of rectangle with x=" + x + " and y=" + y + " is: " + area);
        return area;
    }

}
