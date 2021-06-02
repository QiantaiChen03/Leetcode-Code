package com.leetcode;

import java.util.HashMap;
import java.util.HashSet;

public class TwoSum1 {
    public int[] twoSum (int[] nums, int target) {
        int[] result = new int[2];
        HashMap<Integer, Integer> hs = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int NeededResult = target - nums[i];

            if (hs.containsKey(nums[i])) {
                result[0] = hs.get(nums[i]);
                result[1] = i;
            }
            hs.put(NeededResult, i);
        }
        return result;
    }

    public static void main (String[] args) {
        TwoSum1 ts = new TwoSum1();
        int[] nums = {3,3};
        int[] num = ts.twoSum(nums, 9);
        for (int i = 0; i < num.length; i++) {
            System.out.println(num[i]);
        }

    }


}
