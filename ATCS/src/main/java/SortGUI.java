import java.util.Arrays;

/**
 * Class that will create a bar graph that
 * represents the values of an integer array. Vertical bars
 * will be on bottom, not hanging.
 *
 * @author Ari Camhi
 * @version 2-3-23
 */
public class SortGUI {

    /**
     * Actual method for insertion sort, no GUIs
     * @param arr - array of integers.
     */
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
}
