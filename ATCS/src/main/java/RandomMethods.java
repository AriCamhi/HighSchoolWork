import java.util.Arrays;

/**
 * Class for all random methods that I want to make.
 * Could relate to any new topics learned and will most likely
 * be tested in the "RandomTester" class
 *
 * @author Ari Camhi
 * @version 1-22-22
 */
public class RandomMethods {

    /**
     * Sorting an array using Arrays.Sort()
     * Just wanted to use it to see how much easier it is
     * than making my own sorting method for arrays
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
    public boolean isPrime(int n) {
        boolean checkPrime = true;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                checkPrime = false;
            }
            break;
        }
        return checkPrime;
    }

    /**
     * Plug in a radical number and return the fully simplified version of it
     * Ex: n = 50... return 5 sqrt2
     * <p>
     * Now when I do a math assignment and have to simplify some radical
     * I will use the simplifier I made myself.
     *
     * @param n
     * @return simplifiedRad
     */
    public RadResult simplifyRadical(int n) {
        RadResult simplifiedRad;
        int integerPart = -1;
        int radicalPart = 1;
        for (int i = (int) (n / 2); i > 0; i--) {
            if (i * i == n) {
                //simplifiedRad = "perfect square: " + i;
                integerPart = (int) i;
                break;
            } else if (n % (i * i) == 0) {
                //simplifiedRad = i + " sqrt(" + n/ (i * i) + ")";
                integerPart = i;
                radicalPart = (int) (n / (i * i));
                break;
            }
        }
        return new RadResult(integerPart, radicalPart);
    }

    /**
     * Reverse a String...
     * Using string builder, isntead of += it builds string together
     * with the append command
     *
     * @return reversedS
     */
    public String reverseString(String s) {
        StringBuilder reversedS = new StringBuilder();
        for (int i = s.length(); i > 0; i--) {
            reversedS.append(s.charAt(i - 1));
        }
        return reversedS.toString();
    }


///**
// * Reverse a String using Recursion...
// *
// * @return reversedS
// */
//public String reverseStringRecursion(String s){
//    StringBuilder reversedS = new StringBuilder();
//
//
//    return reversedS.toString();
//}
//
//}

    /**
     * Reverse a string again
     * First true code back from break
     *
     * @return reversedString
     */
    public String reverseStringAgain(String s) {
        String reversedString = "";
        for (int i = s.length(); i > 0; i--) {
            reversedString += s.charAt(i - 1);
        }
        return reversedString;
    }

    /**
     * factorial with a for loop instead of recursion
     *
     * @param n
     * @return n
     */
    public int factorialForLoop(int n) {
        int i = n - 1;
        do {
            n = n * i;
            i--;
        } while (i >= 1);
        return n;
    }

    /**
     * print
     * *
     * **
     * ***
     * ****
     * and so on given the parameter
     *
     * @param n
     */
    public String printStars(int n) {
        String stars = null;
        for (int i = 1; i <= n; i++) {
            stars = "";
            stars += "*";
            System.out.println(stars);
        }
        return stars;
    }


    /**
     * Exercises for hw
     * <p>
     * exercise 3
     */
    public int addOdds(int n) {
        int total = 0;
        for (int i = 0; i < n; i++) {
            i++;
            total += i;
        }
        return total;
    }

    /**
     * Exercises for hw
     * <p>
     * exercise 5
     */
    public int basicAdditionMethod(int n) {
        int total = 0;
        if (n > 10 || n < 0) {
            return 0;
        } else {
            for (int i = 0; i <= n; i++) {
                total += i;
            }
            return total;
        }

    }

    /**
     * Activity from class
     * Long version without switch cases
     */
    String oneTwo = "One, two buckle my shoe";
    String threeFour = "Three, four, shut the door";
    String fiveSix = "Five, six, pick up sticks";
    String sevenEight = "Seven, eight lay them straight";
    String nineTen = "Nine ten lets count again";

    public String nurseryRhyme(int input) {
        if (input == 1) {
            return oneTwo;
        } else if (input == 2) {
            return oneTwo;
        } else if (input == 3) {
            return threeFour;
        } else if (input == 4) {
            return threeFour;
        } else if (input == 5) {
            return fiveSix;
        } else if (input == 6) {
            return fiveSix;
        } else if (input == 7) {
            return sevenEight;
        } else if (input == 8) {
            return sevenEight;
        } else if (input == 9) {
            return nineTen;
        } else if (input == 10) {
            return nineTen;
        } else {
            return "out of range";
        }
    }

    /**
     * Nursery rhyme with switch cases
     */
    public String nurseryRhymeSwitch(int input) {
        String y = "out of range";
        switch (input) {
            case 1, 2 -> {
                return oneTwo;
            }
            case 3, 4 -> {
                return threeFour;
            }
            case 5, 6 -> {
                return fiveSix;
            }
            case 7, 8 -> {
                return sevenEight;
            }
            case 9, 10 -> {
                return nineTen;
            }
            //default: return y;
        }
        return null;
    }

    /**
     * Combination method calling factorial
     *
     * @param n
     * @param r
     * @return nCr
     */
    public int combinations(int n, int r) {
        return factorial(n) / (factorial(r) * factorial(n - r));
    }

