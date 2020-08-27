package com.cham.codeexercise.codility;

public class TapeEqulibrium {

    public int solution(int[] A){
        long sumAllElements = 0;
        // calculate the sum of all the elements
        for(int i=0; i<A.length; i++) {
            sumAllElements += A[i];
        }
        System.out.println("Sum of all the values are " + sumAllElements);

        int minDifference = Integer.MAX_VALUE;
        int currentDifference = Integer.MAX_VALUE;
        long sumFirstPart = 0;
        long sumSecondPart = 0;

        for(int p=0; p<A.length-1; p++) {
            sumFirstPart += A[p];
            sumSecondPart = sumAllElements - sumFirstPart;
            currentDifference = (int) Math.abs(sumFirstPart - sumSecondPart);
            minDifference = Math.min(currentDifference, minDifference);
        }
        return minDifference;
    }
}
