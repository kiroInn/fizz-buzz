package com.thoughtworks;

public class FizzBuzzer {
    public static String FIZZ = "Fizz";
    public static String BUZZ = "Buzz";
    public static String WHIZZ = "Whizz";

    public static String fizzBuzz(final int index) {
        if (index < 1) {
            return "";
        }
        StringBuffer result = new StringBuffer();
        Boolean isEnableRule = true;
        if (isEnableRule && isContains(index, "3")) {
            result.append(FizzBuzzer.FIZZ);
            isEnableRule = false;
        }
        if (isEnableRule && isContains(index, "5")) {
            result.append(FizzBuzzer.BUZZ);
            isEnableRule = false;
        }
        if (isEnableRule && isContains(index, "7")) {
            result.append(FizzBuzzer.WHIZZ);
            isEnableRule = false;
        }
        if (isEnableRule && index % 3 == 0) {
            result.append(FizzBuzzer.FIZZ);
        }
        if (isEnableRule && index % 5 == 0) {
            result.append(FizzBuzzer.BUZZ);
        }
        if (isEnableRule && index % 7 == 0) {
            result.append(FizzBuzzer.WHIZZ);
        }
        if (result.length() > 0) {
            return result.toString();
        }
        return String.valueOf(index);
    }

    private static boolean isContains(final int index, String character) {
        return String.valueOf(index).indexOf(character) > 0;
    }
}
