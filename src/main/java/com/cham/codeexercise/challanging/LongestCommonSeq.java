package com.cham.codeexercise.challanging;

public class LongestCommonSeq {

    public String findLongestCommonSequence(String s1, String s2) {
        String result = "";
        for (int length = s1.length(); length > 0; length--) { // loop first str
            int startIndex = 0;
            while (startIndex + length <= s1.length()) {
                String current = s1.substring(startIndex, startIndex + length);
                if (s2.contains(current)) {
                    result = current;
                    break;
                }
                startIndex++;
            }
            if (result.length() != 0) {
                break;
            }
        }
        return result;
    }
}
