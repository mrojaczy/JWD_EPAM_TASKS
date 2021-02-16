package com.asphe.lib.datetime;

public class Time {
    public static final int SECONDS_IN_DAY = 86400;
    public static final int SECONDS_IN_HOUR = 3600;
    public static final int HOUR = 24;
    public static final int MINUTES = 60;


    public static int toMinutes(int seconds) {
        return seconds / MINUTES;
    }

    public static int toHours(int seconds) {
        return seconds / SECONDS_IN_HOUR;
    }
}
