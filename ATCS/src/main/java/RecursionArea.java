import java.util.ArrayList;

/**
 * Recursion area lab for ATCS that can calculate
 * the area of any polygon in the coordinate plane.
 *
 * @author Ari Camhi
 * @version 1-27-23
 */
public class RecursionArea {
    public RecursionArea(){

    }

    /**
     * Helper Method to calculate the area of a triangle after it is split up.
     * @param x1
     * @param y1
     * @param x2
     * @param y2
     * @param x3
     * @param y3
     * @return
     */
    private static double triangleArea(double x1, double y1, double x2, double y2, double x3, double y3){
        return Math.abs((x1 * y2) + (x2 * y3) + (x3 * y1) - (y1 * x2) - (y2 * x3) - (y3 - x1)) / 2;
    }

    /**
     * When returns true, that means it cannot be calculated.
     * It has no polygon...
     * @param a
     * @return
     */
    public static boolean hasNoPolygon(ArrayList a){
        return a.size() < 6;
    }

//    public static double triangleArea(ArrayList p){
////        for(int i = 0; i < p.size(); i++){
////            p[i] =
////        }
////        return triangleArea()
////    }

}
