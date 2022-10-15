package com.kienast.intro.firstAndLastDigitSum;

public class FirstAndLastDigitSum {

    public static int sumFirstAndLastDigit(int number) {
        if (number < 0) {
            System.out.println("Invalid input");
            return -1;
        }

        int sum = 0;
        int original = number;

        while (number > 0) {
            int lastDigit = number % 10;

            if (original == number || number < 10)
                sum += lastDigit;

            number /= 10;
        }

        System.out.println("The sum of the first and last digit is: " + sum);
        return sum;
    }

}
