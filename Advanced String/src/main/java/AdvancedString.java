import java.util.Scanner;
/**
 * Class for advanced string topics
 * such as checking for different conditions
 * and altering the strings in a specific
 * way
 *
 * @author Ari Camhi, Zayaan Hussain
 * @version 11-18-21
 */
public class AdvancedString{
    //Fields
    private String s;

    /**
     * Overloaded Constructor
     */
    public AdvancedString(String s){
        this.s = s;
    }

    /**
     * Method for checking if a string is
     * a palindrome the faster way
     *
     * @return true or false to see if string
     * is a palindrome
     */
    public boolean isPalindrome(){
        //Replacing all of these with nothing to test if the entire
        //Sentence is a palindrome, not just a word
        s = s.replaceAll("\\s", "");
        s = s.replaceAll("\\.", "");
        s = s.replaceAll("!", "");
        for (int i = 0; i <= (s.length() - 1) / 2; i++){
            if(s.charAt(i) != (s.charAt(s.length() - i - 1))){
                return false;
            }
        }
        return true;
    }

    /**
     * Method to add a space inbetween every 3 letters
     * similar to the building blocks of DNA (genomes)
     *
     * @return the new string with a space every 3 letters
     */
    public String genomeFormat(){
        String output = "";
        int a = 0;
        int b = 3;
        for (int i = 0; s.length() > a; i++){
            if (b < s.length()){
                output += (s.substring(a,b) + " ");
            }
            else{
                output += (s.substring(a));
            }
            a += 3;
            b += 3;
        }
        return output;
    }

    /**
     * Trying to find the indexOf the first vowel
     * so we can use it in the toPigLatin
     *
     * @return where the first vowel is in the string
     */
    public int findVowels () {
        int i = 0;
        while (i < s.length()) {
            if (((s.charAt(i) == ('a') || s.charAt(i)== ('e') ||
                    s.charAt(i) == ('i')
                    || s.charAt(i) == ('o')
                    || s.charAt(i) == ('u') || s.charAt(i) == ('A') || s.charAt(i)== ('E') ||
                    s.charAt(i) == ('I')
                    || s.charAt(i) == ('O')
                    || s.charAt(i) == ('U')))) {
                return i;
            }else {
                i++;
            }
        }
        return i;
    }

    /**
     * Translates a single word from English to Pig Latin
     *
     * @param an English word
     *
     * @return the new Pig Latin word
     */
    public String wordToPigLatin(String s){
        int i = 0;
        String output = "";
        //If vowel as first letter below
        if(s.charAt(0) == ('a') || s.charAt(0) == ('e')
                ||s.charAt(0) == ('i') || s.charAt(0) == ('o') ||
                s.charAt(0) == ('u')|| s.charAt(0) == ('A') || s.charAt(0)== ('E') ||
                s.charAt(0) == ('I') || s.charAt(0) == ('O') || s.charAt(0) == ('U')){
            output+= s + "yay";
        }
        //No vowel words below
        else if (s.length() == findVowels()){
            output += s + "yay";
        }

        //Consonant as first letter words below
        else {
            output += s.substring(findVowels()) +
                    s.substring(0, findVowels()) + "ay";
        }
        return output;
    }

    /**
     * The main method that will translate a word
     * and a sentence of English to Pig Latin
     *
     * @return the new translated word/sentence Pig Latin
     */
    public String toPigLatin() {
        Scanner sc = new Scanner(s);
        String output = "";
        while (sc.hasNext()) {
            s = sc.next();
            String y = wordToPigLatin(s);
            output = output + y.toLowerCase() + " ";
        }
        output = output.trim();
        output = output.replaceAll("\\.", "");
        output = output.replaceAll("!", "");
        output = output.replaceAll("," , "");
        output = output.replaceAll("\\?" , "");
        return output;
    }
}