package com.kienast.largestPrime;

public class LargestPrime {

    public static int getLargestPrime(int number) {
        if (number < 0) {
            System.out.println("Invalid input");
            return -1;
        }

        int largestPrime = -1;

        for (int i = 2; i < number; i++) {
            if ((number % i == 0) && (i > largestPrime) && (isPrime(i))) {
                largestPrime = i;
            }
        }

        System.out.println(largestPrime);
        return largestPrime;
    }

    public static boolean isPrime(int number) {
        for (int i = 2; i < number; i++) {
            if (number % i == 0)
                return false;
        }
        return true;
    }

}
