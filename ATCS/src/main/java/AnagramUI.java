import java.util.Scanner;

/**
 * Anagram user interface for ATCS
 *
 * @author Ari Camhi
 * @version 11-15-22
 */
public class AnagramUI {
    public static void main(String[] args){

    }

    public void AnagramUI(){
        Scanner sc = new Scanner(System.in);
        boolean playAgain = true;
        while(playAgain){
            System.out.println("Insert integer value of max length for words");
            String characterLimit = sc.next();
            System.out.println("Insert the name of the file for the dictionary to scan");
            String fileName = sc.next();

        }
    }
}
