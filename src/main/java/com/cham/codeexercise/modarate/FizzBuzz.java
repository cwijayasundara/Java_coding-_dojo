package com.cham.codeexercise.modarate;
/*
 * Write a method that returns 'Fizz' for multiples of three and 'Buzz' for the multiples of five.
 For numbers which are multiples of both three and five return 'FizzBuzz'.
 For numbers that are neither, return the input number.
 */
public class FizzBuzz {

    public String fizzBuzz(Integer i) {
        if(i%3==0 && i%5==0) {
            return "FizzBuzz";
        } else if (i%3==0) {
            return "Fizz";
        } else if (i%5 ==0){
            return "Buzz";
        } else return i.toString();
    }
}
