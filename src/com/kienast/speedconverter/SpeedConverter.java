package com.kienast.speedconverter;

public class SpeedConverter {

    public static long toMilesPerHour(double kilometersPerHour) {
        if (kilometersPerHour < 0)
            return -1;

        return Math.round(kilometersPerHour * 0.621371);
    }

    public static void printConversion(double kilometersPerHour) {
        if (kilometersPerHour < 0) {
            System.out.println("Invalid value");
            return;
        }

        long milesPerHour = toMilesPerHour(kilometersPerHour);
        System.out.println(Math.round(kilometersPerHour) + " km/h = " + milesPerHour + " mi/h");
    }

}
