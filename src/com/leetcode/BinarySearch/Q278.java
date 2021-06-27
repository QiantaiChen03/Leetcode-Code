package com.leetcode.BinarySearch;

public class Q278 {
    // First Bad Version
    public int firstBadVersion(int n) {
        int left = 1;
        int right = n;
        while (left <= right) {
            int medium = left + (right - left) / 2;
            if (!isBadVersion(medium)) {
                left = medium + 1;
            } else {
                right = medium-1;
            }
        }
        return left;
    }

    public boolean isBadVersion(int version) {
        return false;
    }
}
