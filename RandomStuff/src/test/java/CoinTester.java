/**
 * Tester to test the coin method
 */
public class CoinTester {
    public static void main(String[] args) {
        Coins c1 = new Coins(25);
        Coins c2 = new Coins(49);

        c1.compareTo(c2);
        c1.toString();
    }
}