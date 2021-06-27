package com.leetcode;

import java.util.Arrays;

public class Q1913 {
    // Maximum Product Difference Between Two Pairs
    public int maxProductDifference(int[] nums) {
        Arrays.sort(nums);
        int lastIndex = nums.length;
        int result = (nums[lastIndex] * nums[lastIndex - 1]) - (nums[0] * nums[1]);

        return result;

    }



    public static void main (String[] args) {
        Q1913 maxProduct = new Q1913();
        int nums[] = {5,6,2,7,4};
        maxProduct.maxProductDifference(nums);
    }
}
