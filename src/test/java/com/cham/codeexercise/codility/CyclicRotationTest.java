package com.cham.codeexercise.codility;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class CyclicRotationTest {

    private final CyclicRotation cyclicRotation = new CyclicRotation();

    private int[] A = { 3, 8, 9, 7, 6 };

    private int[] response = {9, 7, 6, 3, 8};

    @Test
    public void shouldTestCyclicRotation(){
        //System.out.println(Arrays.toString(cyclicRotation.solution(A,3)));
        assertEquals(cyclicRotation.solution(A,3), response);
    }
}