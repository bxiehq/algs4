package com.github.bxiehq.algs4.C01_Fundamentals;

import edu.princeton.cs.algs4.StdOut;

import java.math.BigInteger;

/**
 * Ways to calculate Fibonacci number.
 *
 * From Wikipedia, Fibonacci numbers by definition is a
 * sequence where each number is the sum of the
 * two preceding ones, starting from 0 and 1.
 * Notice in some sources, F0, the "0" may be omitted.
 *
 * @see E1_1_06
 * @see E1_1_19
 */
public class Fibonacci
{
    public static long F(int N)
    {
        if (N == 0) return 0;
        if (N == 1) return 1;
        return F(N-1) + F(N-2);
    }

    /**
     * Overflow at 93th number.
     */
    public static long F2(int N) {
        long f = 0;
        long g = 1;

        if (N == 0) return 0;
        if (N == 1) return 1;

        for (int i = 2; i <= N; ++i) {
            g = f + g;
            f = g - f;
        }

        return g;
    }

    public static BigInteger F3(int N) {
        BigInteger f = new BigInteger("0");
        BigInteger g = new BigInteger("1");

        if (N == 0) return f;
        if (N == 0) return g;

        for (int i = 2; i <= N; ++i) {
            g = f.add(g);
            f = g.subtract(f);
        }

        return g;

    }

    public static void main(String[] args)
    {
        for (int N = 0; N < 100; N++)
            StdOut.println(N + " " + F3(N) + ": " + F2(N));
    }
}