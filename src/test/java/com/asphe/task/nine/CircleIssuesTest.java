package com.asphe.task.nine;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircleIssuesTest {

    @Test
    void characteristics() {
        assertEquals(12.566370614359172, CircleIssues.characteristics(2)[0]);
        assertEquals(78.53981633974483, CircleIssues.characteristics(5)[1]);
    }
}