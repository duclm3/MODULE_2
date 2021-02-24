package com.thuchanh;

public class FizzBuzz {
    public static String fizzBuzz(int number){
        boolean isFizz = number % 3 == 0;
        boolean isNumber = number % 5 == 0;
        if(isFizz && isNumber)
            return "FizzBuzz";

        if(isFizz)
            return "Fizz";

        if(isNumber)
            return "Buzz";

        return number + "";
    }
}
