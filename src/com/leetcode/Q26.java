package com.leetcode;

public class Q26 {
    // Remove Duplicates from Sorted Array
    public int removeDuplicates(int[] nums) {
        //1,1,2
        int x = 0;
        int arrayIndex = 1;
        for(int i = 1; i < nums.length; i++){
            if(nums[x] != nums[i]){
                nums[arrayIndex] = nums[i];
                x++;
                arrayIndex++;
            }
        }return arrayIndex;
    }
}
