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

    /**
     * Fraction with a decimal as parameter, changes it into
     * a num and denom
     *
     * @param d, a decimal value
     */
    public Fraction(double d) {
        String s = String.valueOf(d);
        int digitsDec = s.length() - 1 - s.indexOf('.');
        int denom = 1;
        for (int i = 0; i < digitsDec; i++) {
            d *= 10;
            denom *= 10;
        }

        int num = (int) Math.round(d);
        int j = gcf(num,denom);
        num = num / j;
        denom = denom / j;
        this.num = num;
        this.denom = denom;
    }

    /**
     * Returns the greatest common factor of two positive integers
     *
     * @param num, the numerator
     * @param denom, the denominator
     * @return the greatest common factor
     */
    private static int gcf(int num, int denom)
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o ==
                null || getClass() != o.getClass()) return false;
        Fraction fraction = (Fraction) o;
        return getNum() == fraction.getNum() && getDenom() == fraction.getDenom();
    }

    @Override
    public String toString() {
        return "Fraction{" + num +
                "/" + denom +
                '}';
    }

    public int getNum() {
        return num;
    }

    public int getDenom() {
        return denom;
    }

    /**
     * Gets the decimal value of Fraction
     * @return decimal value
     */
    public double getDecimalValue(){
        return (double) getNum() / getDenom();
    }

    /**
     * Non-static method to add two fraction objects together
     *
     * @param other Fraction
     * @return altered original fraction
     */
    public Fraction add(Fraction other) {
        int f1num = this.getNum();
        int f1denom = this.getDenom();
        int f2num = other.getNum();
        int f2denom = other.getDenom();
        f1num *= f2denom;
        f2num *= f1denom;
        int newDenom = f1denom * f2denom;
        int newNum = f1num + f2num;
        int gcf = gcf(newNum,newDenom);
        newNum = newNum / gcf;
        newDenom = newDenom / gcf;
        this.num = newNum;
        this.denom = newDenom;
        return this;
    }

    /**
     * Non-static method to multiply two fraction objects together
     *
     * @param other Fraction
     * @return altered original fraction
     */
    public Fraction multiply(Fraction other){
        int f1num = this.getNum();
        int f1denom = this.getDenom();
        int f2num = other.getNum();
        int f2denom = other.getDenom();
        int newNum = f1num * f2num;
        int newDenom = f1denom * f2denom;
        int gcf = gcf(newNum,newDenom);
        newNum = newNum / gcf;
        newDenom = newDenom / gcf;
        return new Fraction(newNum, newDenom);
    }

    /**
     * Non-static method to divide two fraction objects together
     *
     * @param other Fraction
     * @return altered original fraction
     */
    public Fraction divide(Fraction other){
        int f1num = this.getNum();
        int f1denom = this.getDenom();
        int f2num = other.getNum();
        int f2denom = other.getDenom();
        int newNum = f1num * f2denom;
        int newDenom = f1denom * f2num;
        int gcf = gcf(newNum,newDenom);
        newNum = newNum / gcf;
        newDenom = newDenom / gcf;
        return new Fraction(newNum, newDenom);
    }

    /**
     * Print out the fraction in "x/y" form
     *
     * @param f1 fraction to be printed
     */
    public void printFraction(Fraction f1){
        System.out.println("Fraction in x/y form: " + f1.toString());
    }


    /**
     * Method to compare fractions and find which one is greater
     *
     * @param other fraction object
     * @return 1, -1, or 0
     */
    public int compareTo(Fraction other) {
        return Double.compare(this.getDecimalValue(), other.getDecimalValue());
    }



    //Static methods below

    /**
     * Static method to add two fraction objects together
     *
     * @param f1 a fraction object
     * @param f2 a fraction object
     * @return new fraction
     */
    public static Fraction add(Fraction f1, Fraction f2){
        int f1num = f1.getNum();
        int f1denom = f1.getDenom();
        int f2num = f2.getNum();
        int f2denom = f2.getDenom();
        f1num *= f2denom;
        f2num *= f1denom;
        int newDenom = f1denom * f2denom;
        int newNum = f1num + f2num;
        int gcf = gcf(newNum,newDenom);
        newNum = newNum / gcf;
        newDenom = newDenom / gcf;

        return new Fraction(newNum, newDenom);
    }

    /**
     * Static method to multiply two fraction objects together
     *
     * @param f1 a fraction object
     * @param f2 a fraction object
     * @return new fraction
     */
    public static Fraction multiply(Fraction f1, Fraction f2){
        int f1num = f1.getNum();
        int f1denom = f1.getDenom();
        int f2num = f2.getNum();
        int f2denom = f2.getDenom();
        int newNum = f1num * f2num;
        int newDenom = f1denom * f2denom;
        int gcf = gcf(newNum,newDenom);
        newNum = newNum / gcf;
        newDenom = newDenom / gcf;
        return new Fraction(newNum, newDenom);
    }

    /**
     * Static method to divide two fraction objects together
     *
     * @param f1 a fraction object
     * @param f2 a fraction object
     * @return new fraction
     */
    public static Fraction divide(Fraction f1, Fraction f2){
        int f1num = f1.getNum();
        int f1denom = f1.getDenom();
        int f2num = f2.getNum();
        int f2denom = f2.getDenom();
        int newNum = f1num * f2denom;
        int newDenom = f1denom * f2num;
        int gcf = gcf(newNum,newDenom);
        newNum = newNum / gcf;
        newDenom = newDenom / gcf;
        return new Fraction(newNum, newDenom);
    }
}