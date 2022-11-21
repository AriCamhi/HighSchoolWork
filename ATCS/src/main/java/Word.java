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

    /**
     * Constructor that takes in the initial word as the parameter
     * also sets the alpha word by using convertAlpha
     *
     * @param initialWord, the word in non-alphabetical order
     */
    public Word(String initialWord) {
        this.initialWord = initialWord;
        alphaWord = convertAlpha(initialWord);
    }

    //Getters below
    public String getInitialWord() {
        return initialWord;
    }
    public String getAlphaWord() {
        return alphaWord;
    }

    /**
     * Method to sort the initialWord into an alpha word
     * in alphabetical order
     * @param initialWord, the word that will be converted into alphabetical order
     * @return the initialWord in alphabetical order
     */
    private String convertAlpha(String initialWord){
        char[] a = initialWord.toCharArray();
        Arrays.sort(a);
        return String.valueOf(a);
    }

    /**
     * Equals method to see if two words are anagrams of each other
     *
     * @param that, the word you are inputting
     * @return true or false
     */
    public boolean equals(Word that) {
        return alphaWord.equals(that.alphaWord);
    }

    @Override
    public String toString() {
        return "Word{" +
                "initialWord='" + initialWord + '\'' +
                ", alphaWord='" + alphaWord + '\'' +
                '}';
    }

    /**
     * Some testing
     */
    public static void main(String[] args){
        Word w = new Word("cear");
        Word a = new Word("race");
        System.out.println(w.convertAlpha("brain"));
        System.out.println(a.equals(w));
        System.out.println(a);
    }
}
