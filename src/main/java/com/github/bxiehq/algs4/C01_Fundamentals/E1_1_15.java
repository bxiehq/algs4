package com.github.bxiehq.algs4.C01_Fundamentals;

import edu.princeton.cs.algs4.StdOut;

import java.util.Arrays;

/**
 * 1.1.15 Write a static method `histogram()` that takes an array `a[]` of `int` values and
 * an integer `M` as arguments and returns an array of length `M` whose `i` th entry is the num-
 * ber of times the integer `i` appeared in the argument array. If the values in `a[]` are all
 * between `0` and `M–1` , the sum of the values in the returned array should be equal to
 * `a.length` .
 */
public class E1_1_15 {
    public static int[] histogram(int[] a, int M) {
        int[] ra = new int[M];
        for (int i = 0; i < M; ++i) {
            ra[i] = 0;
        }

        for (int i = 0; i < a.length; ++i) {
            if (a[i] < 0 || a[i] > M - 1) {
                throw new Error("Illegal input array argument.");
            }

            ra[a[i]] += 1;
        }

        return ra;
    }

    public static void main(String[] args) {
        int[] a = {0,0,0,0,0,5,6,7,8};
        StdOut.println(Arrays.toString(histogram(a, 9)));
    }
}
