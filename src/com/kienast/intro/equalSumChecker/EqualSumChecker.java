package com.kienast.intro.equalSumChecker;

public class EqualSumChecker {

    public static boolean hasEqualSum(int a, int b, int c) {
        if ((a + b) == c) {
            System.out.println("a + b = c");
            return true;
        }

        System.out.println("a + b != c");
        return false;
    }

}
