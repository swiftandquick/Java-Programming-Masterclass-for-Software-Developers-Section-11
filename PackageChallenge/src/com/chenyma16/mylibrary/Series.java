package com.chenyma16.mylibrary;

public class Series {

    public static int nSum(int n) {
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            sum = sum + i;
        }
        return sum;
    }


    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            int product = 1;
            for (int i = 1; i <= n; i++) {
                product = product * i;
            }
            return product;
        }
    }


    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            int n1 = 0;
            int n2 = 1;
            int fib = 0;
            for (int i = 0; i <= n - 2; i++) {
                fib = n1 + n2;
                n1 = n2;
                n2 = fib;
            }
            return fib;
        }
    }
}