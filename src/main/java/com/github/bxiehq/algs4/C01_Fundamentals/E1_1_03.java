package com.github.bxiehq.algs4.C01_Fundamentals;

import java.util.Arrays;

/**
 * 1.1.3 Write a program that takes three integer command-line arguments and prints
 * *equal* if all three are equal, and *not equal* otherwise.
 */

public class E1_1_03 {

    public static void main(String[] args) {
        if (args.length != 3) {
            System.err.println("Must be exactly 3 arguments");
            return;
        }

        System.out.println("args: " + Arrays.toString(args));

        try {

            int a1 = Integer.parseInt(args[0]);
            int a2 = Integer.parseInt(args[1]);
            int a3 = Integer.parseInt(args[2]);
            if (a1 == a2 && a2 == a3 && a1 == a3) {
                System.out.println("Equal.");
            } else {
                System.out.println("Not equal.");
            }

        } catch (NumberFormatException e) {
            System.err.println("Invalid number format.");
        }

    }
}
