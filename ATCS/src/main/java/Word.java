import java.util.Arrays;

/**
 * Word class for the anagram lab in ATCS
 *
 * @author Ari Camhi
 * @version 11-9-22
 */
public class Word {

    private String initialWord;
    private String alphaWord;

    public Word(String initialWord) {
        this.initialWord = initialWord;
        alphaWord = convertAlpha(initialWord);
    }

    /**
     * Method to sort the initialWord into an alpha word
     * in alphabetical order
     * @param initialWord
     * @return
     */
    private String convertAlpha(String initialWord){
        char[] a = initialWord.toCharArray();
        Arrays.sort(a);
        return String.valueOf(a);
    }

    /**
     * Equals method to see if two words are anagrams of each other
     *
     * @param w2, the word you are inputting
     * @return true or false
     */
    public boolean equals(Word w2) {
        Word w1 = new Word(initialWord);
        if(w1.alphaWord.equals(w2.alphaWord)){
            return true;
        }
        return false;
    }

    @Override
    /**
     * toString method for word class
     */
    public String toString() {
        return "Word{" +
                "initialWord='" + initialWord + '\'' +
                ", alphaWord='" + alphaWord + '\'' +
                '}';
    }

    public static void main(String[] args){
        Word w = new Word("cear");
        Word a = new Word("race");
        System.out.println(w.convertAlpha("brain"));
        System.out.println(a.equals(w));
        System.out.println(a.toString());
    }
}
