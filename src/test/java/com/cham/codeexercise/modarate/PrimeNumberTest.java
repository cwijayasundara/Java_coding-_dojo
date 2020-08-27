package com.cham.codeexercise.modarate;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class PrimeNumberTest {

    private final PrimeNumber primeNumber = new PrimeNumber();

    @Test
    public void shouldTestPrime(){
        assertEquals(primeNumber.isPrime(7), true);
        assertEquals(primeNumber.isPrime(21), false);
        assertEquals(primeNumber.isPrime(81), false);
    }

}