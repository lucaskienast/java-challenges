package com.kienast;

import static com.kienast.speedconverter.SpeedConverter.printConversion;
import static com.kienast.speedconverter.SpeedConverter.toMilesPerHour;

public class Main {

    public static void main(String[] args) {

        // Speed converter
        System.out.println("100 km/h = " + toMilesPerHour(100d) + " mi/h");
        printConversion(100d);
    }
}
