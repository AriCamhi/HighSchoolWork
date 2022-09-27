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

    public int optimalChange(int cents){
        int changeLeft = cents;
        while(changeLeft >= 0){
            if(cents % 25 != cents){
                changeLeft = cents % 25;
                quarters = cents / 25;
            }
            else if(changeLeft % 10 != changeLeft){
                changeLeft = changeLeft % 10;
                dimes = changeLeft / 10;
            }
            else if(changeLeft % 5 != changeLeft){
                changeLeft = changeLeft % 5;
                nickels = changeLeft / 5;
            }
            else {
                changeLeft = 0;
                pennies = changeLeft;
            }
        }
        System.out.println("Quarters: " + quarters + " Dimes: " + dimes + " Nickels: " + nickels
                + " Pennies: " + pennies);
        int j = 5;
        return j;
    }

}
