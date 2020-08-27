package com.cham.codeexercise.modarate;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FibonacciNumberTest {

    private final FibonacciNumber fibonacciNumber = new FibonacciNumber();

    @Test
    public void shouldTestFibonacciNumber(){
        assertEquals(fibonacciNumber.fibonacci(1), 1);
        assertEquals(fibonacciNumber.fibonacci(0), 0);
        assertEquals(fibonacciNumber.fibonacci(2), 1);
        assertEquals(fibonacciNumber.fibonacci(3), 2);
        assertEquals(fibonacciNumber.fibonacci(4), 3);
        assertEquals(fibonacciNumber.fibonacci(5), 5);
        assertEquals(fibonacciNumber.fibonacci(9), 34);
    }

}