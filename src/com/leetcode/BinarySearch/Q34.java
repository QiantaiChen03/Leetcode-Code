package com.leetcode.BinarySearch;

public class Q34 {
    //Find First and Last Position of Element in Sorted Array
    public int[] searchRange (int[] nums, int target) {

        int[] result = new int[2];

        int left = 0;
        int right = nums.length - 1;
        //5,7,7,8,8,10
        while (left <= right) {
            int medium = left + (right - left) / 2;
            if (target > nums[medium]) {
                left = medium + 1;
                System.out.println("left: " + left);
            } else if (target < nums[medium]) {
                right = medium - 1;
                System.out.println("right: " + right);
            } else if (target == nums[medium]) {
                int first = checkBefore(nums, target, medium);
                System.out.println("first: " + first);
                result[0] = first;
                int last = checkAfter(nums, target, medium);
                System.out.println("last: " + last);
                result[1] = last;
                return result;
            }
        }
        result[0] = -1;
        result[1] = -1;
        return result;
    }

    public int checkBefore (int[] nums, int target, int medium){
        int result = medium;
        for (int i = medium; i >= 0; i--) {
            if (nums[i] == target) {
                result = i;
            }
        }
        return result;
    }

    public int checkAfter (int[] nums, int target, int medium) {
        int result = medium;
        for (int i = medium; i < nums.length; i++) {
            if (nums[i] == target) {
                result = i;
            }
        }
        return result;
    }

    public static void main (String[] args) {
        Q34 findFirstLast = new Q34();
        int[] nums = {2, 2};
        int[] result = findFirstLast.searchRange(nums, 2);
        System.out.println(result[0] + " " + result[1]);
    }
}