    /**
     * Wrong Method for Lab one but going
     * to still keep it
     *
     * @param input
     * @return total
     */
    public int wrongMethod(int input) {
        int total = 0;
        if (input == 3) {
            int i = 3;
            while (i <= 200) {
                total += i;
                i += 3;
            }
            System.out.println("Sum of the multiples for 3 is: " + total);
        } else if (input == 5) {
            int j = 5;
            while (j <= 200) {
                total += j;
                j += 5;
            }
            System.out.println("Sum of the multiples for 5 is: " + total);
        } else {
            String printer = "Input: " + input + " is out of range";
            System.out.println(printer);
        }
        return total;
    }

    /**
     * Method to sort array without using Arrays.sort
     *
     * @param arr
     */
    public void bubbleSort(int[] arr) {
        int temp;
        int current;
        int right;
        for (int j = 0; j < arr.length; j++) {
            for (int i = 0; i < arr.length - 1; i++) {
                current = i;
                right = i + 1;
                if (arr[current] > arr[right]) {
                    temp = arr[current];
                    arr[current] = arr[right];
                    arr[right] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    public int[] twoSum(int[] nums, int target) {
        int one = 0;
        int two = 0;
        for (int i = 0; i <= nums.length; i++) {
            for (int j = 1; j <= nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    one = i;
                    two = j;
                    break;
                }
            }
        }
        int[] arr = new int[]{one, two};
        return arr;
    }

    public void findMax(int[] a) {
        int currentMax = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] > currentMax) {
                currentMax = a[i];
            }
        }
        System.out.println(currentMax);
    }

    public void findMaxPos(double[] a) {
        int pos = 0;
        for (int i = 1; i < a.length; i++) {
            if (a[i] > pos) {
                pos = i;
            }
        }
        System.out.println(pos);
    }

    public void findMaxForEach(int[] a) {
        int max = a[0];
        for (int i : a) {
            if (i > max) {
                max = i;
            }
        }
        System.out.println(max);
    }

    public void findMaxPosForEach(int[] a) {
        int max = 0;
        int pos = 0;
        int count = 0;
        for (int i : a) {
            if (i > max) {
                max = i;
            }
            count++;
        }
        System.out.println(count);
    }

    public int search(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }

    /**
     * Return the index of the target element
     *
     * @param arr
     * @param target
     * @return
     */
    public int binarySearch(Integer[] arr, Integer target) {
        Integer beg = 0;
        Integer end = arr.length - 1;
        while (beg <= end) {
            Integer mid = (beg + end) / 2;
            if (arr[mid].compareTo(target) == 0) {
                return arr[mid];
            } else if (arr[mid].compareTo(target) > 0) {
                end = mid - 1;
            } else
                beg = mid + 1;
        }
        return -1;
    }

    public void selectionSort(int[] arr) {
        int min = 0;
        int temp;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i; j < arr.length; j++) {
                if (arr[j] <= arr[min]) {
                    min = j;
                }
            }
            temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }

    public void insertionSort(int[] arr) {
        int temp;
        for (int i = 1; i < arr.length; i++) {
            for (int j = i; j > 0; j--) {
                if (arr[j] < arr[j - 1]) {
                    temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                    continue;
                }
                break;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    public void smallestNum(int[] arr) {
        int temp = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[temp]) {
                temp = i;
            }
        }
        System.out.println(arr[temp]);
    }


    /**
     * Method that determines the value of y = b^x
     *
     * @param base
     * @param exp
     * @return
     */
    public int power(int base, int exp) {
        if (exp != 0) {
            return base * power(base, exp - 1);
        }
        return 1;
    }

    public void countdown(int n) {
        if (n == 0) {
            System.out.println("Finished");
        } else {
            System.out.println(n);
            countdown(n - 1);
        }
    }

    public void merge(int arr[], int l, int m, int r) {
        // Find sizes of two subarrays to be merged
        int n1 = m - l + 1;
        int n2 = r - m;
        /* Create temp arrays */
        int L[] = new int[n1];
        int R[] = new int[n2];
        /*Copy data to temp arrays*/
        for (int i = 0; i < n1; ++i)
            L[i] = arr[l + i];
        for (int j = 0; j < n2; ++j)
            R[j] = arr[m + 1 + j];
        /* Merge the temp arrays */
        // Initial indexes of first and second subarrays
        int i = 0, j = 0;
        // Initial index of merged subarray array
        int k = l;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }
        /* Copy remaining elements of L[] if any */
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }
        /* Copy remaining elements of R[] if any */
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }

    // Main function that sorts arr[l..r] using
    // merge()
    public void sort(int arr[], int l, int r) {
        if (l < r) {
            // Find the middle point
            int m = l + (r - l) / 2;
            // Sort first and second halves
            sort(arr, l, m);
            sort(arr, m + 1, r);
            // Merge the sorted halves
            merge(arr, l, m, r);
        }
    }



    public static void main(String[] args) {
        RandomMethods r = new RandomMethods();
        int[] arr = new int[]{3, 5, 1, 34, 5, 6, 7, 1};
//        int[] arr2 = new int[] {491,9812,33,33,33,190,8322};
//        r.sortArray(arr2);
//        r.twoSum(arr, 8);
        r.selectionSort(arr);
        r.insertionSort(arr);
        r.power(5, 3);
    }

}

