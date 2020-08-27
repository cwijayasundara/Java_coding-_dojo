package com.cham.codeexercise.modarate;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

class FilterStringsTest {

    private final FilterStrings filterStrings = new FilterStrings();

    private final List<String> toFilter = Arrays.asList("i", "do", "not", "like", "ash", "as", "he", "is", "a", "bad", "person");

    private final List<String> ans = Arrays.asList("ash");

    @Test
    public void shouldTestSearch(){
        Assertions.assertEquals(filterStrings.search(toFilter),ans);
    }
}