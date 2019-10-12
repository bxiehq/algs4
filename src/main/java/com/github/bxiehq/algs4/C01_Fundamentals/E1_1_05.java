package com.github.bxiehq.algs4.C01_Fundamentals;

import java.util.Arrays;

/**
 * 1.1.5 Write a code fragment that prints *true* if the *double* variables x and y are both
 * strictly between 0 and 1 and *false* otherwise.
 */
public class E1_1_05 {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.err.println("Must be exactly 2 arguments");
            return;
        }

        System.out.println("args: " + Arrays.toString(args));

        try {
            double x = Double.parseDouble(args[0]);
            double y = Double.parseDouble(args[1]);

            if ( x > 0 && x < 1 && y > 0 && y < 1) {
                System.out.println("true");
            } else {
                System.out.println("false");
            }
        } catch (NumberFormatException e) {
            System.err.println("Invalid number format");
        }
    }
}
