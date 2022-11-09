import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Tester for the Fraction class to test the methods
 *
 * @author Ari Camhi
 * @version 10-25-22
 */
public class FractionTester {

    Fraction f = new Fraction();
    Fraction f1 = new Fraction(0.25);
    Fraction f2 = new Fraction(5,8);
    Fraction f3 = new Fraction(1.4);
    Fraction f4 = new Fraction(1,4);

    //Non-static tests below
    @Test
    public void testingGetters(){
        assert f1.getNum()==1;
        assert f1.getDenom()==4;
    }
    @Test
    public void testingDecimalValue(){
        assert f2.getDecimalValue()==0.625;
        assert f3.getDecimalValue()==1.4;
    }
    @Test
    public void testingEquality(){
        testEquality(f1, f1, true);
        testEquality(f2, f3, false);
        testEquality(f3, f2, false);
    }

    private void testEquality(Fraction f1, Fraction f2, boolean expected){
        Assertions.assertEquals(f1.equals(f2),expected);
        System.out.println(String.format("%s = %s is %s", f1, f2, expected));
    }
    @Test
    public void testingFractionPrinter(){
        f1.printFraction(f1);
        f2.printFraction(f2);
    }

    @Test
    public void testingComparisons(){
        testComparisons(f1, f1, 0);
        testComparisons(f2, f3, -1);
        testComparisons(f3, f2, 1);
    }

    private void testComparisons(Fraction f1, Fraction f2, int expected) {
        Assertions.assertEquals(f1.compareTo(f2), expected);
        System.out.println(String.format("Comparison of %s and %s is %s", f1, f2, expected));
    }

    @Test
    public void testNonStaticAddition() {
        System.out.print(String.format("New fraction added from: %s + %s = ", f1, f2));
        System.out.println("" + f1.add(f2));
    }
    @Test
    public void testNonStaticMultiplication() {
        System.out.print(String.format("New fraction multiplied from: %s * %s = ", f1, f2));
        System.out.println("" + f1.multiply(f2));
    }
    @Test
    public void testNonStaticDivision() {
        System.out.print(String.format("New fraction divided from: %s */* %s = ", f1, f2));
        System.out.println("" + f1.divide(f2));
    }


    //Static tests below
    @Test
    public void testingStaticAddition(){
        testStaticAdd(f1, f2, new Fraction(7, 8));
        testStaticAdd(f3, f4, new Fraction(33, 20));
    }

    private void testStaticAdd(Fraction f1, Fraction f2, Fraction expected) {
        Fraction result = Fraction.add(f1, f2);
        Assertions.assertEquals(expected, result);
        System.out.println(String.format("%s + %s = %s", f1, f2, result));
    }

    @Test
    public void testingStaticMultiplication(){
        testStaticMultiply(f2, f1, new Fraction(5, 32));
        testStaticMultiply(f3, f2, new Fraction(7, 8));
    }

    private void testStaticMultiply(Fraction f1, Fraction f2, Fraction expected) {
        Fraction result = Fraction.multiply(f1, f2);
        Assertions.assertEquals(expected, result);
        System.out.println(String.format("%s * %s = %s", f1, f2, result));
    }

    @Test
    public void testingStaticDivision(){
        testStaticDivide(f2, f1, new Fraction(5, 2));
        testStaticDivide(f3, f2, new Fraction(56, 25));
    }

    private void testStaticDivide(Fraction f1, Fraction f2, Fraction expected) {
        Fraction result = Fraction.divide(f1, f2);
        Assertions.assertEquals(expected, result);
        System.out.println(String.format("%s */* %s = %s", f1, f2, result));
    }
}
