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
    public void testingCoinCombos(){
        assert(s.coinCombinations(74).equals("hello"));
    }

    @Test
    public void testingCalculateBookTotal(){
        assert(s.calculateBookTotal(6, 8)==196);
        assert(s.calculateBookTotal(1,1)==37.95);
        assert(s.calculateBookTotal(1,2)==47.85);
        assert(s.calculateBookTotal(4,3)==111.65);
    }

    @Test
    public void testingSeventeen76(){
        assert(s.seventeen76().equals("test"));
    }

    @Test
    //This works, but it says that the test if failed
    public void testingStarPyramid() {
        assert(s.starPyramid(5).equals("It still works, don't know how to assert"));
    }

}
