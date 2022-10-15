package com.kienast.intro.inputCalculator;

import java.util.Scanner;

public class InputCalculator {

    public static void inputThenPrintSumAndAverage() {
        Scanner sc = new Scanner(System.in);

        int sum = 0;
        int avg = 0;
        int count = 0;

        while (true) {
            System.out.println("Enter number to continue or smt else to stop");
            boolean isInt = sc.hasNextInt();

            if (isInt) {
                int number = sc.nextInt();
                count++;
                sum += number;
                avg = sum / count;
            } else {
                break;
            }
        }

        System.out.println("Sum: " + sum);
        System.out.println("avg: " + avg);
    }

}
