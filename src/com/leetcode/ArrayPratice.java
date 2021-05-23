package com.leetcode;

import java.util.Arrays;

public class ArrayPratice {

    //1. Return Odd Number In The Array
    private int[] removeEven (int[] arr) {
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if ((arr[i] % 2) == 1) {
                arr[index] = arr[i];
                index++;
            }
        }
        return arr;
    }

    //2. Merge two array and sort it into order
    public int[] mergeArrays (int[] arr1, int[] arr2) {
        int[] mergedArray = new int[arr1.length + arr2.length];

        int index = 0;
        for (int i = 0; i < arr1.length; i++){
            mergedArray[i] = arr1[i];
            index++;
        }
        for (int i = 0; i < arr2.length; i++){
            mergedArray[index+i] = arr2[i];
        }
        Arrays.sort(mergedArray);
        return mergedArray;
    }



    public static void main (String[] args) {
        ArrayPratice ap = new ArrayPratice();

    }
}
