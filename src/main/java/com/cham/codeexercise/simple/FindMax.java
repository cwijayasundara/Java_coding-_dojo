package com.cham.codeexercise.simple;

import java.util.Comparator;
import java.util.List;

/*
 * Write a method that returns the largest integer in the list.
 You can assume that the list has at least one element
 */
public class FindMax {

    public Integer maximum(List<Integer> list) {
        Integer max = list.get(0);
        for (Integer i: list )
            if (i > max) max = i;
        return max;
    }

    public Integer findMax(Integer[] list){
        Integer max = list[0];
        for(Integer i : list){
            if (i>max) max =i;
        }
        return max;
    }

    public Integer findMaxStream(List<Integer> list){
        return list.stream().max(Comparator.comparing(Integer::valueOf)).get();
    }

    public Integer findMinStream(List<Integer> list){
        return list.stream().min(Comparator.comparing(Integer::valueOf)).get();
    }
}
