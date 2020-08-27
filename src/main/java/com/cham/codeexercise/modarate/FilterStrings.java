package com.cham.codeexercise.modarate;

import java.util.List;
import java.util.stream.Collectors;

/*
 * Given a list of strings, write a method that returns a list of all strings that start with the letter 'a'
 * (lower case) and have exactly 3 letters. TIP: Use Java 8 Lambdas and Streams API's.
 */
public class FilterStrings {

    public List<String> search(List<String> list) {
        return list
                .stream()
                .filter(t -> t.startsWith("a"))
                .filter(t -> t.length() ==3)
                .collect(Collectors.toList());
    }
}
