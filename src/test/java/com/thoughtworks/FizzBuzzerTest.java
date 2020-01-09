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
        String excepted = "FizzBuzz";
        assertEquals(FizzBuzzer.fizzBuzz(15), excepted);
        assertEquals(FizzBuzzer.fizzBuzz(30), excepted);
        assertEquals(FizzBuzzer.fizzBuzz(60), excepted);
    }

    @Test
    public void should_return_FizzBuzzWhizz_when_multiple_of_three_and_five_and_seven()
    {
        String result = "FizzBuzzWhizz";
        assertEquals(FizzBuzzer.fizzBuzz(105), result);
        assertEquals(FizzBuzzer.fizzBuzz(210), result);
        assertEquals(FizzBuzzer.fizzBuzz(315), result);
    }

    @Test
    public void should_return_FizzWhizz_when_multiple_of_three_and_seven()
    {
        String result = "FizzWhizz";
        assertEquals(FizzBuzzer.fizzBuzz(21), result);
        assertEquals(FizzBuzzer.fizzBuzz(42), result);
        assertEquals(FizzBuzzer.fizzBuzz(126), result);
    }

    @Test
    public void should_return_BuzzWhizz_when_multiple_of_five_and_seven()
    {
        String result = "BuzzWhizz";
        assertEquals(FizzBuzzer.fizzBuzz(35), result);
        assertEquals(FizzBuzzer.fizzBuzz(70), result);
        assertEquals(FizzBuzzer.fizzBuzz(140), result);
    }

    @Test
    public void should_return_Fizz_when_include_number_therr()
    {
        String result = "Fizz";
        assertEquals(FizzBuzzer.fizzBuzz(13), result);
    }
    
}