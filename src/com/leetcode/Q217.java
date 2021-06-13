package com.leetcode;

import java.util.HashSet;

public class Q217 {
    public boolean containsDuplicate(int[] nums) {
        //Map<Integer, Integer> ht = new HashTable<Integer, Integer>();

        HashSet<Integer> hs = new HashSet<Integer>();
        for(int i = 0; i < nums.length; i++){
            if(hs.contains(nums[i])){
                return true;
            }else{
                hs.add(nums[i]);
            }
        }
        return false;

    }
}
