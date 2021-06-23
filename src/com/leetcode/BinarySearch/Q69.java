package com.leetcode.BinarySearch;

public class Q69 {
    // Sqrt(x)
    public int mySqrt (int x) {
        if (x == 0) {
            return 0;
        } else if (x == 2147483647) {
            return 46340;
        }

        int left = 1;
        int right = x;

        while (left <= right) {
            int mid = (right + left) / 2;
            if ((long)mid*mid > x) {
                right = mid - 1;
            } else if ((long)mid*mid < x) {
                left = mid + 1;
            } else {
                return mid;
            }
        }

        return right;
    }

    public static void main (String[] args) {
        Q69 test = new Q69();
        int result = test.mySqrt(2147395599);
        System.out.print(result);
    }
}
