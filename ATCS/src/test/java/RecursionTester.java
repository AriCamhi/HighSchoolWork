import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Class to unit test the RecursionArea class
 *
 * @author Ari Camhi
 * @version 1-29-23
 */
public class RecursionTester {
    RecursionArea ra = new RecursionArea();

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
    public void testTriangleArea() {
        ArrayList<Double> test = new ArrayList(Arrays.asList(2.0, 5.0, 5.0, 12.0, 7.0, 9.0));
        assert (ra.triangleArea(3.0, 5.0, 5.0, 12.0, 7.0, 9.0) == 10);
    }
}
