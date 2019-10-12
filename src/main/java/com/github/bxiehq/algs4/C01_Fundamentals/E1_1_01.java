package com.github.bxiehq.algs4.C01_Fundamentals;

/**
 * 1.1.1 Give the value of each of the following expressions:
 *
 * a. ( 0 + 15) / 2
 * b. 2.0e-6 * 100000000.1
 * c. true && false || true && true
 */
public class E1_1_01 {
    public static void main(String[] args) {
        System.out.println((0 + 15) / 2);
        // The default type of decimal number representation is double(eg. 3.14 is a double).
        // To specify a float, append character f to the literal(eg. 3.14f is a float).
        System.out.println(2.0e-6 * 100000000.1);
        System.out.println(true && false || true && true);
    }
}
