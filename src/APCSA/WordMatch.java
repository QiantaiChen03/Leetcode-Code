package APCSA;

public class WordMatch {
    private String secret;

    public WordMatch (String word) {
        this.secret = word;
    }

    public int scoreGuess (String guess) {
        int lenS = secret.length();
        int count = 0;
        for (int i = 0; i < lenS - guess.length(); i++) {
            if (secret.substring(i,i+guess.length()).equals(guess)) {
                count++;
            }
        }
        return count * guess.length() * guess.length();
    }


    public String findBetterGuess (String guess1, String guess2) {
        int score1 = scoreGuess(guess1);
        int score2 = scoreGuess(guess2);

        if(score1 > score2) {
            return guess1;
        } else if (score2 > score1) {
            return guess2;
        } else {
            if(guess1.compareTo(guess2) > 0) {
                return guess1;
            } else {
                return guess2;
            }
        }
    }


    public static void main (String[] args) {
        WordMatch game = new WordMatch("mississippi");
        System.out.println(game.scoreGuess("iss"));
    }

}
