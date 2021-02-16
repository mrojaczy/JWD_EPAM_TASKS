package com.asphe.task.five;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class PerfectNumberTest {

    @ParameterizedTest
    @ValueSource(ints = {6, 12, 54, Integer.MAX_VALUE})
    void isPerfectNumber(int number) {
        assertTrue(PerfectNumber.isPerfectNumber(number));
    }
}