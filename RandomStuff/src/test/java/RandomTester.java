import org.junit.Test;
/**
 * Class to test our random methods
 * through unit tests for the majority of the time
 *
 * @author Ari Camhi
 * @version 1-22-22
 */
public class RandomTester {

    @Test
    public void testArraySortCheat(){
    FreelanceStuff f = new FreelanceStuff();
    assert(f.arraySortCheat(new int[] {3, 2, 1}).equals("yeah it works"));
    }
}
