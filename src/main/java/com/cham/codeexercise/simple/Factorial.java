package com.cham.codeexercise.simple;

public class Factorial {
    /*
    Write a method that calculates the factorial of a given number.
    Factorial is the product of all positive integers less than or equal to n. For example, factorial(4) = 4x3x2x1 = 24.
    TIP: To make it more interesting, try to do it recursively.
     */
    public Integer factorial(Integer n) {
        Integer sum = n;
        for (int j = n - 1; j > 0; j--) {
            sum = sum * j;
        }
       return sum;
    }

    public Integer factorialRec(Integer n){
        if(n==0) return 1;
        else return n * factorial(n - 1);
    }
}
