package com.kienast.intro.greatestCommonDivisor;

public class GreatestCommonDivisor {

    public static int getGreatestCommonDivisor(int a, int b) {
        if ((a < 10) || (b < 10)) {
            System.out.println("Invalid input");
            return -1;
        }

        int smallerNumber = Math.min(a, b);
        int largerNumber = Math.max(a, b);

        for (int i = smallerNumber; i >= 1; i--) {
            if ((smallerNumber % i == 0) && (largerNumber % i == 0)) {
                System.out.println("The greatest common divisor is: " + i);
                return i;
            }
        }

        System.out.println("Something went wrong");
        return -1;
    }

}
