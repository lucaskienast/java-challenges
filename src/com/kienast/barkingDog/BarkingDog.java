package com.kienast.barkingDog;

public class BarkingDog {

    public static boolean shouldWakeUp(boolean  barking, int hourOfDay) {
        if (!barking) {
            System.out.println("Dog is not barking, all good!");
            return false;
        }

        if ((hourOfDay < 0) || (hourOfDay > 23)) {
            System.out.println("Invalid input for hour of day!");
            return false;
        }

        if (hourOfDay < 8 || hourOfDay > 22) {
            System.out.println("Dog is barking, and it's quiet hours...Get up!");
            return false;
        }

        System.out.println("Dog is not barking, and it's not quiet hours, all good!");
        return false;
    }

}
