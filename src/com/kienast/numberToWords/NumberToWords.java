package com.kienast.numberToWords;

public class NumberToWords {

    public static String numberToWords(int number) {
        if (number < 0)
            return "Invalid input";

        String numberAsText = "";

        while (number > 0) {
            String lastDigitAsText = "";
            int lastDigit = number % 10;
            number /= 10;

            switch (lastDigit) {
                case 0:
                    lastDigitAsText = "zero";
                    break;
                case 1:
                    lastDigitAsText = "one";
                    break;
                case 2:
                    lastDigitAsText = "two";
                    break;
                case 3:
                    lastDigitAsText = "three";
                    break;
                case 4:
                    lastDigitAsText = "four";
                    break;
                case 5:
                    lastDigitAsText = "five";
                    break;
                case 6:
                    lastDigitAsText = "six";
                    break;
                case 7:
                    lastDigitAsText = "seven";
                    break;
                case 8:
                    lastDigitAsText = "eight";
                    break;
                case 9:
                    lastDigitAsText = "nine";
                    break;
                default:
                    lastDigitAsText = "invalid number";
                    break;
            }

            numberAsText = lastDigitAsText + "-" + numberAsText;
        }

        System.out.println(numberAsText);
        return numberAsText;
    }

}
