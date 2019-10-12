package com.github.bxiehq.algs4.C01_Fundamentals;

import edu.princeton.cs.algs4.StdOut;

/**
 * 1.1.6 What does the following program print?
 *
 *      int f = 0;
 *      int g = 1;
 *      for (int i = 0; i <= 15; i++)
 *      {
 *          StdOut.println(f);
 *          f = f + g;
 *          g = f - g;
 *      }
 */
public class E1_1_06 {
    public static void fib() {
        int f = 0;
        int g = 1;
        for (int i = 0; i <= 47; i++) {
            StdOut.println(i + " " + f);
            f = f + g;
            g = f - g;
        }
    }

    public static void main(String[] args) {
        /**
         * This program implements Fibonacci function.
         * Interestingly it start the first two number f and
         * g with 0 and 1. And in the for loop, the i starts with
         * 0 and the terminate condition is i <= 15 which logically
         * calculate the 15th Fibonacci number.
         *
         * Because f and g are defined as 4 byte int, they can hold
         * up to Integer.MAX_VALUE(2147483647). Thus the 47th
         * Fibonacci number would overflow.
         */
        fib();
    }
}
