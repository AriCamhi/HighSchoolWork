import java.io.IOException;
import java.util.ArrayList;

/**
 * FCArrayList class for the Fortune Cookie
 * Lab in ATCS. The FCArrayList class holds an
 * ArrayList of Fortunes
 *
 * @author Ari Camhi
 * @version 12-1-22
 */
public class FCArrayList {
    private ArrayList<FortuneCookie> cookieList = new ArrayList<>();

    /**
     * Empty constructor
     */
    public FCArrayList() {

    }

    public FCArrayList(ArrayList<FortuneCookie> cookieList) {
        this.cookieList = cookieList;
    }

    /**
     * Method to return the size of the ArrayList
     *
     * @return size
     */
    public int size() {
        return cookieList.size();
    }

    /**
     * Method to add a fortune to the cookieList given an index
     */
    public void add(int index, FortuneCookie fc) {
        cookieList.add(index, fc);
    }

    /**
     * Lets the user peek at the fortune at the first position
     *
     * @return the toString of fortune at 0th index
     */
    public String peek() {
        FortuneCookie fc = cookieList.get(0);
        return fc.toString();
    }

    /**
     * Lets the user peek at the fortune given the index
     *
     * @param index where the user wants to look
     * @return toString of fortune at nth index
     */
    public String peekI(int index) {
        FortuneCookie fc = cookieList.get(index);
        return fc.toString();
    }

    /**
     * Lets the user peek at the fortune in the first position
     * but then also removes that FortuneCookie from the cookieList
     *
     * @return the toString of fortune at 0th index
     */
    public String poll() {
        FortuneCookie fc = cookieList.get(0);
        String s = fc.toString();
        cookieList.remove(0);
        return s;
    }

    /**
     * Lets user peek at fortune in the given index that they provide
     *
     * @param index in cookieList
     * @return toString of that fortune in nth index
     */
    public String getFortune(int index) {
        FortuneCookie fc = cookieList.get(index);
        return fc.toString();
    }

    /**
     * Lets user decide which index of cookieList they want to remove
     *
     * @param index that is being removed
     * @return toString of specified index
     */
    public String remove(int index) {
        FortuneCookie fc = cookieList.get(index);
        String s = fc.toString();
        cookieList.remove(index);
        return s;
    }

    @Override
    public String toString() {
        return "FCArrayList{" +
                "cookieList=" + cookieList +
                '}';
    }

    public static void main(String[] args) throws IOException {
        FCArrayList fca = new FCArrayList();
        FortuneCookie fc = new FortuneCookie();
        fca.add(0, fc);
        System.out.println(fca.peek());
    }
}
