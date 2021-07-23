package com.leetcode.BackTracking;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;


public class Q47 {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        List<Integer> permutation = new ArrayList<>();
        int[] visited = new int[nums.length];
        getPermutations(permutation, result, nums, visited);


        return result;
    }
    public void getPermutations (List<Integer> permutation, List<List<Integer>> result, int[] nums, int[] visited) {
        //visited array only store 1 and 0 which means yea and no
        if (permutation.size() == nums.length) {
            result.add(new ArrayList(permutation));
        }
        for (int i = 0; i < nums.length; i++) {
            if (visited[i] == 1 || (i>0 && nums[i-1] == nums[i] && visited[i-1] == 0)) {
                continue;
            }
            visited[i] = 1;
            permutation.add(nums[i]);
            getPermutations(permutation, result, nums, visited);
            permutation.remove(permutation.size() - 1);
            visited[i] = 0;
        }
    }

}
