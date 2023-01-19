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

    public void setQuarters(int quarters) {
        this.quarters = quarters;
    }

    public void setDimes(int dimes) {
        this.dimes = dimes;
    }

    public void setNickels(int nickels) {
        this.nickels = nickels;
    }

    public void setPennies(int pennies) {
        this.pennies = pennies;
    }

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

    /**
     * Method that finds the optimal amount of change with the least
     * amount of coins possible
     *
     * @param cents of the given coin
     * @return total amount of coins needed to represent the number of cents
     */
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
        setQuarters(quarters);
        setDimes(dimes);
        setNickels(nickels);
        setPennies(pennies);
        int totalCoins = quarters + dimes + nickels + pennies;
        return totalCoins;
    }

    /**
     * A toString method to print out the optimal change for
     * a given coin.
     *
     * @return string representation of the coin
     */
    public String toString() {
        Coins c1 = new Coins();
        c1.optimalChange(cents);
        return "Quarters: " + c1.getQuarters() + " Dimes: " + c1.getDimes() + " Nickels: " + c1.getNickels()
                + " Pennies: " + c1.getPennies();
    }


    /**
     * Method to compare two coin objects, print out
     * 0 if they are equal, 1 if the first object has more coins,
     * and -1 if the first coin has less coins than the second
     *
     * @param c2, a second coin object to compare the first one to
     */
    public void compareTo(Coins c2) {
        Coins c1 = new Coins(cents);
        String firstCoinString = c1.toString();
        String secondCoinString = c2.toString();
        if (firstCoinString.compareTo(secondCoinString) > 0) {
            System.out.println(1);
        } else if (firstCoinString.compareTo(secondCoinString) == 0) {
            System.out.println(0);
        } else {
            System.out.println(-1);
        }
    }

    /**
     * A method to compare two coin objects to see if they
     * are directly equivalent
     *
     * @param c2, a second coin object to compare the first one to
     */
    public void equals(Coins c2) {
        Coins c1 = new Coins(cents);
        String firstCoinString = c1.toString();
        String secondCoinString = c2.toString();
        if (firstCoinString.compareTo(secondCoinString) == 0) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}
