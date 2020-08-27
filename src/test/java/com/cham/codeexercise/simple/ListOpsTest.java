package com.cham.codeexercise.simple;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ListOpsTest {

    private List<Integer> integerList = Arrays.asList(10,5,5,10,20);

    private final List<String> strList = Arrays.asList("java");

    private ListOps listOps = new ListOps();

    @Test
    public void shouldTestAverage(){
        assertEquals(listOps.average(integerList),10);
    }

    @Test
    public void shouldTestUpper(){
        assertEquals(listOps.upperCase(strList),"JAVA");
    }
}