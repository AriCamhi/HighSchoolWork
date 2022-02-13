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
    public void testArraySortCheat() {
        FreelanceStuff f = new FreelanceStuff();
        assert (f.arraySortCheat(new int[]{3, 2, 1}).equals("yeah it works"));
    }

    @Test
    public void testFactorial() {
        FreelanceStuff f = new FreelanceStuff();
        assert (f.factorial(3) == 6);
    }

    @Test
    public void testingFibo() {
        FreelanceStuff f = new FreelanceStuff();
        //assert(f.fibo(0) == 0);
        //assert(f.fibo(1) == 1);
        //assert(f.fibo(2) == 1);
        //assert(f.fibo(5) == 5);
        f.fibo(30);
    }

    @Test
    public void testingIsPrime(){
        FreelanceStuff f = new FreelanceStuff();
        assert(f.isPrime(61) == true);
    }
}
