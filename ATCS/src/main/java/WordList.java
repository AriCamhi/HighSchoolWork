import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

/**
 * WordList class for ATCS Anagram Lab
 *
 * @author Ari Camhi
 * @version 11-14-22
 */
public class WordList {
    private String fileName;
    private int charLimit;
    private final ArrayList<String> al = new ArrayList<>();

    /**
     * Empty Constructor
     */
    public WordList() throws IOException {
        this("", 0);
    }

    /**
     * Constructor that takes in a filename and character limit
     * and will then construct a list of words from that file
     * with only words less than or equal to that charLimit
     *
     * @param fileName  the name of the file that will be used for the WordList
     * @param charLimit the limit of the amount of characters in the WordList
     * @throws IOException
     */
    public WordList(String fileName, int charLimit) throws IOException {
        this.fileName = fileName;
        this.charLimit = charLimit;
        CreateArrayFromFile c = new CreateArrayFromFile(fileName);
        al.addAll(Arrays.asList(c.getFile()));
        pruneWords();
    }


    /**
     * Method to remove words above the charLimit
     */
    private void pruneWords() {
        for (int i = 0; i < al.size(); i++) {
            if (al.get(i).length() > charLimit) {
                al.remove(i);
                i--;
            }
        }
    }


    /**
     * Method to add a word of choice to the file
     *
     * @param addedWord, the word you are going to add to the file
     * @return the list of words with the new added word
     */
    public ArrayList<String> addWord(String addedWord) {
        pruneWords();
        al.add(addedWord);
        return al;
    }


    /**
     * Generates the anagrams of a given word inputted by the user
     *
     * @param w, the word that anagrams will be found for
     * @return list of anagrams
     * @throws IOException
     */
    public ArrayList<String> generateAnagrams(Word w) throws IOException {
        String alpha = w.getAlphaWord();
        ArrayList<String> anagrams = new ArrayList<>();
        for (String s : al) {
            Word wTest = new Word(s);
            if (Objects.equals(alpha, wTest.getAlphaWord().toLowerCase())) {
                anagrams.add(wTest.getInitialWord());
            }
        }
        return anagrams;
    }


    /**
     * Some testing for the methods
     */
    public static void main(String[] args) throws IOException {
        WordList wl = new WordList("src/main/resources/dictionary.txt", 4);
        Word w = new Word("tar");
        WordList wl2 = new WordList("src/main/resources/small-words.txt", 4);
        System.out.println(wl.addWord(w.getInitialWord()));
        System.out.println(wl2.generateAnagrams(w));
    }
}
