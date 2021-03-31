package com.halmaks.tasks;

import org.junit.jupiter.api.Test;

import static com.halmaks.tasks.TwoSum.searchTwoSum;
import static org.junit.jupiter.api.Assertions.*;

class TwoSumTests {

    @Test
    void searchTwoSumWhenInputArrayFrom1To10() {
        assertArrayEquals(new int[]{1, 9}, searchTwoSum(new int[]{
                1, 2, 3, 4, 5, 6, 7, 8, 9, 10
        }, 10));
    }

    @Test
    void searchTwoSumWhenInputArrayWithNegativeNumbers() {
        assertArrayEquals(new int[]{-1, 11}, searchTwoSum(new int[]{
                100, -200, -1, 4, 5, 20, 7, 11, 8, 9, 10
        }, 10));
    }
}