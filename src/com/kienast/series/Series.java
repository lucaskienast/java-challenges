package com.kienast.series;

import java.util.ArrayList;
import java.util.List;

public class Series {

    public static int nSum(int n) {
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    public static int factorial(int n) {
        if (n == 0) {
            return 0;
        }
        int product = 1;
        for (int i = 1; i <= n; i++) {
            product *= i;
        }
        return product;
    }

    public static int fibonacci(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        List<Integer> fibonacciNumbers = new ArrayList<>();
        fibonacciNumbers.add(0, 0);
        fibonacciNumbers.add(1, 1);
        for (int i = 2; i <= n; i++) {
            int fMinus2 = fibonacciNumbers.get(i-2);
            int fMinus1 = fibonacciNumbers.get(i-1);
            fibonacciNumbers.add(i, fMinus2 + fMinus1);
        }
        return fibonacciNumbers.get(n);
    }

}
