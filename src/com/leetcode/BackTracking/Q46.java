package com.leetcode.BackTracking;

import java.util.ArrayList;
import java.util.List;

public class Q46 {
    //Permutation
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        if (nums == null || nums.length == 0) {
            return result;
        }
        List<Integer> permutation = new ArrayList<>();
        getPermutation(permutation, result, nums);

        return result;
    }

    public void getPermutation (List<Integer> permutation, List<List<Integer>> result, int[] nums) {
        //Base case, return to the previous level if needed
        if (permutation.size() == nums.length) {
            result.add(new ArrayList(permutation));
            return;
        } for (int i = 0; i < nums.length; i++) {
            if (permutation.contains(nums[i])) {
                continue;
            }
            permutation.add(nums[i]);
            getPermutation(permutation, result, nums);
            //Try the very last combinations, switch the numbers if it needed
            System.out.println(permutation.remove(permutation.size()-1));
        }
    }

    public static void main (String[] args) {
        Q46 permutations = new Q46();
        int nums[] = {1,2,3};
        permutations.permute(nums);
    }

}
