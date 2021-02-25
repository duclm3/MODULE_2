package com.baitap;

import org.junit.Assert;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class NextDayCalculatorTest {

    @Test
    @DisplayName("1 - 1 - 2018")
    void nextDay112018() {
        int[] expected = {2,1,2018};
        int[] result = NextDayCalculator.nextDay(1,1,2018);
        Assert.assertArrayEquals(expected, result);
    }
    @Test
    void nextDay3012018() {
        int[] expected = {1,2,2018};
        int[] result = NextDayCalculator.nextDay(31,1,2018);
        Assert.assertArrayEquals(expected, result);
    }
    @Test
    void nextDay3042018() {
        int[] expected = {1,5,2018};
        int[] result = NextDayCalculator.nextDay(30,4,2018);
        Assert.assertArrayEquals(expected, result);
    }
    @Test
    void nextDay2822018() {
        int[] expected = {1,3,2018};
        int[] result = NextDayCalculator.nextDay(28,2,2018);
        Assert.assertArrayEquals(expected, result);
    }
    @Test
    void nextDay2922020() {
        int[] expected = {1,3,2020};
        int[] result = NextDayCalculator.nextDay(29,2,2020);
        Assert.assertArrayEquals(expected, result);
    }
    @Test
    void nextDay31122018() {
        int[] expected = {1,1,2019};
        int[] result = NextDayCalculator.nextDay(31,12,2018);
        Assert.assertArrayEquals(expected, result);
    }
}