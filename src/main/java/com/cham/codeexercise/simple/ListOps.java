package com.cham.codeexercise.simple;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ListOps {

    public Double average(List<Integer> list) {
        return list.stream().mapToInt(t -> t).average().getAsDouble();
    }

    public Double average(Integer[] intArr){
        List<Integer> intList = Arrays.asList(intArr);
        return intList.stream().mapToInt(t -> t).average().getAsDouble();
    }

    public String upperCase(List<String> list) {
        return list.stream().map(t -> t.toUpperCase()).collect(Collectors.joining());
    }
}
