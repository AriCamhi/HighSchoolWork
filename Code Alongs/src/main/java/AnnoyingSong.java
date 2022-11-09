import java.util.Scanner;
/**
 * Annoying song UI
 * 
 * @author Ari Camhi
 * @version 12/1/21
 */
public class AnnoyingSong{
    /**
     * Making a new scanner to ask the user 
     * if they want to hear the annoying song
     * 
     */
    public void runUIAnnoyingSong(){
        Scanner sc = new Scanner(System.in);

        String lyrics = "This is the song that never ends.\n"
             + "Yes, it goes on and on my friends!\n"
             + "Some people started singing it\n"
             + "not knowing what it was\n"
             + "and they'll continue singing it\n"
             + "forever just because\n";

        System.out.println("Would you like to hear the annoying song?");
        System.out.println("Hint: Respond with 'yes' or 'no'");
        while (sc.next().equals("yes")){
            System.out.println(lyrics);
            System.out.println("Do you want to hear it again?");
            sc.next();
            System.out.println(lyrics);
            System.out.println("Do you want to hear it again?");
        } 
        sc.close();
    }
}