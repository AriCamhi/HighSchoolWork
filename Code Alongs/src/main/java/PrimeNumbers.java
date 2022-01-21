/**
 * A class for Lab 03
 * 4 methods similar to calculator
 * 
 * @author Ari Camhi
 * @version 10/22/21
 */
public class PrimeNumbers{
    /**
     * Empty constructor 
     */
    public PrimeNumbers(){

    }
    
    /**
     * Method that takes an integer and returns the prime number
     * that coordinates with the position of the integer
     * 
     * Ex: prime(6) would return the 6th prime number {13}
     */
    public void prime(long i){
        Calculator calc = new Calculator();
        long lastCalculatedPrime = 0;
        long numPrimes = 0;
        for (long j =2; numPrimes < i; ++j) {
            long prime = calc.smallestPrimeFactor(j);
            if (lastCalculatedPrime < prime) {
                lastCalculatedPrime = prime;
                ++numPrimes;
            }
        }

        System.out.println("last prime =" + lastCalculatedPrime);
    }

    /**
     * Method that takes a number and returns the 
     * multiplication of all of the prime numbers through that number
     * inside of 1 < i < 11
     * 
     * Ex: primoral(5) would return 2*3*5*7*11
     */
    public long primoral(long i){
        Calculator calc = new Calculator();
        long productSoFar = 1;
        long numberWeAreOn = 1;
        long numberPrimesSoFar = 0;
        while (numberPrimesSoFar < i){
            if (numberWeAreOn == calc.smallestPrimeFactor(numberWeAreOn)){
                productSoFar *= calc.smallestPrimeFactor(numberWeAreOn);
                numberPrimesSoFar++;
                ++numberWeAreOn;
            }
            else{
                ++numberWeAreOn;
            }
        }
        return productSoFar;
    }

    /**
     * Method that takes a number and returns theat Euclid number
     * euclidNumber(n) = 1 + primoral(n)
     * 
     * Ex: euclidNumber(5) = 2311
     */
    public long euclidNumber(long i){
        return 1 + primoral(i);
    }

    /**
     * Method that prints out the first n Euclid numbers
     * Limit them from 0<=n<=10
     */
    public void firstEuclid(long x){
        for (long n = 1; n < x; ++n){
            System.out.println(euclidNumber(n));
        }
    }
}