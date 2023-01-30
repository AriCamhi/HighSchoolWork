import java.util.ArrayList;

/**
 * Recursion area lab for ATCS that can calculate
 * the area of any polygon in the coordinate plane.
 *
 * @author Ari Camhi
 * @version 1-27-23
 */
public class RecursionArea {
    public RecursionArea() {

    }

    /**
     * Helper Method to calculate the area of a triangle after it is split up.
     *
     * @param x1
     * @param y1
     * @param x2
     * @param y2
     * @param x3
     * @param y3
     * @return
     */
    public double triangleArea(double x1, double y1, double x2, double y2, double x3, double y3) {
        System.out.println(Math.abs((x1 * y2) + (x2 * y3) + (x3 * y1) - (y1 * x2) - (y2 * x3) - (y3 * x1)) / 2);
        return Math.abs((x1 * y2) + (x2 * y3) + (x3 * y1) - (y1 * x2) - (y2 * x3) - (y3 * x1)) / 2;
    }

    /**
     * When returns true, that means it cannot be calculated.
     * It has no polygon...
     *
     * @param a
     * @return
     */
    public static boolean hasNoPolygon(ArrayList a) {
        return a.size() < 6;
    }


    /**
     * The actual method that will call the helper methods
     * to calculate the area of any polygon
     *
     * @param p
     * @return
     */
    public double polygonArea(ArrayList p) {
        if (p.size() <= 5) {
            return 0;
        } else {
            ArrayList<Double> pg = new ArrayList<Double>(p.subList(0, p.size() - 2));
//            System.out.println(triangleArea((Double) p.get(0), (Double) p.get(1), (Double) p.get(p.size() - 2), (Double) p.get(p.size() - 1),
//                    (Double) p.get(p.size() - 4), (Double) p.get(p.size() - 3)) + polygonArea(pg));
            return triangleArea((Double) p.get(0), (Double) p.get(1), (Double) p.get(p.size() - 2), (Double) p.get(p.size() - 1),
                    (Double) p.get(p.size() - 4), (Double) p.get(p.size() - 3)) + polygonArea(pg);
        }
    }
}
