import java.util.Arrays;

/**
 * Random coding
 *
 * @author Ari Camhi
 * @version 10-23-23
 */
public class FullRandom {

    public int[] sortArray(int[] arr){
        int temp = 0;
        for(int i = 0; i < arr.length - 1; i++){
            for(int j = 0; j < arr.length - 1; j++){
                if(arr[j] >= arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    j--;
                }
            }
        }
        return arr;
    }


    public static void main(String[] args){
        int[] arr1 = new int[]{9,1,3,2,8,10,12,5};
        FullRandom f = new FullRandom();
        System.out.println(Arrays.toString(f.sortArray(arr1)));
    }
}
