package com.kienast.intro.diagonalStar;

public class DiagonalStar {

    public static void printSquareStar(int number) {
        if (number < 5)
            System.out.println("Invalid input");

        for (int i = 1; i <= number; i++) {
            for (int j = 1; j <= number; j++) {
                if ((i == 1)
                        || (j == 1)
                        || (i == j)
                        || (i == number)
                        || (j == number)) {
                    System.out.print("*");
                    continue;
                }
                else if (j == (number - i + 1)) {
                    System.out.print("*");
                    continue;
                }

                System.out.print(" ");
            }
            System.out.println();
        }
    }

}
