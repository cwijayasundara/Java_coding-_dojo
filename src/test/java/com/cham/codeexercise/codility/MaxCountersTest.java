package com.cham.codeexercise.codility;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaxCountersTest {

    private final MaxCounters maxCounters = new MaxCounters();

    private final int[] arr = {3,4,4,6,1,4,4};

    private final int[] result = {3, 2, 2, 4, 2};

    @Test
    public void shouldTestMaxCounters(){
        assertEquals(maxCounters.solution(5,arr), result);
    }
}