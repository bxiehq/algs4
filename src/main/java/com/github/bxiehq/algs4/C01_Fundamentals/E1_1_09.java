package com.github.bxiehq.algs4.C01_Fundamentals;


import edu.princeton.cs.algs4.StdOut;

/**
 * 1.1.9 Write a code fragment that puts the binary representation of a positive integer `N`
 * into a `String s` .
 *
 * Solution: Java has a built-in method `Integer.toBinaryString(N)` for this job, but
 * the point of the exercise is to see how such a method might be implemented. Here is a
 * particularly concise solution:
 *
 *      String s = "";
 *      for (int n = N; n > 0; n /= 2)
 *          s = (n % 2) + s;
 */

public class E1_1_09 {

    public static String i2bsIter(int N) {
        String s = "";
        for (int n = N; n > 0; n /= 2) {
            s = (n % 2) + s;
        }
        return s;
    }

    public static String i2bsBuiltin(int N) {
        return Integer.toBinaryString(N);
    }

    public static String i2bsRcv(int N) {
        String s = "";

        return i2bsTail(N, s);
    }

    private static String i2bsTail(int N, String s) {
        if (N == 0)
            return s;
        return i2bsTail(N/2, (N % 2) + s);
    }

    public static void main(String[] args) {
        StdOut.println(i2bsIter(100));
        StdOut.println(i2bsBuiltin(100));
        StdOut.println(i2bsRcv(100));

    }
}
