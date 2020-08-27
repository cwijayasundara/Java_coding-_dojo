package com.cham.codeexercise.codility;

public class MaxCounters {

    public int[] solution(int N, int[] A) {
        int MAX = 0, B = 0, CI;
        int[] C = new int[N];
        for(int i = 0; i < A.length; i++)
        {
            CI = A[i]-1;
            if(A[i] <= N && A[i] >= 1)
            {
                C[CI] = Math.max(B,C[CI]) + 1;
                MAX = Math.max(MAX,C[CI]);
            }else if(A[i] == N + 1)
            {
                B = MAX;
            }
        }
        for(int i = 0; i < C.length; i++)
            C[i] = Math.max(C[i],B);

        return C;
    }
}

