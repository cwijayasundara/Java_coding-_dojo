package com.cham.codeexercise.simple;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class ReverseStringTest {

    private ReverseString reverseString = new ReverseString();

    @Test
    public void shouldTestReverseString(){
        Assertions.assertEquals(reverseString.reverse("java interview"), "weivretni avaj");
    }
}