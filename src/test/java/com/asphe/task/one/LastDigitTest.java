package com.asphe.task.one;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LastDigitTest {

    @Test
    void lastSqrtDigit() {
        // check if right find the last digit of integer
        assertEquals(1, LastDigit.lastDigit(81));

        // right work of function check
        assertEquals(1, LastDigit.lastSqrtDigit(19));
        assertEquals(4, LastDigit.lastSqrtDigit(78));
        assertEquals(9, LastDigit.lastSqrtDigit(33));
        assertEquals(6, LastDigit.lastSqrtDigit(36));
        assertEquals(5, LastDigit.lastSqrtDigit(125));
        assertEquals(0, LastDigit.lastSqrtDigit(100));
    }
}