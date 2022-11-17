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

    public void AnagramUI() throws IOException {
        Scanner sc = new Scanner(System.in);
        boolean playAgain = true;
        while (playAgain) {
            System.out.println("Insert integer value of max length for words within the dictionary you are going to search for");
            int characterLimit = Integer.parseInt(sc.next());
            System.out.println("Insert the name of the file for the dictionary to scan (dictionary/smallwords)");
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
