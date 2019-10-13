package com.github.bxiehq.algs4.C01_Fundamentals;

import edu.princeton.cs.algs4.StdOut;

/**
 * The API of class Date:
 *
 * <pre>
 * public class Date
 *          Date(int month, int day, int year)      create a date
 *      int month()                                 month
 *      int day()                                   day
 *      int year()                                  year
 *   String toString()                              string representation
 * </pre>
 */
public class SmartDate {
    private int year;
    private int month;
    private int day;

    private int[] validDays = {0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public SmartDate(int month, int day, int year) {
        // check valid
        if (!isValid(month, day, year)) throw new IllegalArgumentException("Invalid date argument!");
        this.year = year;
        this.month = month;
        this.day = day;
    }

    private boolean isValid(int m, int d, int y) {
        if (m < 1 || m > 12) return false;
        if (d < 1 || d > validDays[m]) return false;
        if (isLeapYear(y) && m == 2 && d > 28) return false;
        return true;
    }

    // copied from edu.princeton.cs.algs4.Date.isLeapYear
    private boolean isLeapYear(int y) {
        if (y % 400 == 0) return true;
        if (y % 100 == 0) return false;
        return y % 4 == 0;
    }

    public int month() {
        return month;
    }

    public int day() {
        return day;
    }

    public int year() {
        return year;
    }

    @Override
    public String toString() {
        return month + "/" + day + "/" + year;
    }

    public static void main(String[] args) {
        int m = Integer.parseInt(args[0]);
        int d = Integer.parseInt(args[1]);
        int y = Integer.parseInt(args[2]);
        SmartDate date = new SmartDate(m, d, y);
        StdOut.println(date);
    }
}
