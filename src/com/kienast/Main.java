package com.kienast;

import static com.kienast.areaCalculator.AreaCalculator.area;
import static com.kienast.decimalComparator.DecimalComparator.areEqualByThreeDecimalPlaces;
import static com.kienast.equalSumChecker.EqualSumChecker.hasEqualSum;

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


        // Q4: Leap year calculator
        /*
        isLeapYear(1700); // false
        isLeapYear(1800); // false
        isLeapYear(1900); // false

        isLeapYear(1600); // true
        isLeapYear(2000); // true
        isLeapYear(2400); // true
         */


        // Q5: Decimal comparator
        /*
        areEqualByThreeDecimalPlaces(-3.1756, -3.175);
        areEqualByThreeDecimalPlaces(3.175, 3.176);
         */


        // Q6: Equal sum checker
        /*
        hasEqualSum(1, 1, 1);
        hasEqualSum(1, 1, 2);
        hasEqualSum(1, -1, 0);
         */


        // Q7: Area calculator
        area(5.0);
        area(-1.0);
        area(5.0, 4.0);
        area(-1.0, 4.0);

    }
}
