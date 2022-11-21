import java.io.IOException;
import java.util.Scanner;

/**
 * Anagram user interface for ATCS
 *
 * @author Ari Camhi
 * @version 11-15-22
 */
public class AnagramUI {
    public static void main(String[] args) throws IOException {
        AnagramUI a = new AnagramUI();
        a.AnagramUI();
    }

    /**
     * Method that just runs the UI for Anagram giving the ability
     * to the user for putting in the charLimit on the dictionary they are going to use for scanning
     * and also the file that the anagrams will be found from. Will then ask for any String
     * to be inputted and generate the anagrams of said word.
     * @throws IOException
     */
    public void AnagramUI() throws IOException {
        Scanner sc = new Scanner(System.in);
        boolean playAgain = true;
        while (playAgain) {
            System.out.println("Insert integer value of max length for words within the dictionary you are going to search for");
            int characterLimit = Integer.parseInt(sc.next());
            System.out.println("Insert the name of the file for the dictionary to scan (dictionary/small-words)");
            String fileName = sc.next();
            WordList wl = new WordList(fileName + ".txt", characterLimit);
            System.out.println("Insert word you would like to generate the anagrams of:");
            String initialWord = sc.next();
            Word w = new Word(initialWord);
            System.out.println(wl.generateAnagrams(w));
            System.out.println("Would you like to run the program again? (yes/no)");
            String response = "";
            playAgain = false;
            response = sc.next();
            if (response.equalsIgnoreCase("yes"))
                playAgain = true;
        }
        System.out.println("Program has closed :(");
        sc.close();
    }
}
