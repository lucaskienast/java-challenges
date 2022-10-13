package com.kienast.flourPack;

public class FlourPack {

    public static boolean canPack(int bigCount, int smallCount, int goal) {
        if ((bigCount < 0) || (smallCount < 0) || (goal < 0)) {
            System.out.println("Invalid inputs");
            return false;
        }

        if ((bigCount >= 1) && (goal / (5*bigCount) == 1)) {
            System.out.println("Can be packaged.");
            return true;
        }

        int originalSmallCount = smallCount;

        do {
            while (smallCount > 0) {
                int total = 5*bigCount + smallCount;

                if (total == goal) {
                    System.out.println("Can be packaged.");
                    return true;
                }

                if (total > goal) {
                    int remainder = total - goal;

                    if (5*bigCount > total && remainder % 5 != 0) {
                        continue;
                    }

                    System.out.println("Can be packaged.");
                    return true;
                }

                smallCount--;
            }

            bigCount--;
            smallCount = originalSmallCount;
        } while (bigCount > 0);

        System.out.println("Cannot be packaged.");
        return false;
    }

}
