import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Class to test our random methods
 * through unit tests for the majority of the time
 *
 * @author Ari Camhi
 * @version 1-22-22
 */
public class RandomTester {

    FreelanceStuff f = new FreelanceStuff();
    @Test
    public void testArraySortCheat() {
        assert (f.arraySortCheat(new int[]{3, 2, 1}).equals("yeah it works"));
    }

    @Test
    public void testFactorial() {
        assert (f.factorial(3) == 6);
    }

    @Test
    public void testingFibo() {
        //assert(f.fibo(0) == 0);
        //assert(f.fibo(1) == 1);
        //assert(f.fibo(2) == 1);
        //assert(f.fibo(5) == 5);
        //f.fibo(30);
    }

    @Test
    public void testingIsPrime(){
        assert(f.isPrime(89) == true);
    }

    @Test
    public void testingSimplifyRadical(){
        RadResult result = f.simplifyRadical(50);
        assertEquals(5, result.getIntegerPart());
        assertEquals(2, result.getRadPart());
    }

    @Test
    public void testingSimplifyRadical2(){
        RadResult result = f.simplifyRadical(448);
        assertEquals(8, result.getIntegerPart());
        assertEquals(7, result.getRadPart());
    }
}
