package com.halmaks.tasks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumOfDigitsTest {

    @Test
    void calculateSumTest1() {
        assertEquals(12, new SumOfDigits()
                .calculateSum("66")
        );
    }

    @Test
    void calculateSumTest2() {
        assertEquals(38, new SumOfDigits()
                .calculateSum("89914412")
        );
    }

    @Test
    void calculateSumTest3() {
        assertEquals(1, new SumOfDigits()
                .calculateSum("10")
        );
    }

    @Test
    void calculateSumTest4() {
        assertEquals(22, new SumOfDigits()
                .calculateSum("-4882")
        );
    }
}