package com.thoughtworks;

public class FizzBuzzer {
    public static String FIZZ = "Fizz";
    public static String BUZZ = "Buzz";

    public static String fizzBuzz(final int index)
    {
        if(index % 3 == 0) {
            return FizzBuzzer.FIZZ;
        }
        if(index % 5 == 0 ){
            return FizzBuzzer.BUZZ;
        }
        return "1";
    }
}

