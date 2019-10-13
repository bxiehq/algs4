package com.github.bxiehq.algs4.C01_Fundamentals;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

/**
 * Write a program that reads in lines from standard input with each line contain-
 * ing a name and two integers and then uses `printf()` to print a table with a column of
 * the names, the integers, and the result of dividing the first by the second, accurate to
 * three decimal places. You could use a program like this to tabulate batting averages for
 * baseball players or grades for students.
 */
public class E1_1_21 {
    public static void printAverageScoreEachLine() {
        // isEmpty(): wrapper of hasNext. Blocking if
        // the buffer is empty. After the user typed enter
        // the characters were sent to the input buffer.
        while (!StdIn.isEmpty()) {
            String s = StdIn.readLine();
            String[] split = s.trim().split("\\s+");
            if (split.length != 3) {
                StdOut.println("Invalid input, please retry.");
            }

            try {
                String name = split[0];
                int i1 = Integer.parseInt(split[1]);
                int i2 = Integer.parseInt(split[2]);
                float average = (float) i1 / i2;
                StdOut.printf("%s %d %d %.3f\n", name, i1, i2, average);
            } catch (Exception e) {
                StdOut.println("Please input integers.");
            }
        }
    }

    public static void printAverageScoreWhole() {
        String[] lines = StdIn.readAllLines();
        for (String line : lines) {
            StdOut.println(line);
            String[] split = line.trim().split("\\s+");
            if (split.length != 3) {
                StdOut.println("Invalid line");
                continue;
            }

            try {
                String name = split[0];
                int i1 = Integer.parseInt(split[1]);
                int i2 = Integer.parseInt(split[2]);
                float average = (float) i1 / i2;
                StdOut.printf("%s %d %d %.3f\n", name, i1, i2, average);
            } catch (Exception e) {
                StdOut.println("Invalid line");
            }
        }
    }

    public static void main(String[] args) {
        printAverageScoreWhole();
    }

}
