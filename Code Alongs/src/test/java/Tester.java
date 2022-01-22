import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;


public class Tester {


    @Test
    public void testSomething() {
        Calculator c = new Calculator();

        assert(c.sign(32) == 1);
    }

    @Test
    public void testSomething2() {
        Calculator c = new Calculator();

        assert(c.sign(-1) == -1);
    }
    @Test
    public void testEvenMore(){
        ArrayMethods a = new ArrayMethods();
        assert(a.scanForValue(new double[]{1,2,3,55}, 55));

    }

    @Test
    public void testDuplicateValues(){
        ArrayMethods a = new ArrayMethods();
        assert(a.duplicateValues(new int[] {3, 2332, 3, 65}) == true);

    }

}
