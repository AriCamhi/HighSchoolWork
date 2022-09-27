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
    //This works, but it says that the test if failed
    public void testingStarPyramid() {
        assert(s.starPyramid(5).equals("It still works, don't know how to assert"));
    }

    @Test
    public void testingCoinCombos(){
        assert(s.coinCombinations(74).equals("hello"));
    }
}
