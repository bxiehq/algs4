package com.github.bxiehq.algs4.C01_Fundamentals;

import edu.princeton.cs.algs4.StdOut;

/**
 * 1.1.20 Write a recursive static method that computes the value of ln (N !)
 */
public class E1_1_20 {
    public static long factorial(int N) {
        if (N <= 1) return 1;
        return N * factorial(N - 1);
    }

    public static void main(String[] args) {
        StdOut.println(factorial(21));
        for (int i = 0; i < 100; ++i) {
            StdOut.println(i + ": " + Math.log(factorial(i)));
        }
    }
}
