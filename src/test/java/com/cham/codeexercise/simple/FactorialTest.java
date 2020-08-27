package com.cham.codeexercise.simple;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class FactorialTest {

    private Factorial factorial = new Factorial();

    @Test
    public void shouldTestFactorial(){
        Assertions.assertEquals(factorial.factorial(5), 120);
        Assertions.assertEquals(factorial.factorial(10), 3628800);
    }

    @Test
    public void shouldTestFactorialUsingRec(){
        Assertions.assertEquals(factorial.factorialRec(5), 120);
    }
}