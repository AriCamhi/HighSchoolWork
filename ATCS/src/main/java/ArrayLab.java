import java.util.Arrays;

/**
 * Array Group Lab for ATCS
 *
 * @author Ari Camhi
 * @version 10-31-22
 */
public class ArrayLab {

    /**
     * Method that returns an array of elements that come after
     * the last number 4 from an inputted array
     *
     * @param arr the original array
     */
    public void afterFour(int[] arr) {
        int[] newArray = new int[0];
        for (int i = arr.length; i > 0; i--) {
            if (arr[i - 1] == 4) {
                newArray = new int[arr.length - i];
                break;
            }
        }
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 4) {
                index = i;
                break;
            }
        }
        int j = index + 1;
        while (j < arr.length) {
            for (int n = 0; n < newArray.length; n++) {
                newArray[n] = arr[j];
                j++;
            }
        }
        System.out.println(Arrays.toString(newArray));
    }

    /**
     * Method that returns the largest positive element in 2d array
     * if all are negative, return 0
     *
     * @param m the 2d array
     */
    public static double positiveMax(double[][] m) {
        double maxValue = m[0][0];
        for (double[] doubles : m) {
            for (double aDouble : doubles) {
                if (aDouble > maxValue) {
                    maxValue = aDouble;
                }
            }
        }
        System.out.println(maxValue);
        return maxValue;
    }

    /**
     * Some test cases
     *
     * @param args
     */
    public static void main(String[] args) {
        ArrayLab a = new ArrayLab();
        int[] test1 = new int[]{2, 4, 5, 7};
        int[] test2 = new int[]{4, 8, 9, 0};
        int[] test3 = new int[]{2, 3, 5, 7};
        int[] test4 = new int[]{2, 1, 5, 4};
        a.afterFour(test1);
        a.afterFour(test2);
        a.afterFour(test3);
        a.afterFour(test4);
        double[][] tester1 = {{3, 2, 5}, {4, 6, 9}};
        double[][] tester2 = {{7, 1, 1}, {16, 9}};
        double[][] tester3 = {{9, -2, -5}, {40, -6, -9}};
        a.positiveMax(tester1);
        a.positiveMax(tester2);
        a.positiveMax(tester3);
    }

}
