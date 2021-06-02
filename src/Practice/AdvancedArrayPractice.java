package Practice;

import java.util.Arrays;

public class AdvancedArrayPractice {

    // 2. Search a Rotated Array
    public int binarySearchRotated (int[] arr, int key) {
        int high = arr.length;
        int low = 0;
        Arrays.sort(arr);

        binarySearch(arr, key, low, high);

        return -1;
    }
    public int binarySearch (int[] arr, int key, int low, int high) {
        return -1;
    }


    public static void main (String[] args){
        AdvancedArrayPractice aap = new AdvancedArrayPractice();

    }


}
