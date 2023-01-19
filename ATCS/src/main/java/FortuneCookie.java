import java.io.IOException;
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
    private String fortunePhrase;

    /**
     * Empty Constructor
     */
    public FortuneCookie() throws IOException {
        generateFortunePhrase();
        generateLuckyNumbers();
    }

    /**
     * Constructor basically just for testing
     *
     * @param luckyNumbers of FortuneCookie
     */
    public FortuneCookie(ArrayList<Integer> luckyNumbers) {
        this.luckyNumbers = luckyNumbers;
        fortunePhrase = "Today is your lucky day!";
    }

    /**
     * Constructor with already preset variables
     *
     * @param luckyNumbers  of FortuneCookie
     * @param fortunePhrase of FortuneCookie
     * @throws IOException
     */
    public FortuneCookie(ArrayList<Integer> luckyNumbers, String fortunePhrase) throws IOException {
        this.luckyNumbers = luckyNumbers;
        this.fortunePhrase = fortunePhrase;
        generateLuckyNumbers();
        generateFortunePhrase();
    }

    public FortuneCookie(String fortunePhrase) {
        this.fortunePhrase = fortunePhrase;
    }

    /**
     * Getter in the form of a String...
     * Converting the ArrayList to a String as specified
     * in Lab
     *
     * @return luckyNumbers in String form
     */
    public String getLuckyNumbers() {
        return luckyNumbers.toString();
    }

    /**
     * Getter for the phrase of the fortune
     *
     * @return fortune
     */
    public String getFortunePhrase() {
        return fortunePhrase;
    }

    @Override
    public String toString() {
        return "FortuneCookie{" +
                "luckyNumbers=" + luckyNumbers +
                ", fortunePhrase='" + fortunePhrase + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof FortuneCookie)) return false;
        FortuneCookie that = (FortuneCookie) o;
        return Objects.equals(getLuckyNumbers(), that.getLuckyNumbers()) && Objects.equals(getFortunePhrase(), that.getFortunePhrase());
    }


    /**
     * Generates the fortune phrase of the FortuneCookie
     *
     * @throws IOException
     */
    public void generateFortunePhrase() throws IOException {
        CreateArrayFromFile c = new CreateArrayFromFile("fortunes.txt");
        Random r = new Random();
        int j = r.nextInt(c.getSize());
        String[] arr;
        arr = c.getFile();
        if (arr[j].equals("")) {
            j--;
        }
        fortunePhrase = arr[j];
    }

    /**
     * Basic compareTo method to compare two
     * FortuneCookie objects
     *
     * @param other FortuneCookie
     * @return 0 if equal, -1 if not equal
     */
    public int compareTo(FortuneCookie other) {
        FortuneCookie f1 = new FortuneCookie(luckyNumbers);
        if (f1.equals(other)) {
            return 0;
        } else
            return -1;
    }

    /**
     * Fills in the lucky numbers
     */
    public void generateLuckyNumbers() {
        Random r = new Random();
        int temp;
        //Making new ArrayList because of some NullPointerException error
        ArrayList<Integer> al = new ArrayList<>(6);
        al.add(r.nextInt(100));
        for (int i = 1; i < 6; i++) {
            temp = r.nextInt(100);
            if (al.contains(temp)) {
                i--;
            } else
                al.add(temp);
        }
        luckyNumbers = al;
    }


    /**
     * Quick testing to see if methods work
     */
    public static void main(String[] args) throws IOException {
        FortuneCookie fc = new FortuneCookie();
        fc.generateLuckyNumbers();
        System.out.println(fc.getLuckyNumbers());
        fc.generateFortunePhrase();
        System.out.println(fc.getFortunePhrase());
        FortuneCookie fc2 = new FortuneCookie();
        System.out.println(fc2);
    }
}
