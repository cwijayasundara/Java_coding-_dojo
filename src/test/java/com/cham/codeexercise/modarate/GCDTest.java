package com.cham.codeexercise.modarate;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GCDTest {

    private final GCD gcd = new GCD();

    @Test
    public void shouldTestForGcd(){
        assertEquals(gcd.gcd(18,6),6);
    }

}