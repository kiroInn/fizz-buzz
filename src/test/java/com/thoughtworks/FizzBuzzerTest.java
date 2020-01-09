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
    public void should_return_Fizz_when_multiple_of_three()
    {
        assertEquals(FizzBuzzer.fizzBuzz(3), FizzBuzzer.FIZZ);
        assertEquals(FizzBuzzer.fizzBuzz(6), FizzBuzzer.FIZZ);
        assertEquals(FizzBuzzer.fizzBuzz(9), FizzBuzzer.FIZZ);
    }

    @Test
    public void should_return_Buzz_when_multiple_of_five()
    {
        assertEquals(FizzBuzzer.fizzBuzz(5), FizzBuzzer.BUZZ);
        assertEquals(FizzBuzzer.fizzBuzz(10), FizzBuzzer.BUZZ);
        assertEquals(FizzBuzzer.fizzBuzz(20), FizzBuzzer.BUZZ);
    }

    @Test
    public void should_return_Whizz_when_multiple_of_seven()
    {
        assertEquals(FizzBuzzer.fizzBuzz(7), FizzBuzzer.WHIZZ);
        assertEquals(FizzBuzzer.fizzBuzz(14), FizzBuzzer.WHIZZ);
        assertEquals(FizzBuzzer.fizzBuzz(28), FizzBuzzer.WHIZZ);
    }

    @Test
    public void should_return_FizzBuzz_when_multiple_of_three_and_five()
    {
        assertEquals(FizzBuzzer.fizzBuzz(15), FizzBuzzer.FIZZ_BUZZ);
        assertEquals(FizzBuzzer.fizzBuzz(30), FizzBuzzer.FIZZ_BUZZ);
        assertEquals(FizzBuzzer.fizzBuzz(60), FizzBuzzer.FIZZ_BUZZ);
    }
    
}