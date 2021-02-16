package com.asphe.task.two;

import com.asphe.lib.io.Input;
import org.javatuples.Triplet;
import java.text.MessageFormat;

public class CalendarIssues {
    public static Triplet<Integer, Integer, Integer> daysInMonth(int month, int year) {
        validateMonth(month);
        validateYear(year);
        int days = 0;
        switch (month) {
            case 1, 3, 5, 7, 8, 10, 12 -> days = 31;
            case 4, 6, 9, 11 -> days = 30;
            case 2 -> days = isLeap(year) ? 29 : 28;
        }
        return Triplet.with(days, month, year);
    }

    public static boolean isLeap(int year) {
        return ((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0);
    }

    private static void validateMonth(int month) {
        if (month < 0 || month > 12) {
            System.out.println("Month should be a value from 1 to 12. Try again and enter right value..");
            System.exit(0);
        }
    }

    // right now I am using Input.EnterPositive() from my lib and this method is unnecessary, but I wanna show you my validation
    private static void validateYear(int year) {
        if (year < 0) {
            System.out.println("The program cannot count days in month in the years Before Christ. Enter right value..");
            System.exit(0);
        }
    }

    private static void printDaysInMonth(Triplet<Integer, Integer, Integer> date) {
        System.out.println(MessageFormat.format("There are {0} day in the {1}th month of {2} AD", date.getValue0(), date.getValue1(), date.getValue2()));
    }

    public static void main(String[] args) {
        System.out.println("Enter desirable month/year:");
        int month = Input.enterPositiveNumber();
        int year = Input.enterPositiveNumber();
        printDaysInMonth(CalendarIssues.daysInMonth(month, year));
    }
}
