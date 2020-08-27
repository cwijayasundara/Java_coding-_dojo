package com.cham.codeexercise.simple;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MultipleTest {

    private Multiple multiple = new Multiple();

    @Test
    public void shouldTestMultiples(){
        Assertions.assertEquals(multiple.sum(5), 8);
        Assertions.assertNotEquals(multiple.sum(10), 8);
    }

}