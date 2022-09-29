import org.junit.jupiter.api.Test;

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
    public void testingCoinCombinations(){
        //Equals "Test" for assertion purposes
        assert(s.coinCombinations(17).equals("Test"));
        assert(s.coinCombinations(21).equals("Test"));
        assert(s.coinCombinations(25).equals("Test"));
    }

    @Test
    public void testingCalculateBookTotal(){
        assert(s.calculateBookTotal(6, 8)==196);
        assert(s.calculateBookTotal(1,1)==37.95);
        assert(s.calculateBookTotal(1,2)==47.85);
        assert(s.calculateBookTotal(4,3)==111.65);
    }

    @Test
    //Equals "Test" for assertion purposes
    public void testingSeventeen76(){
        assert(s.seventeen76().equals("test"));
    }

    @Test
    //All equals 0, just for assertion testing purposes
    public void testingStarPyramid() {
        assert(s.starPyramid(4)==0);
        assert(s.starPyramid(5)==0);
        assert(s.starPyramid(3)==0);
        assert(s.starPyramid(9)==0);
    }

}
