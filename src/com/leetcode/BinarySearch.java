package com.leetcode;

import java.util.Arrays;

public class BinarySearch {
    // If found, return index
    // If not found, return -1;
    private int binarySearch (int arr[], int target, int left, int right) {
        if (left > right) {
            return -1;
        }
        else{
            int mid = (left + right) / 2;

            if (target == arr[mid]) {
                return mid;
            }
            else if(target < arr[mid]) {
                return binarySearch(arr, target, left, mid-1);
            }
            else{
                return binarySearch(arr, target, mid+1, right);
            }
        }
    }

    private void insertionSort (int arr[]) {
        for (int i = 1; i < arr.length; i++) {
            int x = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > x) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = x;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    private int sequentialSearch(int arr[], int target){
        for (int i = 0; i < arr.length; i++){
            if (target == arr[i]) {
                System.out.print(arr[i]);
                return i;
            }
        }
        return -1;
    }

    public static void main (String[] args) {
        BinarySearch bs = new BinarySearch();

        //Sequential Search
        int[] a = {62,98,33,21,60,96,75,46};
        int result1 = bs.sequentialSearch(a, 98);
        if (result1 == -1){
            System.out.println("Element not found");
        }else{
            System.out.println("Element found at location " + result1);
        }

        // Binary Search by using insertion sort
        int[] b = {62,98,33,21,60,96,75,46};
        bs.insertionSort(b);
        int result = bs.binarySearch(b, 96, 0, a.length-1);
        if (result == -1){
            System.out.println("Element not found");
        }else{
            System.out.println("Element found at location " + result);
        }

    }
}
