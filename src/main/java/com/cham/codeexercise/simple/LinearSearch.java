package com.cham.codeexercise.simple;

/*
Write a method that returns the index of the first occurrence of given integer in a list.
Assume that the index of the first element in the list is zero.
If the number does not exist return -1.
 */
public class LinearSearch {

    public int search(int[] ints, int searchInt){
        int retVal = -1;
        for (int i=0; i<ints.length;i++){
            if (ints[i] ==searchInt){
                retVal = i;
                break;
            }
        }
        return retVal;
    }
}
