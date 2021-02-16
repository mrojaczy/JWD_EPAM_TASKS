package com.asphe.task.six;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TimeIssuesTest {

    @Test
    void preciseTime() {
        assertEquals(1, TimeIssues.preciseTime(3661)[0]);
        assertEquals(1, TimeIssues.preciseTime(3661)[1]);
        assertEquals(1, TimeIssues.preciseTime(3661)[2]);

        assertEquals(2, TimeIssues.preciseTime(9938)[0]);
        assertEquals(45, TimeIssues.preciseTime(9938)[1]);
        assertEquals(38, TimeIssues.preciseTime(9938)[2]);
    }
}