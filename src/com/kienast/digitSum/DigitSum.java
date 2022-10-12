package com.kienast.digitSum;

public class DigitSum {

    public static int sumDigits(int number) {
        if (number < 10) {
            System.out.println("Invalid input");
            return -1;
        }

        int sum = 0;

        // get least significant digit
        // 125 / 10 = 12
        // 12 * 10 = 120
        // 125 - 120 = 5
        // drop least significant digit
        // number = number / 10
        while(number > 0) {
            int digit = number % 10;
            sum += digit;
            number /= 10;
        }

        System.out.println("The sum of the digits is: " +  sum);
        return sum;
    }

}
