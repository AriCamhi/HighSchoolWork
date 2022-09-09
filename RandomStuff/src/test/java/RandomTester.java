import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Class to test our random methods
 * through unit tests for the majority of the time
 *
 * @author Ari Camhi
 * @version 1-22-22
 */
public class RandomTester {

    RandomMethods f = new RandomMethods();
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
        assert(f.isPrime(73) == true);
    }

    @Test
    public void testingSimplifyRadical(){
        RadResult result = f.simplifyRadical(50);
        assertEquals(5, result.getIntegerPart());
        assertEquals(2, result.getRadPart());
    }

    @Test
    public void testingSimplifyRadical2(){
        RadResult result = f.simplifyRadical(72);
        assertEquals(6, result.getIntegerPart());
        assertEquals(2, result.getRadPart());
    }

    @Test
    public void testingReverseString(){
        assert(f.reverseString("hello").equalsIgnoreCase("olleh"));
        assert(f.reverseString("HeLLooo").equalsIgnoreCase("ooollEH"));
    }

    @Test
    public void testingReverseStringAgain(){
        assert(f.reverseStringAgain("Hello").equalsIgnoreCase("olleh"));
    }

    @Test
    public void testingFactorialForLoop(){
        assert(f.factorialForLoop(5) == 120);
    }

    @Test
    public void testingPrintStars(){
        assert(f.printStars(2).equals("* \n **"));
    }

    @Test
    public void testingAddOdds(){assert(f.addOdds(5 ) == 9);}

    @Test
    public void testingBasicMathAddition(){assert(f.basicAdditionMethod(6) == 21);}
}

