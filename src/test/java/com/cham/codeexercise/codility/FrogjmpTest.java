package com.cham.codeexercise.codility;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FrogjmpTest {

    private Frogjmp frogjmp = new Frogjmp();

    @Test
    public void testJumps(){
        assertEquals(frogjmp.solution(10,85,30),3);
    }

}