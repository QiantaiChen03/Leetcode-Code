package APCSA;

public class Word2DArray {


    //private String[][] wordsMatrix;

    public String combine(String[][] wordsMatrix, int num) {
        String result = "";
        int count = 0;

        for (int i = 0; i < wordsMatrix[0].length; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < wordsMatrix.length; j++) {
                    if (count < num) {
                        result += wordsMatrix[j][i];
                        count++;
                    }
                }
            } else if (i % 2 == 1){
                for (int j = wordsMatrix.length - 1; j >= 0; j--) {
                    if (count < num) {
                        result += wordsMatrix[j][i];
                        count++;
                    }
                }
            }
        }

        return result;
    }

    public int numStartsWith (String[][] wordsMatrix, String check) {
        int count = 0;
        for (int i = 0; i < wordsMatrix.length; i++) {
            for (int j = 0; j < wordsMatrix[0].length; j++) {
                if (wordsMatrix[i][j].substring(0,check.length()).equals(check)) {
                    count++;
                }
            }
        }
        return count;
    }

    public static void main (String[] args) {
        Word2DArray wa = new Word2DArray();

        String[][] wordsMatrix = {{"The",   "Over",  "The",  "Time"},
                                  {"Quick", "Jumps", "Lazy", "The"},
                                  {"Brown", "Fox",   "Dog",  "All"}};
        String answer = wa.combine(wordsMatrix, 9);
        int count = wa.numStartsWith(wordsMatrix, "T");
        System.out.println(count);
        System.out.print(answer);
    }
}
