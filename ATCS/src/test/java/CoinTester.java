/**
 * Tester to test the coin method
 */
public class CoinTester {
    public static void main(String[] args) {
        Coins c1 = new Coins(25);
        Coins c2 = new Coins(49);
        Coins c3 = new Coins(78);
        Coins c4 = new Coins(15);
        Coins c5 = new Coins(15);

        //Comparing two coins
        c1.compareTo(c2);
        c3.compareTo(c4);
        c4.compareTo(c5);

        //Seeing if two coins are equal
        c4.equals(c5);
        c1.equals(c3);
        c2.equals(c3);

    }
}