package APCSA;

public class ArrayResizer {
    public static boolean isNonZeroRow (int[][] array2D, int r) {
        for (int column = 0; column < array2D[0].length; column++) {
            if (array2D[r][column] == 0) {
                return false;
            }
        }
        //It has strict condition to return ture, so we eliminate the false case in above
        return true;
    }

    public static int numNonZeroRows (int[][] array2D) {

        return -1;
    }

    public static int[][] resize (int[][] array2D) {
        int ifZeroRowExists = numNonZeroRows(array2D);
        int[][] newArray = new int[ifZeroRowExists][array2D[0].length];

        int current = 0;
        for (int i = 0; i < array2D.length; i++) {
            //If it return ture, which means that this row contains no zero elements, add it to newArray
            if (isNonZeroRow(array2D, i)) {
                newArray[current] = array2D[i];
                current++;
            }
        }
        return newArray;
    }
}
