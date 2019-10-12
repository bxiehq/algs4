package com.github.bxiehq.algs4.C01_Fundamentals;

import edu.princeton.cs.algs4.StdOut;

public class Matrix {
    public static <T> void print(T[][] matrix) {
        int row = matrix.length;
        int col = row > 0 ? matrix[0].length : 0;

        for (int i = 0; i < row; ++i) {
            for (int j = 0; i < col; ++j) {
                StdOut.print(matrix[i][j] + "\t");
            }
            StdOut.println();
        }
    }
}
