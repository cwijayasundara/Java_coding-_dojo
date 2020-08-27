package com.cham.codeexercise.simple;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class LinearSearchTest {

    private LinearSearch linearSearch = new LinearSearch();

    private int[] intArr = new int[]{10,20,34,33,05};

    @Test
    public void shouldTestLinerSearch(){
        Assertions.assertEquals(linearSearch.search(intArr, 33),3);
        Assertions.assertEquals(linearSearch.search(intArr,100), -1);
    }
}