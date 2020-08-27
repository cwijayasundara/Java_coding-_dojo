package com.cham.codeexercise.codility;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PermMissingElamTest {

    private final PermMissingElam permMissingElam = new PermMissingElam();
    private final int[] sum = {2,3,1,5};

    @Test
    public void shoudTestForMissingValue(){
        assertEquals(permMissingElam.solution(sum), 4);
    }
}