import java.util.Arrays;

/**
 * Class for all things to be learned before AP
 * class in Greeley
 *
 * @author Ari Camhi
 * @version 1-22-22
 */
public class FreelanceStuff {

    /**
     * first method ever... ALONE!!!!!
     * sorting an array using Arrays.Sort()
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





}
