import java.lang.Math;
/**
 * A class to represent a calculator;
 * The future version will let us 
 * use the calculator in Radian or Degree mode
 * 
 * @author Ari Camhi
 * @version 10/13/21
 */
public class Calculator{
    /*
     * Empty Constructor
     */
    public Calculator(){

    }

    /**
     * Method that returns the sign of the number given
     * 
     * @param  Number to find sign of 
     * @return 1 if positive, 0 if 0, -1 if negative
     */
    public int sign(int n){
        if ( n > 0 ) {
            return 1;
        }
        else if ( n == 0 ) {
            return 0;
        }
        else {
            return - 1;
        }
    }

    /**
     * Method that checks if the int is even
     * 
     * @param the int to check if even
     * @return boolean; true if Even; False otherwise
     */
    public boolean isEven(int n){
        if ( n % 2 == 0 ) {
            return true;
        }
        else {
            return false;
        }
    }

    /**
     * Method that returns the absolute value of int
     * 
     * @param the int to check for abs value
     * @return the absolute value of int
     */
    public int absValue(int n){
        if ( n >= 0 ) {
            return n;
        }
        else {
            return -n;
        }
    }

    /**
     * Method that takes two ints as params
     * and returns true if first variable is divisble by second
     * 
     * @param two ints 
     * @return boolean of the divisibility of both variables
     */
    public boolean divisibleVariables(int n, int x){
        if ( n % x == 0 ) {
            return true;
        }
        else {
            return false;
        }
    }

    /**
     * Method that takes 3 ints as params
     * and returns true if the first is divisible by 
     * the 2nd or 3rd variable
     * 
     * @param three ints
     * @return boolean of the divisibility of variables
     */
    public boolean threeVariableDivision(int n, int x, int y){
        if ( n % x == 0 || n % y == 0 ) {
            return true;
        }
        else {
            return false;
        }
    }

    /**
     * Method that takes three doubles and calculates the 
     * value of b^2 - 4ac and returns a String 
     * 
     * @param 3 double variables
     * @return String 
     */
    public String weirdEquation(int a, int b, int c){
        if (Math. pow(b, 2) - 4 * a * c > 0) {
            return "Two Real Roots";
        }
        else if (Math. pow(b, 2) - 4 * a * c == 0) {
            return "One real double root";
        } 
        else {
            return "No real roots";
        }
    }

    /**
     * Method to determine if an int
     * is a perfect square
     * 
     * @param 1 int 
     * @return boolean 
     */
    public boolean perfectSquare(int a){
        if (a / Math.sqrt(a) == Math.sqrt(a)) {
            return true;
        }
        else{
            return false;
        }
    }

    /**
     * Print all of the even numbers up to 100
     * 
     * Note: It's rare for a method to print anything
     * Only done as a demonstration 
     */
    public void countByTwos(){
        //Before looping there is some code for starting values
        //Start at 0 for this method
        int i = 0;

        while ( i < 100 ) {
            System.out.println(i);

            //Have to count up to make sure the loop ends
            i = i + 2;
        }
    }

    /**
     * Method that returns the smallest prime 
     * factor if an int. For example
     * the smallest prime factor of 20 is 2
     * the smallest prime factor of 15 is 3
     * 
     * @param  n  the number to find the smallest 
     *            prime factor of
     * @return    the smallest prime factor of n
     */
    public long smallestPrimeFactor(long n){

        //Start at 2
        long d = 2;

        //does n/d have a remainder that is not 0...
        //If so increase by 1 and loop
        while ( n % d != 0 ) {
            d++;
        }
        //When remainder is 0 return d
        return d;
    }

