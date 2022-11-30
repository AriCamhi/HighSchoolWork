import java.util.ArrayList;
import java.util.Objects;
import java.util.Random;

/**
 * FortuneCookie class for the Fortune Cookie
 * Lab in ATCS
 *
 * @author Ari Camhi
 * @version 11-30-22
 */
public class FortuneCookie {
    private ArrayList<Integer> luckyNumbers;
    private String fortune;

    /**
     * Empty Constructor
     */
    public FortuneCookie(){

    }

    public FortuneCookie(ArrayList<Integer> luckyNumbers){
        this.luckyNumbers = luckyNumbers;
    }

    public FortuneCookie(ArrayList<Integer> luckyNumbers, String fortune){
        this.luckyNumbers = luckyNumbers;
        this.fortune = fortune;
    }

    public FortuneCookie(String fortune){
        this.fortune = fortune;
    }

    /**
     * Getter in the form of a String...
     * Converting the ArrayList to a String as specified
     * in Lab
     * @return luckyNumbers in String form
     */
    public String getLuckyNumbers(){
        return luckyNumbers.toString();
    }

    @Override
    public String toString() {
        return "FortuneCookie{" +
                "luckyNumbers=" + luckyNumbers +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof FortuneCookie)) return false;
        FortuneCookie that = (FortuneCookie) o;
        return Objects.equals(getLuckyNumbers(), that.getLuckyNumbers());
    }

    /**
     * Basic compareTo method to compare two
     * FortuneCookie objects
     * @param other FortuneCookie
     * @return 0 if equal, -1 if not equal
     */
    public int compareTo(FortuneCookie other){
        FortuneCookie f1 = new FortuneCookie(luckyNumbers);
        if(f1.equals(other)){
            return 0;
        }
        else
            return -1;
    }

    /**
     * Fills in the lucky numbers
     */
    public void generateLuckyNumbers(){
        Random r = new Random();
        int temp;
        //Making new ArrayList because of some NullPointerException error
        ArrayList<Integer> al = new ArrayList<>(6);
        al.add(r.nextInt(100));
        for(int i = 1; i < 6; i ++){
            temp = r.nextInt(100);
            if(al.contains(temp)){
                i--;
            }
            else
                al.add(temp);
        }
        luckyNumbers = al;
    }

    /**
     * Quick testing to see if methods work
     */
    public static void main (String[] args){
        FortuneCookie fc = new FortuneCookie("live in prosperity");
        fc.generateLuckyNumbers();
        System.out.println(fc.getLuckyNumbers());
    }
}
