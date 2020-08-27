package com.cham.codeexercise.modarate;

import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CommaSeparatedTest {

    private final CommaSeparated commaSeparated = new CommaSeparated();

    private final List<Integer> strToCheck = Arrays.asList(3,44);

    @Test
    public void shouldTestCommaSeparated(){
        assertEquals(commaSeparated.getString(strToCheck), "o3,e44");
    }
}