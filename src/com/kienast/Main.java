package com.kienast;

import static com.kienast.allFactors.AllFactors.printFactors;
import static com.kienast.areaCalculator.AreaCalculator.area;
import static com.kienast.decimalComparator.DecimalComparator.areEqualByThreeDecimalPlaces;
import static com.kienast.digitSum.DigitSum.sumDigits;
import static com.kienast.equalSumChecker.EqualSumChecker.hasEqualSum;
import static com.kienast.firstAndLastDigitSum.FirstAndLastDigitSum.sumFirstAndLastDigit;
import static com.kienast.getEvenDigitSum.EvenDigitSum.getEvenDigitSum;
import static com.kienast.greatestCommonDivisor.GreatestCommonDivisor.getGreatestCommonDivisor;
import static com.kienast.lastDigitChecker.LastDigitChecker.hasSameLastDigit;
import static com.kienast.minutesToYearsAndDays.MinutesToYearsAndDays.printYearsAndDays;
import static com.kienast.numberOfDaysInMonth.NumberOfDaysInMonth.getDaysInMonth;
import static com.kienast.numberPalindrome.NumberPalindrome.isPalindrome;
import static com.kienast.numberToWords.NumberToWords.numberToWords;
import static com.kienast.perfectNumber.PerfectNumber.isPerfectNumber;
import static com.kienast.playingCats.PlayingCats.isCatPlaying;
import static com.kienast.sharedDigit.SharedDigit.hasSharedDigit;
import static com.kienast.sumOdd.SumOdd.sumOdd;

public class Main {

    public static void main(String[] args) {

        // Q1: Speed converter
        /*
        System.out.println("100 km/h = " + toMilesPerHour(100d) + " mi/h");
        printConversion(100d);
         */


        // Q2: Megabytes converter
        // printMegaBytesAndKiloBytes(2500);


        // Q3: Barking dog
        /*
        shouldWakeUp(true, 1);
        shouldWakeUp(false, 2);
        shouldWakeUp(true, 8);
        shouldWakeUp(true, -1);
         */


        // Q4: Leap year calculator
        /*
        isLeapYear(1700); // false
        isLeapYear(1800); // false
        isLeapYear(1900); // false

        isLeapYear(1600); // true
        isLeapYear(2000); // true
        isLeapYear(2400); // true
         */


        // Q5: Decimal comparator
        /*
        areEqualByThreeDecimalPlaces(-3.1756, -3.175);
        areEqualByThreeDecimalPlaces(3.175, 3.176);
         */


        // Q6: Equal sum checker
        /*
        hasEqualSum(1, 1, 1);
        hasEqualSum(1, 1, 2);
        hasEqualSum(1, -1, 0);
         */


        // Q7: Area calculator
        /*
        area(5.0);
        area(-1.0);
        area(5.0, 4.0);
        area(-1.0, 4.0);
         */


        // Q8: Minutes to years and days
        /*
        printYearsAndDays(-1);
        printYearsAndDays(525600);
        printYearsAndDays(1051200);
        printYearsAndDays(561600);
         */


        // Q9: Playing cats
        /*
        isCatPlaying(true, 10);
        isCatPlaying(false, 36);
        isCatPlaying(false, 35);
         */


        // Q10: Number of days
        /*
        getDaysInMonth(1, 2020);
        getDaysInMonth(2, 2020);
        getDaysInMonth(2, 2018);
        getDaysInMonth(-1, 2020);
        getDaysInMonth(1, -2020);
         */


        // Q11: Sum odd
        /*
        sumOdd(1, 100);
        sumOdd(-1, 100);
        sumOdd(100, 100);
        sumOdd(13, 13);
        sumOdd(100, -100);
        sumOdd(100, 1000);
         */


        // Q12: Sum digits
        /*
        sumDigits(125);
        sumDigits(-1);
         */


        // Q13: Number palindrome
        /*
        isPalindrome(11);
        isPalindrome(121);
        isPalindrome(1221);
        isPalindrome(12321);
        isPalindrome(1);
        isPalindrome(211);
        isPalindrome(1121);
        isPalindrome(11421);
         */


        // Q14: First and last digit sum
        /*
        sumFirstAndLastDigit(252);
        sumFirstAndLastDigit(1000001);
        sumFirstAndLastDigit(0);
        sumFirstAndLastDigit(5);
        sumFirstAndLastDigit(-10);
         */


        // Q15: Even digit sum
        /*
        getEvenDigitSum(123456789);
        getEvenDigitSum(252);
        getEvenDigitSum(-22);
         */


        // Q16: Shared digit
        /*
        hasSharedDigit(12, 23);
        hasSharedDigit(9, 99);
        hasSharedDigit(15, 55);
        hasSharedDigit(24, 67);
         */


        // Q17: Last digit checker
        /*
        hasSameLastDigit(41, 22, 71);
        hasSameLastDigit(23, 32, 42);
        hasSameLastDigit(9, 99, 999);
         */


        // Q18: Greatest common divisor
        /*
        getGreatestCommonDivisor(25, 15);
        getGreatestCommonDivisor(12, 30);
        getGreatestCommonDivisor(9, 18);
        getGreatestCommonDivisor(81, 153);
         */

        // Q19: All factors
        /*
        printFactors(6);
        printFactors(32);
        printFactors(10);
        printFactors(-1);
         */


        // Q20: Perfect number
        /*
        isPerfectNumber(6);
        isPerfectNumber(28);
        isPerfectNumber(5);
        isPerfectNumber(-1);
         */


        // Q21: Number to words
        numberToWords(123);
        numberToWords(509);
        numberToWords(-1);

    }
}
