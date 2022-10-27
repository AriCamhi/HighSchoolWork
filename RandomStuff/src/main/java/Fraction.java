/**
 * Lab 7 for ATCS, creates an object fraction
 * with different methods such as +, -, *, /.
 * Essentially, manipulate such fractions with different mathematical
 * operations
 *
 * @author Ari Camhi
 * @version 10-25-22
 */
public class Fraction {

    private int num;
    private int denom;


    /**
     * Empty Constructor
     */
    public Fraction(){

    }

    /**
     * Fraction with just a numerator
     * @param num, the numerator
     */
    public Fraction(int num){
        this.num = num;
    }

    /**
     * Fraction with numerator and denominator
     * @param num, the numerator
     * @param denom, the denominator
     */
    public Fraction(int num, int denom){
        this.num = num;
        this.denom = denom;
    }

    public Fraction(double decimal){
        //Loops for finding the fraction below:
        double target = 0.0;
        int goodNum = 0;
        int goodDenom = 0;
        for (int num = 1; num <= 100; num++) {
            for (int denom = 1; denom <= 100; denom++) {
                double newValue = (double) num / denom;
                if (newValue < decimal) {
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
                if (newValueAgain > decimal) {
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
    }

    public int getNum() {
        return num;
    }

    public int getDenom() {
        return denom;
    }

    /**
     * Returns the greatest common factor of two positive integers
     *
     * @param num, the numerator
     * @param denom, the denominator
     * @return the greatest common factor
     */
    private int gcf(int num, int denom)
    {
        if (num <= 0 || denom <= 0)
        {
            throw new IllegalArgumentException(
                    "gcf precondition failed: " + num + ", " + denom);
        }
        if (num % denom == 0)
            return denom;
        else if (denom % num == 0)
            return num;
        else
            return gcf(num % denom, denom % num);
    }
}

