import java.util.Scanner;

/**
 * Code along with ATCS
 *
 * @author Ari Camhi
 * @version 10-13-22
 */
public class ScanPractice {
    public static void main(String[] args) {
        ScanPractice sp = new ScanPractice();
        sp.scanPrac();
    }

    public void scanPrac() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Type something in");
        String str = scan.next();
        System.out.println("You just typed in the following: " + str);
        System.out.print("\033[H\033[2J"); //Clears the terminal in the middle of a method
        System.out.flush();
        System.out.println("Type in a number");
        int num = scan.nextInt();
        System.out.println("You just typed in the following: " + num);
    }
}
