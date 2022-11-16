import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * WordList class for ATCS Anagram Lab
 *
 * @author Ari Camhi
 * @version 11-14-22
 */
public class WordList {

    /**
     * Empty Constructor
     */
    public WordList(){

    }

    /**
     * Constructor that takes in a filename and character limit
     * and will then construct a list of words from that file
     * with only words less than or equal to that charLimit
     *
     * @param fileName
     * @param charLimit
     * @throws IOException
     */
    public WordList(String fileName, int charLimit) throws IOException {
        int count = 0;
        File input = new File(fileName);
        Scanner words = new Scanner(input);
        while (words.hasNextLine()) {
            String line = words.nextLine();
            count++;
        }
        words.close();
        int count2 = 0;
        File input2 = new File(fileName);
        Scanner words2 = new Scanner(input2);
        String[] file = new String[count];
        while (words2.hasNextLine()) {
            file[count2] = words2.nextLine();
            count2++;
        }
        ArrayList<String> arrLi = new ArrayList<>();
        for (int i = 0; i < file.length; i++) {
            if (file[i].length() <= charLimit) {
                arrLi.add(file[i]);
            }
        }
        System.out.println(arrLi);
    }

    /**
     * Method to add a word of choice to the file
     * @param addedWord
     */
    public void addWord(Word addedWord){

    }


    public void generateAnagrams(Word w) throws IOException {
        WordList wl = new WordList("/Users/aricamhi/IdeaProjects/HighSchool" +
                "Work/ATCS/src/main/java/small-words.txt",5);
        int count = 0;
        Scanner s = new Scanner((Readable) wl);
        while(s.hasNextLine()){
            //if()
        }
    }




    public static void main(String[] args) throws IOException{
        //WordList wl = new WordList("/Users/aricamhi/IdeaProjects/HighSchoolWork/ATCS/src/main/java/small-words.txt", 4);
        WordList w1 = new WordList();
        //System.out.println(w1.generateAnagrams("horse", ""));
    }

}
