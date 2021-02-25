package com.baitap;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FizzBuzzTest {
    @Test
    void fizz() {
        String expected = "Fizz";
        String result = FizzBuzz.fizzBuzz(31);
        assertEquals(expected, result);
    }
    @Test
    void buzz() {
        String expected = "Buzz";
        String result = FizzBuzz.fizzBuzz(50);
        assertEquals(expected, result);
    }
    @Test
    void fizzbuzz() {
        String expected = "FizzBuzz";
        String result = FizzBuzz.fizzBuzz(675);
        assertEquals(expected, result);
    }
    @Test
    void notfizzbuzz() {
        String expected = "Tám hai";
        String result = FizzBuzz.fizzBuzz(82);
        assertEquals(expected, result);
    }
}