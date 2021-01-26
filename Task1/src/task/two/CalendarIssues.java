package task.two;

import lib.io.Input;

public class CalendarIssues {
    public static void daysInMonth(int month, int year) {
        validateMonth(month);
        validateYear(year);
        boolean isLeap = isLeap(year);
        if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
            System.out.println("There are 31 day in the " + month + "th month of " + year + " AD");
        } else if (month == 4 || month == 6 || month == 9 || month == 11) {
            System.out.println("There are 30 day in the " + month + "th month of " + year + " AD");
        } else if (month == 2 && isLeap) {
            System.out.println("There are 29 day in the " + month + "th month of " + year + " AD");
        } else if (month == 2) {
            System.out.println("There are 28 day in the " + month + "th month of " + year + " AD");
        }
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

    private static void validateYear(int year) {
        if (year < 0) {
            System.out.println("The program cannot count days in month in the years Before Christ. Enter right value..");
            System.exit(0);
        }
    }

    public static void main(String... args) {
        System.out.println("Enter desirable month/year");
        int month = Input.enterNumber();
        int year = Input.enterNumber();
        CalendarIssues.daysInMonth(month, year);
    }
}
