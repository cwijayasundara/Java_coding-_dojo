package com.cham.codeexercise.codility;

import java.util.HashMap;
import java.util.Set;

public class OddOccurences {

    public int solution(int[] A){
        int result = A[0];
        // bitwise xor wipes out double elements
        // only remains odd values
        // loop for remaining
        for(int i=1; i<A.length; i++) {
            result ^= A[i];
        }
        return result;
    }

    public int solution2(int[] A) {
        HashMap<Integer, Integer> occurrencesMap = new HashMap<Integer, Integer>();

        for(int i=0; i<A.length; i++) {
            if(occurrencesMap.containsKey(A[i])) {
                int occurrences = occurrencesMap.get(A[i]);
                occurrences++;
                occurrencesMap.put(A[i], occurrences); //increment occurrence counter and store it
            }
            else {
                occurrencesMap.put(A[i], 1); //1st occurrences of this value
            }
        }

        Set keySet = occurrencesMap.keySet();

        for(Object currentKey : keySet) {
            int occurrences = occurrencesMap.get(currentKey);

            //if occurs odd number of times, we found the unpaired value - no need to continue checking
            if(occurrences % 2 != 0) return (int) currentKey;
        }
        //should never get to here
        throw new RuntimeException("shouldn't get to here - should've return unpaired value by now");
    }
}



