package com.asphe.task.three;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquareAreaTest {

    @Test
    void inscribedSquareArea() {
        assertEquals(36, SquareArea.inscribedSquareArea(72).getValue0());
        assertEquals(2, SquareArea.inscribedSquareArea(72).getValue1());
    }
}