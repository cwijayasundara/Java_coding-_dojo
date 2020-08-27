package com.cham.codeexercise.simple;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class AddNumbersTest {

    private AddNumbers addNumbers = new AddNumbers();

    @Test
    public void shoudTestAddTwoNumbers(){
        Assertions.assertEquals(addNumbers.sum(10,20), 30);
        Assertions.assertNotEquals(addNumbers.sum(10,20), 10);
    }
}