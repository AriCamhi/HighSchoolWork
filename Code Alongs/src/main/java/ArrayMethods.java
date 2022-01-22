import org.jetbrains.annotations.NotNull;

/**
 * Introduction to arrays and
 * different methods you can do with
 * the utilization of arrays
 *
 * @author Ari Camhi
 * @version 1-3-21
 */
public class ArrayMethods {
    /**
     * Make an array of study group names; print one
     */
    public void family() {
        String[] familyNames = new String[4];

        familyNames[0] = "Ari";
        familyNames[1] = "Olivia";
        familyNames[2] = "Alissa";
        familyNames[3] = "Steven";

        double[] heightInFeet = new double[4];

        heightInFeet[0] = 5.9;
        heightInFeet[1] = 5.8;
        heightInFeet[2] = 5.4;
        heightInFeet[3] = 5.11;

        System.out.println("Name: " + familyNames[0] + " height: " + heightInFeet[0]);
    }

    /**
     * Testing to see the max number of elements I can
     * make in an array
     * <p>
     * FAIL... COMPUTER TOO SLOW...
     */
    public void doNow() {
        double y = 999999999;
        double k;
        for (k = 0; k <= y; k++) {
            double[] thing = new double[100000000];

        }
        System.out.println(k);
    }

    /**
     * Playing with arrays.
     */
    public void playAroundWithArrays() {
        // Initialize an array and assign values after
        double latLong[] = new double[2];
        latLong[0] = 41.175942;
        latLong[1] = -73.758270;
        System.out.println("(" + latLong[0] + "," + latLong[1] + ")");

        // Initialize values immediately using curly braces!!
        int[] fibo = new int[]{1, 1, 2, 3, 5, 8, 13, 21};
        int i = 0;
        while (i < fibo.length) {
            System.out.println(fibo[i]);
            i++;
        }

        //Fill an array depending on the index
        double[] arc = new double[20];
        for (int t = 0; t < arc.length; t++) {
            arc[t] = 7 * t - 9.8 * t * t;
        }

        // "For each loop"
        for (double height : arc) {
            System.out.println(height);
        }
    }

    /**
     * Predict, implement, describe
     * Prediction: Will print "10" then print out all of the names
     * with "Brady after each one individually"
     * Describe: Is the same as my prediction
     */
    public void prediction() {
        int[] myArray = new int[]{1, 3, 5, 7, 9};
        System.out.println(myArray[2] + myArray.length);

        String[] family = new String[]{"Mike", "Carol", "Alice",
                "Marcia", "Jan", "Cindy",
                "Greg", "Peter", "Bobby"};

        for (int index = 0; index < family.length; index++) {
            family[index] = family[index] + " Brady";
            System.out.println(family[index]);
        }
    }

    /**
     * Fun...
     * Find the sum of all the numbers in an array
     *
     * @return the sum of numbers
     */
    public void sumOfArray() {
        int[] arr = new int[]{123498, 213894, 582, 10238, 999};
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        System.out.println("The sum is: " + sum);
    }

    /**
     * More fun...
     * Find the average of an array of numbers
     *
     * @return the average of numbers
     */
    public void averageOfArray() {
        double[] arr = new double[]{8, 5, 6, 9};
        double average = 0;
        double amountOfElements = 0;
        for (double i : arr) {
            average += i;
        }
        //Find the length of the array without using length method
        for (double k : arr) {
            amountOfElements++;
        }
        average = average / amountOfElements;
        System.out.println("The average is: " + average);
    }

    /**
     * Even more fun...
     * Scan an array to see if it contains a specific value
     *
     * @return true or false if the value is present
     */
    public boolean scanForValue(double[] inputArray, double checker) {
        //Make boolean set to false until proven true
        boolean present = false;
        //For each element in array, i obtains that value for one loop
        for (double i : inputArray) {
            if (i == checker) {
                present = true;
                //System.out.println("The status of presence in array is: " + present);
                break;
            } else {
                present = false;
                //System.out.println("The status of presence in array is: " + present);
            }
        }
        System.out.println("The status of presence in array is: " + present);
        return present;
    }

    /**
     * Surprisingly, more fun...
     * Find the maximum and minumum value of an array
     *
     * @return the max and min value within the array
     */
    public void minAndMaxValue() {
        int[] arr = new int[]{4345, 23453, 245, 777, 98};
        //Just maximum value first...
        int maxValue = 0;
        for (int k : arr) {
            if (k > maxValue) {
                maxValue = k;
            }
        }
        System.out.println("The max value of the array is: " + maxValue);

        //Minimum value next...
        int minValue = 999999999;
        for (int j : arr) {
            if (j < minValue) {
                minValue = j;
            }
        }
        System.out.println("The min value of the array is: " + minValue);
    }

    /**
     * Play around with 2d arrays
     */
    public void twoDimensional() {
        String[][] names = new String[3][2];

        // Number of rows in the 2d array
        System.out.println(names.length);
        // Number of columns is also the length of the first row
        System.out.println(names[0].length);

        // 0th row, 0th column
        names[0][0] = "Bart";
        names[0][1] = "Simpson";
        names[1][0] = "Mickey";
        names[1][1] = "Mouse";
        names[2][0] = "Morty";
        names[2][1] = "Sanchez";
        System.out.println(names[1][1]);

        //Loop over a 2d array with a nested loop
        //Outer loop (in this example) reads row-by-row
        for (int row = 0; row < names.length; row++) {
            //Inner loop goes column to column within the row
            for (int col = 0; col < names[0].length; col++) {
                System.out.print(names[row][col] + " ");
            }
            System.out.println();
        }
    }

    /**
     * Paper activity
     */
    public void paperActivity() {
        int[][] arr = new int[6][4];
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[0].length; col++) {
                System.out.println("Coordinates: (" + row + "," + col + ")" + " Value is: " + (row + col));
            }
            System.out.println();
        }
    }

    /**
     * Find if there is duplicate values in an array of ints
     *
     * @return duplicate boolean status
     */
    public boolean duplicateValues(int[] arr) {
        //Inner loop is running through each value in array
        int previous;
        boolean status = false;
        for (int i = 0; i < arr.length; i++) {
            //Nested loop is doing a pass through for the value of i at each element
            for (int j = i + 1; j < arr.length; ++j) {
                if (arr[j] == arr[i]) {
                    status = true;
                }

            }

        }
        return status;

    }

    /**
     * Method that will sort an array from smallest to largest
     *
     * @return the sorted array
     */
    public int sortArray(int[] arr) {
        int valid = 0;
        int temp = 0;
        int n = arr.length;
        //Outer loop will run through each element
        for(int i = 0; i < n - 1; i++)
            //Nested loop is doing each pass through
            for(int j = 0; j < n - i - 1; j++)
            //If current is greater than the one ahead, move it to the right
                if(arr[j] > arr[j + 1]){
                temp = arr[j];
                arr[j] = arr[j + 1];
                //Set j + 1 to temp because we are working with it next loop
                arr[j + 1] = temp;
            }
        //Checker
        for (int k = 0; k < n - 1; ++k) {
            if (arr[k] < arr[k + 1]) {
                valid = 69;
            }
        }
        return valid;
    }


    
}

