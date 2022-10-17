package com.kienast.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {

    private static Scanner sc = new Scanner(System.in);


    public static int getArrayLength() {
        System.out.println("Enter array length");
        return sc.nextInt();
    }


    public static int[] getArrayElements(int numElements) {
        System.out.println("Enter array elements");
        int[] intArr = new int[numElements];
        for (int i = 0; i< numElements; i++) {
            intArr[i] = sc.nextInt();
        }
        System.out.println("original array");
        System.out.println(Arrays.toString(intArr));
        return intArr;
    }


    public static int[] getReversedArray(int[] intArr) {
        int[] revArr = new int[intArr.length];
        for (int i = 0; i < intArr.length; i++) {
            revArr[i] = intArr[i];
        }
        for (int i = 0; i < revArr.length/2; i++) {
            int temp = revArr[i];
            revArr[i] = revArr[revArr.length-1-i];
            revArr[revArr.length-1-i] = temp;
        }
        System.out.println("reverse array");
        System.out.println(Arrays.toString(revArr));
        return revArr;
    }

}
