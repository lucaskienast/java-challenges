package com.kienast;

import static com.kienast.barkingdog.BarkingDog.shouldWakeUp;
import static com.kienast.megabytesconverter.MegaBytesConverter.printMegaBytesAndKiloBytes;
import static com.kienast.speedconverter.SpeedConverter.printConversion;
import static com.kienast.speedconverter.SpeedConverter.toMilesPerHour;

public class Main {

    public static void main(String[] args) {

        // Q1: Speed converter
        /*
        System.out.println("100 km/h = " + toMilesPerHour(100d) + " mi/h");
        printConversion(100d);
         */


        // Q2: Megabytes converter
        // printMegaBytesAndKiloBytes(2500);


        // Q3: Barking dog
        /*
        shouldWakeUp(true, 1);
        shouldWakeUp(false, 2);
        shouldWakeUp(true, 8);
        shouldWakeUp(true, -1);
         */


    }
}
