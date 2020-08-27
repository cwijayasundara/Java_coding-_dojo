package com.cham.codeexercise.simple;

import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FindMaxTest {

    private FindMax findMax = new FindMax();

    private List<Integer> integers = Arrays.asList(20,30,50,70,3,4);

    private Integer[] intArr = {20,30,50,70,3,4};

    @Test
    public void shouldTestFindMaximum(){
        assertEquals(findMax.maximum(integers),70);
    }

    @Test
    public void shouldTestFindMaximumInArr(){
        assertEquals(findMax.findMax(intArr),70);
    }

    @Test
    public void shouldTestFindMaximumStream(){
        assertEquals(findMax.findMaxStream(integers),70);
    }

    @Test
    public void shouldTestFindMinStream(){
        assertEquals(findMax.findMinStream(integers),3);
    }
}