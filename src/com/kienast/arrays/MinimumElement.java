package com.kienast.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MinimumElement {

    private static Scanner sc = new Scanner(System.in);


    public static int readInteger() {
        System.out.println("Enter number of elements in integer array...");
        boolean isInt = sc.hasNextInt();
        if (isInt) {
            return sc.nextInt();
        }
        return 0;
    }


    public static int[] readElements(int numElements) {
        System.out.println("Enter integers to store in array...");
        int[] intArr = new int[numElements];
        for (int i = 0; i < numElements; i++) {
            boolean isInt = sc.hasNextInt();
            if (isInt) {
                intArr[i] = sc.nextInt();
            }
        }
        System.out.println(Arrays.toString(intArr));
        return intArr;
    }


    public static int findMin(int[] intArr) {
        int min = Integer.MIN_VALUE;
        boolean minNotSet = true;
        for (int i = 0; i < intArr.length; i++) {
            if (minNotSet) {
                min = intArr[i];
                minNotSet = false;
                continue;
            }
            if (intArr[i] < min) {
                min = intArr[i];
            }
        }
        System.out.println("The minimum is: " + min);
        return min;
    }

}
