/**
 * Scrabble Class to replicate
 * the game of scrabble and see
 * how many points each word is worth
 * through the use of arrays
 *
 * @author Ari Camhi
 * @version 1-6-22
 */
public class ScrabbleScoreKeeper{
    /**
     * Method to compute the score of each word
     *
     * @return the score of the word
     */
    public int computeScore(String word){
        int[] letterValues = new int[] {1, 3, 3, 2, 1, 4, 2, 4, 1, 8, 5, 1, 3, 1, 3, 3,
                10, 1, 1, 1, 1, 4, 4, 8, 4, 10};

        int scrabble = 0;
        for (char c : word.toLowerCase().toCharArray()) {
            int index = c - 'a';
            scrabble += letterValues[index];
        }

        return scrabble;
    }
}
