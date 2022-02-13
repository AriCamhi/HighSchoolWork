import java.util.Arrays;

/**
 * Class for all random methods that I want to make.
 * Could relate to any new topics learned and will most likely
 * be tested in the "RandomTester" class
 *
 * @author Ari Camhi
 * @version 1-22-22
 */
public class FreelanceStuff {

    /**
     * Sorting an array using Arrays.Sort()
     * Just wanted to use it to see how much easier it is
     * than making my own sorting method for arrays
     *
     * @param arr
     */
    public String arraySortCheat(int[] arr) {
        String outputForTester = "";
        String output = "";
        Arrays.sort(arr);
        output += "Modified arr[]: " + Arrays.toString(arr);
        System.out.println(output);
        for (int i = 0; i < arr.length - 1; ++i)
            if (arr[i] > arr[i + 1]) {
                outputForTester = "nah it doesn't work";
            } else {
                outputForTester = "yeah it works";
            }
        return outputForTester;
    }

    /**
     * Factorial, not knowing anything about recursion yet
     */
    public int factorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    /**
     * Fibonacci sequence recursion
     */
    public int fibo(int n) {
        System.out.println("Calling fibo at the value of " + n);
        int output = 0;
        if (n == 0 || n == 1) {
            output = n;
            return output;
        } else {
            output = fibo(n - 1) + fibo(n - 2);
            return output;
        }
    }

    /**
     * Check to see if number is prime so I can solve some trig problem
     * on deltaMath and I don't want to see if rad 97 can be factored
     */
    public boolean isPrime(int n){
        boolean checkPrime = true;
        for(int i = 2; i < n; i++){
            if(n % i == 0){
                checkPrime = false;
            }
            break;
        }
        return checkPrime ;
    }

}

