package Practice;

public class BinarySearch2 {
    /*
     * Find the index of target value, return -1 if not found
     * while loop version
     */
    public int binarySearch (int[] arr, int key) {
        int right = arr.length - 1;
        int left = 0;
        while (left <= right) {
            int medium = left + (right - 1) / 2;
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



    public static void main (String[] args) {
        BinarySearch2 bs = new BinarySearch2();
        int[] arr = {2,3,3,3,3,3,5,6,8,9,9,30};
        bs.binarySearch(arr, 30);
    }
}
