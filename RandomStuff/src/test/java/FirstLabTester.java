import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Class to test the FirstLab methods
 * through unit tests for the majority of the time
 *
 * @author Ari Camhi
 * @version 9-13-22
 */
public class FirstLabTester {
    FirstLab f = new FirstLab();

    @Test
    public void testingLeapYear(){
        assert(f.leapYear(2000));
        assert(f.leapYear(2004));
        assert(!f.leapYear(1800));
        assert(!f.leapYear(1997));
    }

    @Test
    public void testingCostDistanceMethod(){
        assert(f.costDistanceMethod(7)==5.00);
        assert(f.costDistanceMethod(108)==8.00);
        assert(f.costDistanceMethod(622)==10.00);
        assert(f.costDistanceMethod(1204)==12.00);
    }

}
