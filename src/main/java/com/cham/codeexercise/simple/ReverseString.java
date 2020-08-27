package com.cham.codeexercise.simple;

import java.util.Arrays;

public class ReverseString {

    public String reverse(String s) {
        String result = "";
        for (int i = 0; i < s.length(); i++) {
            result += s.charAt((s.length() - i) - 1);
        }
        return result;
    }

}
