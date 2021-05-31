package APCSA;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class ArrayResizer {
    public static boolean isNonZeroRow (int[][] array2D, int r) {
        for (int i = r; i < r+1; i++) {
            for (int j = 0; i < array2D[i].length; j++) {
                if (array2D[i][j] == 0) {
                    return false;
                } else {
                    return true;
                }
            }
        }
        return true;
    }

    public static int numNonZeroRows (int[][] array2D) {
        int count = array2D.length;
        for (int i = 0; i < array2D.length; i++) {
            if (isNonZeroRow(array2D, i)) {
                count--;
            }
        }
        return count;
    }

    public static int[][] resize (int[][] array2D) {
        int array[][] = new int[numNonZeroRows(array2D)][array2D[0].length];

        int count = 0;
        for (int i = 0; i < array2D.length; i++) {
            if (isNonZeroRow(array2D, i) == true) {
                array[count] = array2D[i];
                count++;
            }
        }
        return array;
    }

    public static void main (String[] args) {
        ArrayResizer ar = new ArrayResizer();
        int [][] arr = {{1 , 2, 3, 4}, {0, 1, 2, 3}, {0 , 0, 0 , 0}, {1, 2, 3 , 5}};
        int [][] smaller = ArrayResizer.resize(arr);
        for (int i = 0; i < smaller.length; i++) {
            for ( int j = 0; j < smaller[i].length; j++) {
                System.out.print(smaller[i][j]);
            }
            System.out.println();
        }

    }
}
