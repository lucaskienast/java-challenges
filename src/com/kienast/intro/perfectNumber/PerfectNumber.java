package com.kienast.intro.perfectNumber;

public class PerfectNumber {

    public static boolean isPerfectNumber(int number) {
        if (number < 1) {
            System.out.println("Invalid input");
            return false;
        }

        int sumOfFactors = 0;

        for (int i = 1; i < number; i ++) {
            if (number % i == 0)
                sumOfFactors += i;
        }

        if (sumOfFactors == number) {
            System.out.println("Is perfect number");
            return true;
        }

        System.out.println("Is not perfect number");
        return false;
    }

}
