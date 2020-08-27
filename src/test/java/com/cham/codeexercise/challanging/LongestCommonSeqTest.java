package com.cham.codeexercise.challanging;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LongestCommonSeqTest {

    private final String string1 = "abattd";
    private final String string2 = "gdgeaba";
    private final String answer = "aba";
    private final LongestCommonSeq longestCommonSeq = new LongestCommonSeq();

    @Test
    public void shouldTestLongestCommonSubSequence(){
        assertEquals(longestCommonSeq.findLongestCommonSequence(string1,string2), answer);
    }

}