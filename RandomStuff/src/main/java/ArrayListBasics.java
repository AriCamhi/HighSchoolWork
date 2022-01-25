import java.io.*;
import java.util.*;

/**
 * Learning ArrayLists and working with them
 * Which is better... Arrays or ArrayLists??
 *
 * @author Ari Camhi
 * @version 1-24-22
 */
public class ArrayListBasics {

    public static void main(String[] args) {

        //Size of an ArrayList soon to be made
        int n = 5;
        //Syntax for making a new ArrayList
        ArrayList<Integer> arrli = new ArrayList<Integer>(n);

        //Just filling up the array
        for (int i = 0; i <= n; i++) {
            arrli.add(i);
        }
        System.out.println(arrli);

        arrli.remove(3);
        System.out.println(arrli);

        for (int k = 0; k < arrli.size(); k++) {
            System.out.println(arrli.get(k) + " ");
        }


    }

}
