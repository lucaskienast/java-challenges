package com.kienast.intro.sharedDigit;

public class SharedDigit {

    public static boolean hasSharedDigit(int a, int b) {
        if ((a < 10) || (b < 10) || (a > 99) || (b > 99)) {
            System.out.println("Invalid input");
            return false;
        }

        int originalB = b;

        while (a > 0) {
            // get last digit
            int lastDigitA = a % 10;
            a /= 10;

            while (b > 0) {
                // get last digit
                int lastDigitB = b % 10;
                b /= 10;

                if (lastDigitA == lastDigitB) {
                    System.out.println("The shared digit is: " + lastDigitA);
                    return true;
                }
            }

            b = originalB;
        }

        System.out.println("No shared digits");
        return false;
    }

}
