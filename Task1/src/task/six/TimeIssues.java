package task.six;

import lib.datetime.Time;
import lib.io.Input;

public class TimeIssues {
    public static void preciseTime(int seconds) {
        validateSeconds(seconds);
        int hours = Time.toHours(seconds);
        hours = validateHours(hours);
        int minutes = Time.toMinutes(seconds);
        minutes = validateMinute(minutes);
        int second = seconds - (hours*Time.SECONDS_IN_HOUR + minutes*Time.MINUTES);
        System.out.println("The exact time is " + hours + " hours " + minutes + " minutes " + second + " seconds");
    }

    private static void validateSeconds(int seconds) {
        if (seconds < 0 || seconds > Time.SECONDS_IN_DAY) {
            System.out.println("Only positive value or not grater than a hole day! Please provide us meaningful info..");
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

    public static void main(String... args) {
        int seconds = Input.enterNumber();
        TimeIssues.preciseTime(seconds);
    }
}
