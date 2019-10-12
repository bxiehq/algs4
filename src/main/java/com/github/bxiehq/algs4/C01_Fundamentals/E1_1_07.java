package com.github.bxiehq.algs4.C01_Fundamentals;

import edu.princeton.cs.algs4.StdOut;

/**
 * 1.1.7 Give the value printed by each of the following code fragments:
 *
 * a.   double t = 9.0;
 *      while (Math.abs(t - 9.0/t) > .001)
 *          t = (9.0/t + t) / 2.0;
 *      StdOut.printf("%.5f\n", t);
 *
 * b.   int sum = 0;
 *      for (int i = 1; i < 1000; i++)
 *          for (int j = 0; j < i; j++)
 *              sum++;
 *      StdOut.println(sum);
 *
 * c.   int sum = 0;
 *      for (int i = 1; i < 1000; i *= 2)
 *          for (int j = 0; j < N; j++)
 *              sum++;
 *      StdOut.println(sum);
 */
public class E1_1_07 {
    public static void frag1() {
        double t = 9.0;
        while (Math.abs(t-9.0/t) > .001)
            t = (9.0/t + t) / 2.0;
        StdOut.printf("%.5f\n", t);
    }

    public static void frag2() {
        int sum = 0;
        for (int i = 1; i < 1000; i++)
            for (int j = 0; j < 1; j++)
                sum++;
        StdOut.println(sum);
    }

    public static void frag3(int N) {
        int sum = 0;
        for (int i = 1; i < 1000; i *= 2)
            for (int j = 0; j < N; j++)
                sum++;
        StdOut.println(sum);
    }

    public static void main(String[] args) {
        frag1();
        frag2();
        frag3(100);
    }
}
