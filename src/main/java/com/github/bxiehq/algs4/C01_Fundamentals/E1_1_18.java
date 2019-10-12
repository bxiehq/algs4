package com.github.bxiehq.algs4.C01_Fundamentals;

import edu.princeton.cs.algs4.StdOut;

/**
 * 1.1.18 Consider the following recursive function:
 *
 * <pre>
 *      public static int mystery(int a, int b)
 *      {
 *          if (b == 0)
 *              return 0;
 *          if (b % 2 == 0) return mystery(a+a, b/2);
 *          return mystery(a+a, b/2) + a;
 *      }
 * </pre>
 *
 * What are the values of mystery(2, 25) and mystery(3, 11) ? Given positive integers
 * a and b , describe what value mystery(a, b) computes. Answer the same question, but
 * replace + with * and replace return 0 with return 1 .
 */
public class E1_1_18 {

    /**
     *
     * @param a
     * @param b
     * @return a + b
     */
    public static int mystery(int a, int b) {
        if (b == 0)
            return 0;
        if (b % 2 == 0) return mystery(a+a, b/2);
        return mystery(a+a, b/2) + a;
    }

    /**
     *
     * @param a
     * @param b
     * @return a^b
     */
    public static int mystery2(int a, int b) {
        if (b == 0)
            return 1;
        if (b % 2 == 0) return mystery2(a*a, b/2);
        return mystery2(a*a, b/2) * a;
    }

    public static void main(String[] args) {
        StdOut.println(mystery(10, 11));
        StdOut.println(mystery2(2, 4));
    }
}
