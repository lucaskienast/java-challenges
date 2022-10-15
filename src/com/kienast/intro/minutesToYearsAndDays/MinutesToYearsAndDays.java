package com.kienast.intro.minutesToYearsAndDays;

public class MinutesToYearsAndDays {

    public static void printYearsAndDays(long minutes) {
        if (minutes < 0) {
            System.out.println("Invalid input");
            return;
        }

        long totalHours = minutes / 60;
        long totalDays = totalHours / 24;
        long totalYears = totalDays / 365;
        long residueDays = totalDays % 365;

        System.out.println(minutes + " min = " + totalYears + " years and " + residueDays + " days");
    }

}
