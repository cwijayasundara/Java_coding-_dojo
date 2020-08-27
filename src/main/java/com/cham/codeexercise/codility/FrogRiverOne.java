package com.cham.codeexercise.codility;

import java.lang.reflect.Array;
import java.util.HashSet;
import java.util.Set;

public class FrogRiverOne {

    public int solution(int X, int[] A){

        boolean[] isLeafFallAtPointArr = new boolean[X+1];
        int usefulLeafCounter = 0;

        for(int i=0; i<A.length; i++) {
            //private int[] locations = {1,3,1,4,2,3,5,4};
            if(!isLeafFallAtPointArr[A[i]]) {
                isLeafFallAtPointArr[A[i]] = true;
                usefulLeafCounter++;
                if(usefulLeafCounter == X) { return i;}
            }
        }
        return -1;
    }

    public int solution2(int X, int[] A){
        Set requiredLeavesSet = new HashSet();
        for(int i=1; i<=X; i++) {
            requiredLeavesSet.add(i);
        }
        Set currentLeavesSet = new HashSet();
        for(int p=0; p<A.length; p++) {
            currentLeavesSet.add(A[p]);
            if(currentLeavesSet.containsAll(requiredLeavesSet)) {
                return p;
            }
        }
        return -1;
    }
}

