package com.leetcode.BinarySearch;

public class Q35 {
    //Search Insert Position

    public int searchInsert(int[] nums, int target) {

        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int medium = left + (right - left) / 2;
            if (target < nums[medium]) {
                right = medium - 1;
            } else if (target > nums[medium]) {
                left = medium + 1;
            } else {
                return medium;
            }
        }
        return left;
    }

}
