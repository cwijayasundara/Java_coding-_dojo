package com.cham.codeexercise.modarate;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class FizzBuzzTest {

    private final FizzBuzz fizzBuzz = new FizzBuzz();

    @Test
    public void testMultipleOfThree(){
        assertEquals(fizzBuzz.fizzBuzz(6),"Fizz");
        assertEquals(fizzBuzz.fizzBuzz(10),"Buzz");
        assertEquals(fizzBuzz.fizzBuzz(15),"FizzBuzz");
        assertEquals(fizzBuzz.fizzBuzz(7),"7");
    }
}