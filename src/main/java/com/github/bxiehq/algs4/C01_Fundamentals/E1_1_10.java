package com.github.bxiehq.algs4.C01_Fundamentals;

import edu.princeton.cs.algs4.StdOut;

import java.util.Arrays;

/**
 * 1.1.10 What is wrong with the following code fragment?
 *
 *      int[] a;
 *      for (int i = 0; i < 10; i++)
 *          a[i] = i * i;
 *
 * Solution: It does not allocate memory for `a[]` with new . This code results in a
 * `variable a might not have been initialized` compile-time error.
 */

public class E1_1_10 {
    public static void fix() {
        int[] a = new int[10];
        for (int i = 0; i < 10; i++) {
            a[i] = i * i;
        }

        StdOut.println(Arrays.toString(a));
    }
    public static void main(String[] args) {
        fix();
    }
}
