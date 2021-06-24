package Practice;

import java.util.Arrays;

public class BinarySearch2 {
    /*
     * Find the index of target value, return -1 if not found
     * while loop version
     */
    public int binarySearch (int[] arr, int key) {
        int right = arr.length - 1;
        int left = 0;
        while (left <= right) {
            int medium = left + (right - left) / 2;
            if (arr[medium] == key) {
                return medium;
            } else if  (arr[medium] > key) {
                right = medium - 1;
            } else {
                left = medium + 1;
            }
        }
        return -1;
    }

    public int firstGreaterOrEqual (int[] arr, int key) {
        int n = arr.length;
        int l = 0;
        int r = n;
        while (l < r) {
            int m = l + (r - l) / 2;
            if (arr[m] >= key) {
                r = m;
            } else {
                l = m + 1;
            }
        }
        return l <= n-1 ? l : -1;
    }

    public int firstIndex (int[] arr, int key) {
        int n = arr.length;
        int l = 0;
        int r = n;
        while (l < r) {
            int m = 1 + (r - l) / 2;
            if (arr[m] >= key) {
                r = m;
            } else {
                l = m + 1;
            }
        }
        return (l <= n-1 && arr[l] == key) ? l : -1;
    }

    public int firstGreater (int[] arr, int key) {
        int n = arr.length;
        int l = 0;
        int r = n-1;
        while (l < r) {
            int m = 1 + (r - l) / 2;
            if (arr[m] > key) {
                r = m;
            } else {
                l = m + 1;
            }
        }
        return l < n ? l : -1;
    }

    public int lastIndex (int[] arr, int key) {
        int n = arr.length;
        int l = 0;
        int r = n;
        while (l < r) {
            int m = l + (r - 1) / 2;
            if (arr[m] > key) {
                r = m;
            } else {
                l = m + 1;
            }
        }
        return (l-1 >= 0 && arr[l-1] == key) ? l - 1 : -1;
    }

    public int lastLessOrEqual (int[] arr, int key) {
        int n = arr.length;
        int l = 0;
        int r = n;
        while (l < r) {
            int m = l + (r - l) / 2;
            if (arr[m] <= key) {
                l = m + 1;
            } else {
                r = m;
            }
        }
        return l == 0 ? -1 : l-1;
    }


    public static void main (String[] args) {
        BinarySearch2 bs = new BinarySearch2();
        //int[] arr = {2,3,3,3,3,3,5,6,8,9,9,30};
        int[] arr = {1,1,1,1,1,1,1,2,2,2,2,2,2,2,3,3,3,3,3,5,6,8,9,9,30};
        Arrays.sort(arr); // O(nlongn)

        System.out.println(bs.binarySearch(arr, 30));
        System.out.println(bs.firstGreaterOrEqual(arr, 30));
        System.out.println(bs.firstIndex(arr, 30));
        System.out.println(bs.firstGreater(arr, 30));
        System.out.println(bs.lastIndex(arr, 30));
        System.out.println(bs.lastLessOrEqual(arr, 30));
    }
}
