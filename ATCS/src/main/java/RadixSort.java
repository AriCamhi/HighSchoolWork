import java.util.ArrayList;
import java.util.Arrays;

/**
 * Class for RadixSort, contains possible helper methods...
 *
 * @author Ari Camhi
 * @version 2-15-23
 */
public class RadixSort {
    //Class level ArrayList that is getting sorted
    ArrayList<Integer> arr;

    /**
     * Constructor
     *
     * @param arr - class level ArrayList
     */
    public RadixSort(ArrayList<Integer> arr) {
        this.arr = arr;
    }

    /**
     * Actual Radix Sort method
     *
     * @return sorted array
     */
    public ArrayList<Integer> radixSort() {
        ArrayList<Integer>[] al = new ArrayList[10];
        int counter = 0;
        int looper = 0;
        while (looper <= String.valueOf(maxIntLength(arr)).length()) {
            //Getting rid of null slots
            for (int i = 0; i < al.length; i++) {
                al[i] = new ArrayList<>();
            }
            //Looping through array
            for (int i = 0; i < arr.size(); i++) {
                for (int e = 0; e < al.length; e++) {
                    //On first case do not divide by counter
                    if (looper == 0) {
                        if ((arr.get(i)) % 10 == e) {
                            al[e].add(arr.get(i));
                        }
                    } else {
                        if ((arr.get(i) / counter) % 10 == e) {
                            al[e].add(arr.get(i));
                        }
                    }
                }
            }
            //Clearing arr and refilling with al after process above
            arr.clear();
            for (ArrayList<Integer> nums : al) {
                arr.addAll(nums);
            }
            //Clearing al for next loop through
            Arrays.fill(al, null);
            //Incrementing to get from ones place to hundreds etc.
            counter += 10;
            looper++;
        }
        return arr;
    }

    /**
     * Helper method for the radix sort to find
     * the largest element in the array for the while loop
     * size
     *
     * @param arr - class level ArrayList
     * @return Largest element in arr
     */
    public int maxIntLength(ArrayList<Integer> arr) {
        int temp = 0;
        for (int i = 1; i < arr.size(); i++) {
            if (arr.get(i) > arr.get(i - 1)) {
                temp = arr.get(i);
            }
        }
        return temp;
    }

    //Testing below
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(28);
        arr.add(101);
        arr.add(37);
        arr.add(5004);
        arr.add(12);
        arr.add(5);
        RadixSort r = new RadixSort(arr);
        System.out.println(r.radixSort());
    }
}
