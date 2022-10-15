package com.kienast.intro.decimalComparator;

public class DecimalComparator {

    public static boolean areEqualByThreeDecimalPlaces(double a, double b) {
        int aRounded = (int) (a * 1000);
        int bRounded = (int) (b * 1000);

        if (aRounded == bRounded) {
            System.out.println("The params are equal by at least 3 decimal places!");
            return true;
        }

        System.out.println("The params are not equal by at least 3 decimal places!");
        return false;
    }

}
