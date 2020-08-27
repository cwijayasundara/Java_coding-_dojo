package com.cham.codeexercise.codility;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class BinaryGapTest {

    private final BinaryGap binaryGap = new BinaryGap();

    @Test
    public void shouldTestBinGap(){
        Assertions.assertEquals(binaryGap.solution(9),2);
        Assertions.assertEquals(binaryGap.solution(529),4);
    }
}