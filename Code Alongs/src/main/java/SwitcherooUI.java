import java.util.Scanner;

/**
 * 
 * 
 * @author Java Class HGHS 
 * @version 4-19-21
 */
public class SwitcherooUI
{
    /**
     * Will return the the the string with swapped first letters
     * 
     * @return the first letter of both strings swapped and then the new words
     */
    public String switcheroo(String first, String last) {
        //Swaps the first letter of the 2 strings
        return last.charAt(0) + first.substring(1) + " " 
                + first.charAt(0) + last.substring(1);
    }

    /**
     * Makes a new scanner to interact with the user and asks for the 
     * first and last string to then 
     * input switcheroo in
     */
    public void runUI()
    {
        //makes a new scanner
        Scanner sc = new Scanner(System.in);
        
        //Asks the user the first string
        System.out.println("What is your first name?");
        String first = sc.next();
        //Asks user the second string
        System.out.println("What is your last name?");
        String last = sc.next();
        
        //Prints out the switcheroo of the two strings that you input
        System.out.println("Then I will call you " + switcheroo(first, last));
    }
}