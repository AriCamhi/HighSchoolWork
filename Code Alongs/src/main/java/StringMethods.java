/**
 * Methods that might help us work with Strings later
 *
 * @author Ari Camhi
 * @version 11-3-21
 */
public class StringMethods{
    /**
     * Print out a length of a String, the first letter,
     * last letter, and index of i andd z
     */
    public void statusOf(String s){
        System.out.println(s);
        System.out.println("Length: " + s.length());
        System.out.println("First Letter: " + s.charAt(0));
        //Write a line of code to print out the last letter of the word
        System.out.println("Last Letter: " + s.charAt(s.length() - 1));
        System.out.println("a is at the " + s.indexOf('a') + " index");
    }

    /**
     * Predict Implement Describe
     * 
     * Prediction: it will print the word chappaqua
     * Describe: It printed out chappawua on different lines
     */
    public void statusOfChappaqua(){
        String s = "Chappaqua";
        for (int i = 0; i < s.length(); i++){
            System.out.println(s.charAt(i));
        }
    }

    /**
     * Predict Implement Describe
     * 
     * 
     * 
     * Prediction: It will print whatever you implement as string s
     * Describe: It prints out the word backwards
     */
    public String backwards(String s){
        String t = "";
        for (int i = s.length() - 1; i >= 0; i--){
            t += s.charAt(i); 
        }
        return t;
    }

    /**
     * Predict. Implement. Describe.
     */
    public void trueOrFalse(){
        String a = new String("hello");
        String b = new String("hello");
        String c = a;

        System.out.println(a == b);
        System.out.println(a == "hello");
        System.out.println(a == c);
        System.out.println(a.equals(b));
        System.out.println(a.equals("Hello"));
        System.out.println(a.equalsIgnoreCase("Hello"));
    }

    /**
     * Quick Activity
     * 
     * @param String s1 String s2
     */
    public String firstLexicographically(String s1, String s2){
        if (s1.compareTo(s2) < 0){
            return s1;
        }
        else {
            return s2;
        }
    }
    
    
}