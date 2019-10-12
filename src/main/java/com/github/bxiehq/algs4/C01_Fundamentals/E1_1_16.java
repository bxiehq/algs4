package com.github.bxiehq.algs4.C01_Fundamentals;

import edu.princeton.cs.algs4.StdOut;

/**
 * 1.1.16 Give the value of exR1(6) :
 *
 * <pre>
 *      public static String exR1(int n)
 *      {
 *          if (n <= 0) return "";
 *          return exR1(n-3) + n + exR1(n-2) + n;
 *      }
 * </pre>
 */

public class E1_1_16 {
    public static String exR1(int n) {
        if (n <= 0) return "";
        return exR1(n - 3) + n + exR1(n - 2) + n;
    }

    public static void main(String[] args) {
        /**
         *                              exR1(6)
         *
         *          exR1(3)            + 6 +                        exR1(4)                 + 6
         *             / \                                           /  \
         *  exR1(0) + 3 + exR1(1) + 3                   exR1(1) + 4 + exR1(2) + 4
         *                  ||                          /   \           |\
         *        exR1(-2) + 1 + exR1(-1) + 1  exR1(-2)+1+exR1(-1)+1  exR1(-1) + 2 + exR1(0) + 2
         *
         *  The result is: 311361142246
         *
         */
        StdOut.println(exR1(6));
    }
}
