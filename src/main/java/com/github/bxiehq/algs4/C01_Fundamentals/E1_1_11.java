package com.github.bxiehq.algs4.C01_Fundamentals;


import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

/**
 * 1.1.11 Write a code fragment that prints the contents of a two-dimensional boolean
 * array, using * to represent `true` and a space to represent `false` . Include row and column
 * numbers.
 *
 */
public class E1_1_11 {
    public static void print2DBooleanArray(boolean[][] a) {
        int length = a.length;

        for (int i = 0; i < length; ++i) {
            for (int j = 0; j < a[i].length; ++j) {
                if (a[i][j] == true) {
                    StdOut.print("*");
                } else {
                    StdOut.print(" ");
                }
            }
            StdOut.println();
        }

    }

    public static void main(String[] args) {
        int row = StdRandom.uniform(1, 100);
        int col = StdRandom.uniform(1, 100);
        boolean[][] a = new boolean[row][col];

        for (int i = 0; i < row; ++i) {
            for (int j = 0; j < col; ++j) {
                a[i][j] = StdRandom.bernoulli();
            }
        }

        print2DBooleanArray(a);

    }
}
