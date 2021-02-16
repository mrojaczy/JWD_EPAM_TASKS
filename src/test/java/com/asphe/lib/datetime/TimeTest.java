package com.asphe.lib.datetime;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TimeTest {

    @Test
    void toMinutes() {
        assertEquals(1, Time.toMinutes(60));
        assertEquals(0, Time.toMinutes(59));
        assertEquals(1, Time.toMinutes(119));
    }

    @Test
    void toHours() {
        assertEquals(1, Time.toHours(3600));
        assertEquals(0, Time.toHours(3599));
        assertEquals(24, Time.toHours(Time.SECONDS_IN_DAY));
    }
}