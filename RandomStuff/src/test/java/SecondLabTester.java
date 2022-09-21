import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Class to test the SecondLab methods
 * through unit tests for the majority of the time
 *
 * @author Ari Camhi
 * @version 9-13-22
 */
public class SecondLabTester {
    SecondLab s = new SecondLab();

    @Test
    public void testingStarPyramid() {
        assert(s.newStars(5).equals("*****\n *** \n  *  \n     "));
    }
}
