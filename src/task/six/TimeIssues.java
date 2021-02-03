package task.six;

import lib.datetime.Time;
import lib.io.Input;
import java.text.MessageFormat;

public class TimeIssues {
    public static void preciseTime(int seconds) {
        validateSeconds(seconds);
        int hours = Time.toHours(seconds);
        hours = validateHours(hours);
        int minutes = Time.toMinutes(seconds);
        minutes = validateMinute(minutes);
        int second = seconds - (hours*Time.SECONDS_IN_HOUR + minutes*Time.MINUTES);
        printPreciseTime(hours, minutes, second);
    }

    //trying to split logic and printing
    private static void printPreciseTime(int hours, int minutes, int second) {
        System.out.println(MessageFormat.format("The exact time is {0} hour(s) {1} minute(s) {2} second(s)", hours, minutes, second));
    }

    private static void validateSeconds(int seconds) {
        if (seconds > Time.SECONDS_IN_DAY) {
            System.out.println("Sorry, we could not count grater than a one hole day! Please provide us meaningful info..");
            System.exit(0);
        }
    }

    private static int validateMinute(int minutes) {
        while (minutes > Time.MINUTES) {
            minutes -= Time.MINUTES;
        }
        return minutes;
    }

    private static int validateHours(int hours) {
        while (hours > Time.HOUR) {
            hours -= Time.HOUR;
        }
        return hours;
    }

    public static void main(String[] args) {
        int seconds = Input.enterPositiveNumber();
        TimeIssues.preciseTime(seconds);
    }
}
