package com.github.bxiehq.algs4.C01_Fundamentals;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

import java.util.Arrays;

/**
 * Write a version of BinarySearch that uses the recursive rank() given on page
 * 25 and traces the method calls. Each time the recursive method is called, print the argu-
 * ment values lo and hi , indented by the depth of the recursion. Hint: Add an argument
 * to the recursive method that keeps track of the depth.
 *
 * @see BinarySearchRecursive
 */
public class E1_1_22 {
    public static int rank(int key, int[] a) {
        return rank(key, a, 0, a.length - 1, "");
    }

    public static int rank(int key, int[] a, int lo, int hi, String depth) {
        if (lo > hi) {
            return -1;
        }

        StdOut.printf("%s%d, %d\n", depth, lo, hi);

        int mid = lo + (hi - lo) / 2;

        if (key < a[mid]) {
            return rank(key, a, lo, hi - 1, depth + " ");
        } else if (key > a[mid]) {
            return rank(key, a, mid + 1, hi, depth + " ");
        } else {
            return mid;
        }
    }

    public static void main(String[] args) {
        int[] whitelist = In.readInts(args[0]);
        Arrays.sort(whitelist);
        while (!StdIn.isEmpty()) {
            int key = StdIn.readInt();
            if (rank(key, whitelist) < 0) {
                StdOut.println(key);
            }
        }
    }

}
