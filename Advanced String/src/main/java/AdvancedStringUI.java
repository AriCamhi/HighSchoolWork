import java.util.Scanner;
/**
 * User Interface for string 
 * tester
 * 
 * @author Ari Camhi
 * @version 12-3-21
 */
public class AdvancedStringUI{

    public static void main(String[] args){

        AdvancedStringUI ui = new AdvancedStringUI();
        ui.runUI();

    }
    /**
     * User interface that prompts a string first,
     * asks what they would like to do with the string 
     * considering the methods we mad in AdvancedString
     * and asks if they would like to loop the program again
     * 
     */
    public void runUI(){
        String response;
        Scanner sc = new Scanner(System.in);
        boolean userWantsToContinue = true;
        //Starts program
        while (userWantsToContinue) {
            System.out.println("Insert word/string below: ");
            response = sc.nextLine();
            AdvancedString aString = new AdvancedString(response);
            System.out.println("Would you like to check for palindrome, change into genome format or"
            + " translate into pig latin (p/g/pl) ");
            response = sc.nextLine();
            if (response.equalsIgnoreCase("p")){
                System.out.println("Your result is: " + aString.isPalindrome());
            }
            else if (response.equalsIgnoreCase("g")){
                System.out.println("Your result is: " + aString.genomeFormat());
            }
            else if(response.equalsIgnoreCase("pl")){
                System.out.println("Your result is: " + aString.toPigLatin());
            }
            else{
                //Will reset kind of... just keep it here it's smart
            }
            System.out.println("---------------------------");
            System.out.println("Would you like to continue? ('true'/'false')");
            response = sc.nextLine();
            if (response.equalsIgnoreCase("false")) {
                userWantsToContinue = false;
                //This is if they want to exit the program and no longer run it
            }
        }
        System.out.println("Program has closed :(");
        sc.close();
    }
}