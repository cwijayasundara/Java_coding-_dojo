package com.cham.codeexercise.challanging;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LargestPrimeFactorTest {

    private final LargestPrimeFactor largestPrimeFactor = new LargestPrimeFactor();

    @Test
    private void shouldTestLagestPrimeFactor(){
        assertEquals(largestPrimeFactor.largestPrimeFactor(55), 11);
    }
}