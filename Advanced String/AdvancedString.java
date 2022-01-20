/**
 * Class for advanced string topics 
 * such as checking for different conditions
 * and altering the strings in a specific 
 * way
 * 
 * @author Ari Camhi
 * @version 11-18-21
 */
public class AdvancedString{
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
     * Method to translate a word into pig latin
     * using the field string s
     * 
     * @return the word now in pig latin
     */
    public String toPigLatin(){
        String output = "";
        //If word has vowel as first letter or no vowels, same rule
        //is applied, just add yay to the end

        return output;
    }

    /**
     * part  b
     */
    public String toPigLatinPartA(){
        String output = "";
        if(s.charAt(0) == ('a') || s.charAt(0) == ('e') 
        ||s.charAt(0) == ('i') || s.charAt(0) == ('o') || 
        s.charAt(0) == ('u')){
            output+= s + "yay";
        }
        else{
            char x = s.charAt(0);
            output += s.substring(1) + x + "yay";
        }
        return output;
    }

    /**
     * trying to find the indexOf the first vowel
     * so we can use it in the substring up above
     */
    public int findVowels () {
        int i;
        for(i = 0; (s.charAt(i) != ('a') || s.charAt(i) != ('e') || s.charAt(i) != ('i') || 
        s.charAt(i) != ('o') || 
        s.charAt(i) != ('u')) && i >= s.length ();  i++ ) {
        
        }
        return i;
    }

    /**
     * part  b
     */
    public String toPigLatinPartB(){
        String output = "";
        if(s.charAt(0) == ('a') || s.charAt(0) == ('e') 
        ||s.charAt(0) == ('i') || s.charAt(0) == ('o') || 
        s.charAt(0) == ('u')){
            output+= s + "yay";
        }
        else {
            output += s.substring(findVowels()) + s.substring(0, findVowels()) + "yay";
        }
        return output;
    }
}