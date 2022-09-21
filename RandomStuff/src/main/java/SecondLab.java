/**
 * Second Lab with 4 methods for ATCS
 *
 * @author Ari Camhi
 * @version 9-19-22
 */
public class SecondLab {

    public String coinCombinations(int cents) {
        int quarters = 0;
        int dimes = 0;
        int nickels = 0;
        int pennies = cents;
        for (int i = 0; i < cents; i++) {
            if (i % 5 == 0) {
                nickels += 1;
                pennies -= 5;
            } else if (i % 10 == 0) {
                dimes += 1;
                pennies -= 10;
            } else if (i % 25 == 0) {
                quarters += 1;
                pennies -= 25;
            }
            System.out.println("Quarters: " + quarters + " Dimes: " + dimes + " Nickels: " + nickels
                    + " Pennies: " + pennies);
        }

        return "Quarters: " + quarters + " Dimes: " + dimes + " Nickels: " + nickels
                + " Pennies: " + pennies;
    }

    /**
     * Method to return the stars in the shape of an upside down
     * pyramid. Using a StringBuilder instead of just a string to make
     * it easier. Exmaple: int n = 5
     * Should return:
     *    *****
     *     ***
     *      *
     * @param n
     * @return pic of pyramid
     */
    public StringBuilder newStars(int n) {
        StringBuilder output = new StringBuilder();
        output.append("*".repeat(n));
        int tracker = n;
        System.out.println(output);
        for (int i = 0; i <= (n / 2); i++) {
            //Eliminating the left side
            output.replace(i, i + 1, " ");
            //Eliminating the right side
            output.replace(tracker - 1, tracker, " ");
            tracker--;
            System.out.println(output);
        }
        return output;
    }
}

