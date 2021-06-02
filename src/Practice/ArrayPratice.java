package Practice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class ArrayPratice {

    //1. Return Odd Number In The Array
    //O(n)
    private int[] removeEven (int[] arr) {
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if ((arr[i] % 2) == 1) {
                arr[index] = arr[i];
                index++;
            }
        }
        return arr;
    }

    //2. Merge two array and sort it into order
    //O(m+n)
    public int[] mergeArrays (int[] arr1, int[] arr2) {
        int[] mergedArray = new int[arr1.length + arr2.length];

        int index = 0;
        for (int i = 0; i < arr1.length; i++){
            mergedArray[i] = arr1[i];
            index++;
        }
        for (int i = 0; i < arr2.length; i++){
            mergedArray[index+i] = arr2[i];
        }
        Arrays.sort(mergedArray);
        return mergedArray;
    }

    //3. Two Sum question bruteforce version, better choice is HashTable\
    // n is the target
    // O(n^2)
    public int[] findSum (int[] arr, int n) {
        int[] result = new int [2];

        for (int i = 0; i < arr.length-1; i++) {
            int target = n - arr[i];
            for (int j = i+1; j< arr.length-1; j++) {
                if (target == arr[j]) {
                    result[0] = arr[i];
                    result[1] = target;
                }
            }
        }
        for(int i= 0; i< result.length; i++) {
            System.out.print(result[i]);
        }
        return result;
    }

    // 4. Array of Products of all elements except itself(not finished)
    public int[] findProduct (int arr[]) {
        int[] result = new int[arr.length];
        for (int x = 0; x < arr.length-1; x++){
            result[x] = arr[x];
        }
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (j!=i) {
                    result[i] = result[i] * arr[j];
                }
            }
        }
        return result;
    }

    //5. Find minimum value in array
    //O(nlogn)
    public int findMinimum (int[] arr) {
        Arrays.sort(arr);
        return arr[0];
    }

    //6. Find Non-Repeating Integer in an Array
    //O(n)
    public int findUnique (int[] arr) {
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == arr[i+1]) {
                i++;
            } else {
                return arr[i];
            }
        }
        return -1;
    }

    //6. Find Repeating Integer in an Array
    // O(n)
    public int findNonUnique (int[] arr) {
        HashSet<Integer> hs = new HashSet<Integer>();
        for (int i = 0; i < arr.length-1; i++ ) {
            if (!hs.contains(arr[i])) {
                hs.add(arr[i]);
            } else {
                return arr[i];
            }
        }
        return -1;
    }

    //6. Find First Non-Repeating Integer in an Array
    // HashMap solution
    // O(n)
    public int findFirstUnique (int[] arr) {
        HashMap<Integer, Integer> countElements = new HashMap<>();
        for(int i = 0; i < arr.length; i++){
            countElements.put(arr[i],0);
        }
        for(int i = 0; i < arr.length; i++){
            countElements.put(arr[i],countElements.get(arr[i])+1);
        }
        for(int i = 0; i < arr.length; i++){
            if(countElements.get(arr[i]) <= 1){
                return arr[i];
            }
        }
        return - 1;
    }

    //6. Find First Non-Repeating Integer in an Array
    // Brute Force solution
    // O(n^2)
    public int findFirstUnique2(int[] arr) {
        boolean isRepeated = false;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j] && i != j) {
                    isRepeated = true;
                    break;
                }
            } if (isRepeated == false) {
                return arr[i];
            } else {
                isRepeated = false;
            }
        }
        return - 1;
    }

    //7. Find Second Maximum Value in an Array
    //O(nlogn)
    public int findSecondMaximum (int[] arr) {
        Arrays.sort(arr);
        int index = arr.length - 2;
        return arr[index];
    }

    //8. Right Rotate the Array by One Index
    //O(n)
    public void rotateArray (int[] arr) {
        int lastIndex = arr[arr.length-1];
        for (int i = arr.length-2; i >= 0; i--) {
            arr[i+1] = arr[i];
            if(i==0){
                arr[i] = lastIndex;
            }
        }
    }

    //9. Re-arrange Positive & Negative Values
    // O(n^2)
    public void reArrange (int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 0) {
                for (int j = 0; j < arr.length; j++) {
                    if (arr[j] < 0) {
                        int temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                    }
                }
            }
        }
    }

    //10. Rearrange Sorted Array in Max/Min Form
    //O(n)
    public void maxMin (int[] arr) {
        Arrays.sort(arr);
        int medium = arr.length / 2;
        int high = arr.length-1;
        int low = 0;
        int[] array = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            array[i] = arr[i];
        }
        for (int i = 0; i < array.length; i++){
            if (i % 2 == 0 && high>=medium) {
                arr[i] = array[high];
                high--;
            } else if (i % 2 == 1 && low <= medium) {
                arr[i] = array[low];
                low++;
            }
        }
    }


    public static void main (String[] args) {
        ArrayPratice ap = new ArrayPratice();
        int[] arr = {1,21,3,14,5,60,7,6};
        ap.maxMin(arr);

    }
}
