package com.thoughtworks;

public class FizzBuzzer {
    public static String FIZZ = "Fizz";
    public static String BUZZ = "Buzz";
    public static String WHIZZ = "Whizz";

    public static String fizzBuzz(final int index)
    {   
        StringBuffer result = new StringBuffer();
        if(index % 3 == 0 || isIncludeThree(index)) {
            result.append(FizzBuzzer.FIZZ);
        }
        if(index % 5 == 0) {
            result.append(FizzBuzzer.BUZZ);
        }
        if(index % 7 == 0) {
            result.append(FizzBuzzer.WHIZZ);
        }
        if(result.length() > 0){
            return result.toString();
        }
        return  String.valueOf(index);
    }

    private static boolean isIncludeThree(final int index) {
        return String.valueOf(index).indexOf("3") > 0;
    }
}

