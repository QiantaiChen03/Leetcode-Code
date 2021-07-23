package com.leetcode.BackTracking;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class Q254 {
    //Factor Combinations
    public List<List<Integer>> getFactors(int n) {
        List<List<Integer>> result = new ArrayList<>();
        if (n <= 3) {
            return result;
        }
        List<Integer> permutation = new ArrayList<>();
        getPermutation(permutation, result, n, -1);

        return result;
    }


    public void getPermutation (List<Integer> permutation, List<List<Integer>> result, int n, int low) {
        //only pass if it is a valid combination. when low is not -1 anymore. And low is a factor of n
        if (low != -1) {
            permutation.add(n);
            result.add(new ArrayList(permutation));
            permutation.remove(permutation.size() - 1);
        }
        int high = (int) Math.sqrt(n);
        for (int i = Math.max(2, low); i <= high; i++) {
            if (n % i == 0) {
                permutation.add(i);
                //Pass the n divide by i, which is essentially looking for other alternative combination
                getPermutation(permutation, result, n/i, i);
                permutation.remove(permutation.size() - 1);
            }
        }
    }

}
