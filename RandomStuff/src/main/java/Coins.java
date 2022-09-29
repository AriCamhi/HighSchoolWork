/**
 * Class with two constructors and getters
 * for each different type of coin
 *
 * @author Ari Camhi
 * @version 9-21-22
 */
public class Coins {
    private int quarters;
    private int dimes;
    private int nickels;
    private int pennies;
    private int cents;

    public int getQuarters() {
        return quarters;
    }

    public int getDimes() {
        return dimes;
    }

    public int getNickels() {
        return nickels;
    }

    public int getPennies() {
        return pennies;
    }

    public Coins() {
    }

    public Coins(int cents) {
        this.cents = cents;
    }

    public int optimalChange(int cents) {
        //Finds the optimal change
        //The least amount of coins possible
        int quarters = 0;
        int dimes = 0;
        int nickels = 0;
        int pennies = 0;
        while (cents > 0) {
            if (cents % 25 != cents) {
                quarters += cents / 25.;
                cents = cents % 25;
            } else if (cents % 10 != cents) {
                dimes += cents / 10.;
                cents = cents % 10;
            } else if (cents % 5 != cents) {
                nickels += cents / 5.;
                cents = cents % 5;
            } else {
                pennies += cents;
                cents = 0;
            }
        }
        System.out.println("Quarters: " + quarters + " Dimes: " + dimes + " Nickels: " + nickels
                + " Pennies: " + pennies);
        int totalCoins = quarters + dimes + nickels + pennies;
        return totalCoins;
    }

    public String toString() {

        System.out.println("Quarters: " + getQuarters() + " Dimes: " + getDimes() + " Nickels: " + getNickels()
                + " Pennies: " + getPennies());
        return "Quarters: " + getQuarters() + " Dimes: " + getDimes() + " Nickels: " + getNickels()
                + " Pennies: " + getPennies();
    }


    public void compareTo(Coins c2) {
        Coins c1 = new Coins(cents);
        if (c1.optimalChange(cents) > c2.optimalChange(cents)) {
            System.out.println(1);
        } else if (c1.optimalChange(cents) == c2.optimalChange(cents)) {
            System.out.println(0);
        } else {
            System.out.println(-1);
        }
    }
}
