package com.github.bxiehq.algs4.C01_Fundamentals;

import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

/**
 * 1.1.13 Write a code fragment to print the transposition (rows and columns changed)
 * of a two-dimensional array with M rows and N columns.
 */
public class E1_1_13 {

    /**
     * Original matrix:
     *  1 2 3
     *  4 5 6
     *
     * Transposed matrix:
     *  1 4
     *  2 5
     *  3 6
     *
     * @param matrix the 2D array to be transposed
     */
    public static void transposition(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;

        for (int i = 0; i < col; ++i) {
            for (int j = 0; j < row; ++j) {
                StdOut.print(matrix[j][i]);
                StdOut.print("\t");
            }
            StdOut.println();
        }

    }

    public static void main(String[] args) {
        int row = StdRandom.uniform(1, 100);
        int col = StdRandom.uniform(1, 100);

        int[][] matrix = new int[row][col];

        for (int i = 0; i < row; ++i) {
            for (int j = 0; j < col; ++j) {
                matrix[i][j] = StdRandom.uniform(1, 100);
            }
        }

        StdOut.println("Matrix before transposition: ");
        for (int i = 0; i < row; ++i) {
            for (int j = 0; j < col; ++j) {
                StdOut.print(matrix[i][j] + "\t");
            }
            StdOut.println();
        }

        StdOut.println("Matrix After transposition: ");

        transposition(matrix);
    }
}
