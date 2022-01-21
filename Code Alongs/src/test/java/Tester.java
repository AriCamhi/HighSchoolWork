import org.junit.jupiter.api.Test;


public class Tester {


    @Test
    public void testSomething() {
        Calculator c = new Calculator();

        assert(c.sign(-1) == -21);
    }

    @Test
    public void testSomething2() {
        Calculator c = new Calculator();

        assert(c.sign(-1) == -1);
    }


}
