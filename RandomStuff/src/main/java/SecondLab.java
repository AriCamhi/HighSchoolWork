import java.text.DecimalFormat;

/**
 * Second Lab with 4 methods for ATCS
 *
 * @author Ari Camhi
 * @version 9-19-22
 */
public class SecondLab {

    /**
     * Method 1:
     *
     * Method that should return all possible combinations
     * of change given an amount of cents.
     *
     * @param cents in between 1 and 100
     * @return all possible combinations
     */
    public String coinCombinations(int cents) {
        int quarters = 0;
        int dimes = 0;
        int nickels = 0;
        int pennies = 0;
        while(cents >= 0){
            if(cents % 25 != cents){
                cents = cents % 25;
                quarters += cents / 25;
            }
            else if(cents % 10 != cents){
                cents = cents % 10;
                dimes += cents / 10;
            }
            else if(cents % 5 != cents){
                cents = cents % 5;
                nickels += cents / 5;
            }
            else {
                cents = 0;
                pennies += cents;
            }
        }
        System.out.println("Quarters: " + quarters + " Dimes: " + dimes + " Nickels: " + nickels
                + " Pennies: " + pennies);
        String j = "hello";
        return j;
    }

    /**
     * Method 2:
     *
     * Method to calculate the price of two textbooks given their special
     * discounts
     * @param bp Be Prepared
     * @param nb Next Best
     * @return total price
     */
    public double calculateBookTotal(int bp, int nb) {
        double priceBp = 18.95 * bp;
        double priceNb = 21.95 * nb;

        double total = 0;
        total = priceBp + priceNb;

        if (bp == 1 && nb == 1) {
            total = 37.95;
        }

        if (bp + nb >= 3) {
            total = 15.95 * (bp + nb);
        }

        if (bp + nb >= 12) {
            total = 14 * (bp + nb);
        }
        DecimalFormat form1 = new DecimalFormat("0.00");
        System.out.println("Total Price: " + form1.format(total));
        return Double.parseDouble(form1.format(total));
    }

    /**
     * Method 3:
     *
     * Method to return the two closet fractions to 17/76
     * One should be below and one should be above
     *
     * @return both fractions from below and above
     */
    public String seventeen76() {
        //Loops for finding the fraction below:
        double reference = 17. / 76;
        double target = 0.0;
        int goodNum = 0;
        int goodDenom = 0;
        for (int num = 1; num <= 100; num++) {
            for (int denom = 1; denom <= 100; denom++) {
               double newValue = (double) num / denom;
               if (newValue < reference) {
                   if (newValue > target) {
                       goodNum = num;
                       goodDenom = denom;
                       target = newValue;
                   }
               }
            }
        }
        //Loops for finding the fraction above:
        double target2 = 0.3;
        int betterNum = 0;
        int betterDenom = 0;
        for (int i = 1; i <= 100; i++) {
            for (int j = 1; j <= 100; j++) {
                double newValueAgain = (double) i / j;
                if (newValueAgain > reference) {
                    if (newValueAgain < target2) {
                        betterNum = i;
                        betterDenom = j;
                        target2 = newValueAgain;
                    }
                }
            }
        }
        System.out.println("Fraction below: " + goodNum + "/" + goodDenom);
        System.out.println("Fraction above: " + betterNum + "/" + betterDenom);
        String output = "test";
        return output;
    }

    /**
     * Method 4:
     *
     * Method to return the stars in the shape of an upside down
     * pyramid. Using a StringBuilder instead of just a string to make
     * it easier. Example: int n = 5
     * Should return:
     *    *
     *   ***
     *  *****
     *
     * @param n of stars
     * @return pic of pyramid
     */
    public StringBuilder starPyramid ( int n){
        StringBuilder output = new StringBuilder();
        output.append(" ".repeat(n));
        output.replace(n / 2, (n / 2) + 1, "*");
        int tracker = 1;
        System.out.println(output);
        for (int i = 0; i < n; i++) {
            //Adding to the both side
            int beginning = (n / 2) - tracker;
            int end = (n / 2) + tracker;
            output.replace((n / 2) - tracker, (n / 2) + tracker, "*".repeat(end - beginning + 1));
            tracker++;
            System.out.println(output);
        }
        return output;
        }
}

