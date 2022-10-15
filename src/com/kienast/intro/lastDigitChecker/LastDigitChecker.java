package com.kienast.intro.lastDigitChecker;

public class LastDigitChecker {

    public static boolean hasSameLastDigit(int a, int b, int c) {
        if ((a < 10) || (b < 10) || (c < 10) || (a >1000) || (b > 1000) || (c > 1000)) {
            System.out.println("Invalid input");
            return false;
        }

        int lastDigitA = a % 10;
        int lastDigitB = b % 10;
        int lastDigitC = c % 10;

        if ((lastDigitA == lastDigitB) || (lastDigitA == lastDigitC) || (lastDigitB == lastDigitC)) {
            System.out.println("Two numbers have the same last digit");
            return true;
        }

        System.out.println("Two numbers do not have the same last digit");
        return false;
    }

}
