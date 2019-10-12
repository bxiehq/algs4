package com.github.bxiehq.algs4.C01_Fundamentals;

/**
 * 1.1.17 Criticize the following recursive function:
 *
 * <pre>
 *      public static String exR2(int n)
 *      {
 *          String s = exR2(n-3) + n + exR2(n-2) + n;
 *          if (n <= 0) return "";
 *          return s;
 *      }
 * </pre>
 * <p>
 * Answer : The base case will never be reached. A call to exR2(3) will result in calls to
 * exR2(0) , exR2(-3) , exR3(-6) , and so forth until a StackOverflowError occurs.
 */
public class E1_1_17 {
}
