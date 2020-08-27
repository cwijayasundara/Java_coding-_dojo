package com.cham.codeexercise.codility;
import java.util.Arrays;
public class CyclicRotation {

    public int[] solution(int[] A, int K){
        for (int i = 1; i <= K; i++) {
            System.out.println("Value of K is " + i);
            rightRotateByOne(A);
            System.out.println("Value of A is " + Arrays.toString(A));
        }
        return A;
    }

    private void rightRotateByOne(int[] A)
    {
        int last = A[A.length - 1];
        for (int i = A.length - 2; i >= 0; i--) {
            A[i + 1] = A[i];
        }
        A[0] = last;
    }
}
