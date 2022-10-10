package com.kienast.leapyear;

public class LeapYearCalculator {

    public static boolean isLeapYear(int year) {
        if ((year < 1) || (year > 9999)) {
            System.out.println("Invalid input!");
            return false;
        }

        int nextStep;

        if (year % 4 == 0) {
            nextStep = 2;
        } else {
            nextStep = 5;
        }

        if ((nextStep == 2) && (year % 100 == 0)) {
            nextStep = 3;
        } else {
            nextStep = 4;
        }

        if ((nextStep == 3) && (year % 400 == 0)) {
            nextStep = 4;
        }

        if (nextStep == 4) {
            System.out.println("The year " + year + " is a leap year!");
            return true;
        }

        System.out.println("The year " + year + " is not a leap year!");
        return false;
    }

}
