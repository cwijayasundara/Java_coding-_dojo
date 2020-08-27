package com.cham.codeexercise.codility;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class OddOccurencesTest {

    private final OddOccurences oddOccurences = new OddOccurences();

    private int[] arr = {9,3,9,3,9,7,9};

    private int[] arr1 = {9,3,9,3,9,7,9,3,9,3,9};

    @Test
    public void shouldTestForOdd(){
        assertEquals(oddOccurences.solution(arr),7);
        assertEquals(oddOccurences.solution2(arr),7);
        assertEquals(oddOccurences.solution(arr1),7);
        assertEquals(oddOccurences.solution2(arr1),7);
    }
}