package com.cham.codeexercise.codility;

public class PermMissingElam {

    public int solution(int[] A){
        long shouldBeLength = A.length + 1;
        long shouldBeSum = (shouldBeLength * (shouldBeLength + 1))/2;
        long calculatedSum = calculateSum(A);
        return (int) (shouldBeSum - calculatedSum);
    }

    private long calculateSum(int[] A) {
        long sum = 0;
        for(int i=0; i<A.length; i++){
            sum += A[i];
        }
        return sum;
    }
}
