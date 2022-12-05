import java.io.IOException;
import java.util.Scanner;

/**
 * Fortune Class for teh Fortune Cookie Lab
 * in ATCS
 *
 * @author Ari Camhi
 * @version 11-30-22
 */
public class Fortune {
    public static void main(String[] args) throws IOException {
        Fortune f = new Fortune();
        f.FortuneUI();
    }

    public void FortuneUI() throws IOException {
        Scanner sc = new Scanner(System.in);
        boolean playAgain = true;
        FCArrayList fca = new FCArrayList();
        while(playAgain){
            System.out.println("What would you like to do...");
            System.out.println("""
                    add(given index) \s
                    peek(0th index) \s
                    peek(given index) \s
                    poll(0th index) \s
                    remove(given index) \s
                    getSize of list \s
                    print out all fortunes \s
                    or quit program... \s
                    Select (add . peek0 . peekI . poll0 . remove . size . print . quit .""");
            String response = sc.next();
            if(response.equals("add")){
                System.out.println("Index to add fortune in: ");
                FortuneCookie fc = new FortuneCookie();
                fca.add(Integer.parseInt(sc.next()), fc);
            }
            else if(response.equals("peek0")){
                System.out.println("FortuneCookie at the 0th position : " + fca.peek());
            }
            else if(response.equals("peekI")){
                System.out.println("Index you would like to peek at: ");
                System.out.println(fca.getFortune(Integer.parseInt(sc.next())));
            }
            else if(response.equals("poll0")){
                fca.poll();
            }
            else if(response.equals("remove")){
                System.out.println("Index you would like to remove: ");
                fca.remove(Integer.parseInt(sc.next()));
            }
            else if(response.equals("size")){
                System.out.println(fca.size());
            }
            else if(response.equals("print")){
                System.out.println(fca);
            }
            else if(response.equals("quit")){
                playAgain = false;
            }
        }
        System.out.println("Program has closed :(");
        sc.close();
    }
}
