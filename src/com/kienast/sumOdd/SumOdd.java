package com.kienast.sumOdd;

public class SumOdd {

    private static boolean isOdd(int number) {
        if (number < 0)
            return false;

        return number % 2 != 0;
    }


    public static int sumOdd(int start, int end) {
        if ((start < 0) || (end < 0) || (start > end)) {
            System.out.println("Invalid inputs");
            return -1;
        }

        int sum = 0;

        for (int i = start; i <= end; i++) {
            if (isOdd(i))
                sum += i;
        }

        System.out.println("Sum of odd numbers between " + start + " and " + end + " is " + sum);
        return sum;
    }

}
