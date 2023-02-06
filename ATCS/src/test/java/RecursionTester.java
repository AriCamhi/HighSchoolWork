import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Class to unit test the RecursionArea class.
 * Will be testing the polygonArea method with a triangle
 * and other polygons with more than 6 points in ArrayList.
 *
 * @author Ari Camhi
 * @version 1-29-23
 */
public class RecursionTester {
    RecursionArea ra = new RecursionArea();
    //Assertion Tests below
    @Test
    public void testPolygonArea1() {
        ArrayList<Double> test = new ArrayList(Arrays.asList(3.0, 5.0, 5.0, 12.0, 7.0, 9.0));
        assert (ra.polygonArea(test) == 10);
    }

    @Test
    public void testPolygonArea2() {
        ArrayList<Double> test2 = new ArrayList(Arrays.asList(1.0, 5.0, 1.0, 9.0, 4.0, 8.0, 5.0, 6.0));
        assert (ra.polygonArea(test2) == 10.5);
    }

    @Test
    public void testPolygonArea3() {
        ArrayList<Double> test3 = new ArrayList(Arrays.asList(1.0, 5.0, 3.0, 8.0, 5.0, 12.0, 8.0, 8.0, 8.0, 4.0, 5.0, 1.0));
        assert (ra.polygonArea(test3) == 45.5);
    }

    @Test
    public void testPolygonArea4() {
        ArrayList<Double> test4 = new ArrayList(Arrays.asList(1.0, 2.0, 1.0, 5.0, 4.0, 8.0, 6.0, 5.0, 6.0, 2.0, 4.0, 1.0));
        assert (ra.polygonArea(test4) == 25);
    }

    @Test
    public void testPolygonArea5() {
        ArrayList<Double> test5 = new ArrayList(Arrays.asList(1.0, 2.0));
        assert (ra.polygonArea(test5) == 0);
    }

    @Test
    public void testTriangleArea() {
        ArrayList<Double> test = new ArrayList(Arrays.asList(2.0, 5.0, 5.0, 12.0, 7.0, 9.0));
        assert (ra.triangleArea(3.0, 5.0, 5.0, 12.0, 7.0, 9.0) == 10);
    }


    /**
     * Scanner system for user inputs instead of assertion
     * testing
     */
    public void recursionScanner(){
        Scanner sc = new Scanner(System.in);
        boolean playAgain = true;
        while (playAgain) {
            sc.nextLine();
            System.out.println("Type points you would like to enter in format (x1, y1, x2 y2... etc.)");
            String toConvert = sc.nextLine();
            String[] strSplit = toConvert.split(",");
            ArrayList<String> moreConvert = new ArrayList<>(Arrays.asList(strSplit));
            ArrayList<Double> finalArr = new ArrayList<>();
            for (String s : moreConvert) {
                finalArr.add(Double.parseDouble(s));
            }
            RecursionArea ra = new RecursionArea();
            double answer = ra.polygonArea(finalArr);
            System.out.println(answer);
            System.out.println("Would you like to put in another polygon? (yes/no)");
            playAgain = false;
            String response = "";
            response = sc.next();
            if (response.equalsIgnoreCase("yes")) {
                playAgain = true;
            }
        }
        System.out.println("Program has closed :(");
        sc.close();
    }

    /**
     * Main method to run the scanner through.
     */
    public static void main (String[]args){
            RecursionTester rt = new RecursionTester();
            rt.recursionScanner();
        }
    }