import java.util.ArrayList;
import java.util.Arrays;

/**
 * Learning ArrayLists and working with them
 * Which is better... Arrays or ArrayLists??
 *
 * @author Ari Camhi
 * @version 1-24-22
 */
public class ArrayListBasics {
    private int[] arr;
    private int count;

    public ArrayListBasics(int[] arr){
        this.arr = arr;
    }

    public static void main(String[] args) {

        //Size of an ArrayList soon to be made
        int n = 5;
        //Syntax for making a new ArrayList
        ArrayList<Integer> arrli = new ArrayList<>(n);

        //Just filling up the array
        for (int i = 0; i <= n; i++) {
            arrli.add(i);
        }
        System.out.println(arrli);
        arrli.add(4,9);
        arrli.remove(3);
        System.out.println(arrli);

        for (Integer integer : arrli) {
            System.out.println(integer + " ");
        }

        int[] arr = new int[]{3,5,8,2,5,6};
        ArrayListBasics alb = new ArrayListBasics(arr);
        alb.insert(4,2);
        ArrayList<String> al = new ArrayList<>();
        al.add("I");
        al.add("feel");
        al.add("like");
        al.add("this");
        al.add("is");
        al.add("like");
        al.add("like");
        al.add("going");
        al.add("to");
        al.add("work");
        String s = "like";
        for(int i = 0; i < al.size(); i++){
            if(al.get(i).equals(s)){
                al.remove(i);
                --i;
            }
        }
        System.out.println(al);
    }

    /**
     * Method that inserts an element into a given index
     * of an array.
     * @param elem
     * @param index
     */
    public void insert(int elem, int index){
        int length = arr.length;
        if(arr[length - 1] != 0){
            int[] arr2 = new int[arr.length * 2];
            for(int i = 0; i < arr.length; i++){
                arr2[i] = arr[i];
            }
            arr = arr2;
        }
        for(int j = length - 1; j >= index; j--){
            arr[j + 1] = arr[j];
        }
        arr[index] = elem;
        System.out.println(Arrays.toString(arr));
    }
}
