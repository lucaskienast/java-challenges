package com.kienast.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class SortedArray {

    private static Scanner sc = new Scanner(System.in);

    public static int[] getIntegers(int arrayLength) {
        if (arrayLength < 0) {
            System.out.println("Invalid array length");
            return new int[1];
        }

        int[] intArr = new int[arrayLength];

        for (int i = 0; i < arrayLength; i++) {
            boolean isInt = sc.hasNextInt();
            if (isInt) {
                int number = sc.nextInt();
                intArr[i] = number;
            }
        }

        System.out.println("Created array of length " + arrayLength);
        System.out.println(Arrays.toString(intArr));
        return intArr;
    }

    public static void printArray(int[] intArr) {
        for (int i = 0; i < intArr.length; i++) {
            System.out.println("Element " + i + ": " + intArr[i]);
        }
    }

    public static int[] sortIntegers(int[] intArr) {
        int[] sortedArray = new int[intArr.length];
        for (int i = 0; i < intArr.length; i++) {
            sortedArray[i] = intArr[i];
        }
        boolean flag = true;
        int temp;
        while (flag) {
            flag = false;
            for (int i = 0; i < sortedArray.length-1; i++) {
                if (sortedArray[i] < sortedArray[i+1]) {
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i+1];
                    sortedArray[i+1] = temp;
                    flag = true;
                }
            }
        }
        System.out.println("Sorted array");
        System.out.println(Arrays.toString(sortedArray));
        return sortedArray;
    }

}
