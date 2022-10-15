package com.kienast.intro.getEvenDigitSum;

public class EvenDigitSum {

    public static int getEvenDigitSum(int number) {
        if (number < 0) {
            System.out.println("Invalid input");
            return -1;
        }

        int sum = 0;

        while(number > 0) {
            int digit = number % 10;

            if (digit % 2 == 0)
                sum += digit;

            number /= 10;
        }

        System.out.println("The sum is: " + sum);
        return sum;
    }

}
