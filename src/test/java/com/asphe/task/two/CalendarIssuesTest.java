package com.asphe.task.two;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class CalendarIssuesTest {

    @Test
    void daysInMonth() {
        assertEquals(31, CalendarIssues.daysInMonth(1, 2000).getValue0());
        assertEquals(30, CalendarIssues.daysInMonth(4, 2000).getValue0());
        assertEquals(29, CalendarIssues.daysInMonth(2, 2000).getValue0());
        assertEquals(28, CalendarIssues.daysInMonth(2, 2002).getValue0());
    }

    @ParameterizedTest
    @ValueSource(ints = {2000, 2001, 9999})
    void isLeap(int year) {
        assertTrue(CalendarIssues.isLeap(year));
    }
}