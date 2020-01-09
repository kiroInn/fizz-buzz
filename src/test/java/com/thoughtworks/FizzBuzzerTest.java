package com.thoughtworks;

import org.junit.Test;

import static org.junit.Assert.*;

public class FizzBuzzerTest {

    @Test
    public void should_return_one_when_pass_one()
    {
        assertEquals(FizzBuzzer.fizzBuzz(1), "1");
    }

    @Test
    public void should_return_fizz_when_multiple_of_three()
    {
        assertEquals(FizzBuzzer.fizzBuzz(3), "fizz");
        assertEquals(FizzBuzzer.fizzBuzz(6), "fizz");
        assertEquals(FizzBuzzer.fizzBuzz(9), "fizz");
    }
}