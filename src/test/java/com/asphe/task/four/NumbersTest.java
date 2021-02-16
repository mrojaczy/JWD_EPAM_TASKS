package com.asphe.task.four;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;


import static org.junit.jupiter.api.Assertions.*;

class NumbersTest {

    @Test
    void isEnoughEven() {
        var a = Numbers.initializeArray(5);
        assertTrue(Numbers.isEnough(2, a));
    }

    @ParameterizedTest
    @ValueSource(ints = {1, 2, 3, 5, -3, 15, Integer.MAX_VALUE})
    void isEven(int number) {
        assertTrue(Numbers.isEven(number));
    }
}