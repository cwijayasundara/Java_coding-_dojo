package com.cham.codeexercise.codility;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class TapeEqulibriumTest {
    private final TapeEqulibrium tapeEqulibrium = new TapeEqulibrium();
    private final int[] arr = {3,1,2,4,3};

    @Test
    public void shouldTestEqiub(){
        Assertions.assertEquals(tapeEqulibrium.solution(arr), 1);
    }

}