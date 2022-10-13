package com.kienast.allFactors;

public class AllFactors {

    public static void printFactors(int number) {
        if (number < 1)
            System.out.println("Invalid input");

        StringBuilder allFactors = new StringBuilder();

        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                if ((i == number)) {
                    allFactors.append(i);
                } else {
                    allFactors.append(i).append(", ");
                }
            }
        }

        System.out.println(allFactors);
    }

}
