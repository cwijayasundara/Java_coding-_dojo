package com.cham.codeexercise.codility;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FrogRiverOneTest {

    private FrogRiverOne frogRiverOne = new FrogRiverOne();
    private int[] locations = {1,3,1,4,2,3,5,4};

    @Test
    public void shouldTestRiverCross(){
        assertEquals(frogRiverOne.solution(5,locations),6);
        assertEquals(frogRiverOne.solution2(5,locations),4);
    }
}