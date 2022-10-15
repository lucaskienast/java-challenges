package com.kienast.intro.numberPalindrome;

public class NumberPalindrome {

    public static boolean isPalindrome(int number) {
        if (number < 10) {
            System.out.println("Invalid input");
            return false;
        }

        int reverse = 0;
        int original = number;

        while(number > 0) {
            int lastDigit = number % 10;
            reverse = reverse * 10 + lastDigit;
            number /= 10;
        }

        if (original == reverse) {
            System.out.println("The number " + original + " is a palindrome.");
            return true;
        }

        System.out.println("The number " + original + " is not a palindrome.");
        return false;
    }

}
