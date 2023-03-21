import java.util.ArrayList;
import java.util.HashSet;

/**
 * Class that works with binary numbers. Can increment, add
 * two binary numbers together, and multiplication.
 *
 * @author Ari Camhi
 * @version 3-20-23
 */
public class BinaryArithmetic {

    /**
     * Increments the inputted binary number by one.
     *
     * @param num - to be incremented
     * @return - number in binary form
     */
    public int increment(int num) {
        //Converting binary number to ArrayList
        ArrayList<Integer> binaryNum = new ArrayList<>();
        String toConvert = Integer.toString(num);
        for (int i = 0; i < toConvert.length(); i++) {
            binaryNum.add(Integer.parseInt(String.valueOf(toConvert.charAt(i))));
        }
        //Finds right most 0, changes to 1 and everything to right of that index changes to 0s
        for (int j = binaryNum.size() - 1; j >= 0; j--) {
            if (binaryNum.get(j) == 0) {
                binaryNum.set(j, 1);
                break;
            }
            binaryNum.set(j, 0);
        }
        //Special cases solution (if all 1's)
        if (new HashSet<Integer>(binaryNum).size() <= 1 && binaryNum.get(0) == 0) {
            binaryNum.add(0);
            binaryNum.set(0, 1);
        }
        //Changing back to integer
        int total = 0;
        for (Integer i : binaryNum) { // assuming list is of type List<Integer>
            total = 10 * total + i;
        }
        //System.out.println(total);
        return total;
    }

    /**
     * Adds the two inputted binary numbers together
     *
     * @param num1 - one number to be added
     * @param num2 - another number to be added
     * @return - number in binary form
     */
    public int addBinaryNumbers(int num1, int num2) {
        return binaryIncrementLoop(findNumericalValue(num2),num1);
    }

    /**
     * Recursion method to help with the addition
     *
     * @param numericalValue - value of num2 from addBinaryNumbers()
     * @param num - binary number from addBinaryNumbers()
     * @return - finalValue
     */
    public int binaryIncrementLoop(int numericalValue, int num){
        if(numericalValue == 0){
            return num;
        }
        else{
            return binaryIncrementLoop(numericalValue - 1, increment(num));
        }
    }

    /**
     * Method to multiply two binary numbers
     *
     * @param num1 - binary number1
     * @param num2 - binary number1
     * @return - product of the two numbers in binary format
     */
    public int multiplyByAdding(int num1, int num2, int numericalVal){
        int total = num1;
        if(numericalVal == 0){
            return total;
        }
        else{
            return multiplyByAdding(num1,total,findNumericalValue(num2) - 1);
        }
    }

    /**
     * Helper method that takes in binary number and returns
     * numerical value of it.
     *
     * @param num - binary number that will be converted
     * @return - converted number
     */
    public int findNumericalValue(int num){
        //Converts to ArrayList
        ArrayList<Integer> binaryNum = new ArrayList<>();
        String toConvert = Integer.toString(num);
        for (int i = 0; i < toConvert.length(); i++) {
            binaryNum.add(Integer.parseInt(String.valueOf(toConvert.charAt(i))));
        }
        //Finds numerical value
        ArrayList<Integer> sum = new ArrayList<>();
        int numericalValue = 0;
        int counter = 0;
        for (int i = binaryNum.size() - 1; i >= 0; i--) {
            if (binaryNum.get(i) == 1) {
                numericalValue += Math.pow(2, counter);
            }
            counter++;
        }
        return numericalValue;
    }



    //Testing...
    public static void main(String[] args) {
        BinaryArithmetic ba = new BinaryArithmetic();
        ba.increment(1111110);
        System.out.println(ba.addBinaryNumbers(1011,111));
        //System.out.println(ba.helperForAddition(7,1011));
        ba.multiplyByAdding(110110,101, 101);
    }
}
