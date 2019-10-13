package com.github.bxiehq.algs4.C01_Fundamentals;

import edu.princeton.cs.algs4.StdOut;

/**
 * A string s is a circular rotation of a string t if it matches when the characters
 * are circularly shifted by any number of positions; e.g., ACTGACG is a circular shift of
 * TGACGAC , and vice versa. Detecting this condition is important in the study of genomic
 * sequences. Write a program that checks whether two given strings s and t are circular
 * shifts of one another. Hint : The solution is a one-liner with indexOf() , length() , and
 * string concatenation.
 */
public class E1_2_06 {
    public static boolean isCircularShift(String a, String b) {
        if (a.length() != b.length()) {
            return false;
        }

        a = a + a;
        if (a.indexOf(b) != -1) {
            return true;
        }

        return false;
    }
    public static void main(String[] args) {
        StdOut.println(isCircularShift("ACTGACG", "TGACGAC"));
    }
}
