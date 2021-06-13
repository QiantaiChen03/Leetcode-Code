package com.leetcode;

public class Q1480 {
    //Running Sum of 1d Array
    public int[] runningSum(int[] nums) {
        for(int i = 0 ; i < nums.length ; i++){
            if(i == 0){
                nums[0] = nums[0];
            }else{
                nums[i] = nums[i-1] + nums[i];
            }
        }
        return nums;
    }
}
