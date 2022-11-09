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
     * Method that should return all possible combinations
     * of change given an amount of cents.
     *
     * @param cents in between 1 and 100
     * @return all possible combinations
     */
    public String coinCombinations(int cents) {
        int q = 25;
        int d = 10;
        int n = 5;
        int p = 1;
        for (int quarterCount = 0; cents >= q * quarterCount; quarterCount++) {
            for (int dimeCount = 0; cents >= d * dimeCount; dimeCount++) {
                for (int nickelCount = 0; cents >= n * nickelCount; nickelCount++) {
                    for (int pennyCount = 0; cents >= p * pennyCount; pennyCount++) {
                        if ((quarterCount * q) + (pennyCount * p) + (nickelCount * n) + (dimeCount * d) == cents) {
                            System.out.println("Quarters: " + quarterCount + " Dimes: " + dimeCount + " Nickels: " + nickelCount
                                    + " Pennies: " + pennyCount);
                        }
                    }
                }
            }
        }
        //Using this for assertion testing
        String output = "Test";
        return output;
    }


    /**
     * Method 2:
     * Method to calculate the price of two textbooks given their special
     * discounts
     *
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
        //Using this for assertion testing
        String output = "test";
        return output;
    }

    /**
     * Method 4:
     * Method to return the stars in the shape of an upside down
     * pyramid. Using a StringBuilder instead of just a string to make
     * it easier. Example: int n = 5
     * Should return:
     * *
     * ***
     * *****
     *
     * @param n of stars
     * @return pic of pyramid
     */
    public int starPyramid(int n) {
        StringBuilder output = new StringBuilder();
        output.append(" ".repeat(n));
        if (n % 2 != 0) {
            output.replace(n / 2, (n / 2) + 1, "*");
            int tracker = 1;
            System.out.println(output);
            for (int i = 0; i < n / 2; i++) {
                //Adding to both sides
                int beginning = (n / 2) - tracker;
                int end = (n / 2) + tracker;
                output.replace(beginning, end, "*".repeat(end - beginning + 1));
                tracker++;
                System.out.println(output);
            }
        } else if (n % 2 == 0) {
            output.replace((n / 2) - 1, (n / 2) + 1, "*".repeat(2));
            int tracker = 1;
            System.out.println(output);
            for (int i = 0; i < (n / 2) - 1; i++) {
                //Adding to both sides
                int beginning = (n / 2) - tracker - tracker;
                int end = (n / 2) + tracker;
                output.replace(beginning, end, "*".repeat(end - beginning + 1));
                tracker++;
                System.out.println(output);
            }
        }
        //Using this for assertion testing
        int tester = 0;
        return tester;
    }
}
