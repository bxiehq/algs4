package com.github.bxiehq.algs4.C01_Fundamentals;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

import java.util.Arrays;

import static com.github.bxiehq.algs4.C01_Fundamentals.BinarySearchRecursive.rank;

/**
 * Add to the BinarySearch test client the ability to respond to a second argu-
 * ment: + to print numbers from standard input that are not in the whitelist, - to print
 * numbers that are in the whitelist.
 */
public class E1_1_23 {

    public static void main(String[] args) {
        int[] whitelist = In.readInts(args[0]);
        String flag = args[1];

        Arrays.sort(whitelist);
        int[] keys = StdIn.readAllInts();
        for (int key : keys) {
            int result = rank(key, whitelist);
            if (result < 0 && flag == "+") {
                StdOut.println(key);
            } else if (result >= 0 && flag == "-") {
                StdOut.println(key);
            }
        }
    }

}
