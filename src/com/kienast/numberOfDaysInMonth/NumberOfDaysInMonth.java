package com.kienast.numberOfDaysInMonth;

import static com.kienast.leapYear.LeapYearCalculator.isLeapYear;

public class NumberOfDaysInMonth {

    public static int getDaysInMonth(int month, int year) {
        if ((month < 1) || (month > 12)) {
            System.out.println("Invalid month");
            return -1;
        }

        if ((year < 1) || (year > 9999)) {
            System.out.println("Invalid year");
            return -1;
        }

        int days;

        switch(month) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                days = 31;
                break;
            case 4: case 6: case 9: case 11:
                days = 30;
                break;
            case 2:
                if (isLeapYear(year)) {
                    days = 29;
                } else {
                    days = 28;
                }
                break;
            default:
                System.out.println("Something went wrong!");
                return -1;
        }

        System.out.println("The month " + month + " in year " + year + " has " + days + " days.");
        return days;
    }

}
