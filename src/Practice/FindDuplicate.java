package Practice;
import java.util.Arrays;

public class FindDuplicate {
    /*
    Insertion sort O(n^2)
    Selection Sort

    Merge Sort O(nlogn)
    Quick Sort
     */

    // Sort & Search (Sequential, Binary Search)

    public static void main(String[] args){
        System.out.println("Find Duplicate");
        int[] arr = {3,5,6,7,8,3,1};
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
        System.out.println();

        //Sequential Search
        for (int i = 0; i < arr.length-1; i++){ //O(n)

            if (arr[i] != arr[i+1]  ) {
                //1 3 3 5 6 7 7 8
                System.out.print(arr[i]);
            }
            if (i == arr.length-1 ){
                System.out.print(arr[i]);
            }
        }

    }

}