    /**
     * How many prime numbers are between 1 and 100
     * 
     * Note: It's not normal to print things in a method
     *       It is just a demonstration
     */
    public void primes1to100(){
        int numberWeAreChecking = 2;
        int numberOfPrimesFound = 0;

        //keep checking until we hit 100
        while (numberWeAreChecking < 100) {
            //Count up by one if we find a prime
            //It's prime if its smallest prime factor is itself
            if (numberWeAreChecking == smallestPrimeFactor(numberWeAreChecking)) {
                numberOfPrimesFound++;
            }

            numberWeAreChecking++;
        } 

        System.out.println(numberOfPrimesFound);
    }

    /**
     * What is the sum of all the numbers from 1 to 1000 including 1000?
     * 
     */
    public void sumFromOneTo1000(){
        int numberWeAreOn = 1;
        int sumSoFar = 0;

        while (numberWeAreOn <= 1000) {
            //Add the next number to the sum
            sumSoFar += numberWeAreOn;
            //Visit next number
            numberWeAreOn++;
        }

        System.out.println(sumSoFar);
    }

    /**
     * Method for finding every number
     * divisible by 3 between 0 and 100
     */
    public void numbersDivisibleByThree(){
        int numberWeAreOn = 0;

        do {
            numberWeAreOn = numberWeAreOn + 3;

            System.out.println(numberWeAreOn);
        } while (numberWeAreOn + 3 < 100);

    }

    /**
     * Method to find how many numbers between 1 and 100 
     * have the property (n - 50)^2 + n > 75
     */
    public void n50SquaredEquation(){
        int n= 0;
        int numbersWithProperty = 0;

        while (n < 100){
            if (Math.pow(n - 50 , 2) + n > 75){
                numbersWithProperty++;
            }

            n++;
        }
        System.out.println(numbersWithProperty);
    }

    /**
     * A method to find out what is the sum of all numbers less than 1000
     * that are not divisible by 3
     */
    public void numbersLessThan1000DivisbleBy3(){
        int numberWeAreChecking = 0;
        int numbersSoFar = 0;

        while (numberWeAreChecking < 1000) {
            if (numberWeAreChecking % 3 != 0){
                numbersSoFar += numberWeAreChecking;
            }
            numberWeAreChecking++;

        }

        System.out.println(numbersSoFar);

    }

    /**
     * A method to solve for eulers method and print all numbers between 1 and 1000
     */
    public void calculateEulersMethod() {
        int answer = 0;
        for (int n=1; n <= 1000; ++n) {
            answer = ((n*n)+n)/2;
            System.out.println(answer);
        }

    }

    /**
     * Divide each number from 2 to 1000 by it's smallest
     * divisor and print the result of all answers
     */
    public void smallestDivisor(){
        long answer = 0;
        for (long i = 2; i <= 1000; ++i) {
            answer = i / smallestPrimeFactor(i);
            System.out.println(answer);
        } 

    }

    /**
     * Find sum of all numbers divisible by 3 or 5 
     * less than 1000
     */
    public void multiplesOf3Or5(){
        int answer = 0;
        for (int n=1; n <= 1000; ++n){
            if (n % 3 == 0 || n % 5 == 0) {
                answer += n;
            }
            else {
                answer += 0;
            }
        }

        System.out.println(answer);
    }

    /**
     * Print out "Printing!" n * m times
     */
    public void printNM(int n, int m){
        //Outer loop: go around n times
        for (int i = 0; i < n; i++){
            //Inner loop: go around m times
            for (int j = 0; j < m; j++){
                System.out.println(i + "\t" + j + "\tPrinting!");
            }
        } 
    }

    /**
     * Print out times tables; 12 by 12
     */
    public void printTimesTables(){
        //This loop represents the rows 
        for (int f = 1; f <= 12; f++){
            //This loop represents the columns
            for (int s = 1; s<= 12; s++){
                System.out.print(f * s + "\t");
            }
            //Hit "enter"
            System.out.println();
        }
    }

    /**
     * GCF Enrichment task
     */
    public int gcf(int a, int b){
        while (a % b != 0){
            a = b; 
            b = a % b; 
            
        } 
        return b;
    }
}
