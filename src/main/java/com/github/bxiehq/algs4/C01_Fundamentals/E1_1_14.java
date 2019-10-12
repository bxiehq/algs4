package com.github.bxiehq.algs4.C01_Fundamentals;

import edu.princeton.cs.algs4.StdOut;

/**
 * 1.1.14 Write a static method `lg()` that takes an `int` value `N` as argument and returns
 * the largest `int` not larger than the base-2 logarithm of N . Do *not* use `Math` .
 */

public class E1_1_14 {
    public static int lg(int N) {
        int pow = 0;
        int base = 2;
        int product = 1;

        while (product <= N) {
            product *= base;
            ++pow;
        }

        return pow - 1;

    }

    public static int lg2(int N) {
        int pow = 0;

        do {
            N >>= 1;
            ++pow;
        } while (N > 0);

        return pow-1;

    }

    private static int lg3Iter(int N, int pow) {
        if (N == 0)
            return pow;
        return lg3Iter(N >> 1, ++pow);
    }

    public static int lg3(int N) {
        int pow = -1;
        return lg3Iter(N, pow);
    }

    public static void main(String[] args) {
        StdOut.println(lg3(16));

    }
}
