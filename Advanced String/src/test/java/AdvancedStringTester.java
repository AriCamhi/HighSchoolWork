import org.testng.annotations.Test;

/**
 * Class to test the methods from
 * AdvancedString through assertions
 *
 * @author Ari Camhi
 * @version 11-18-21
 */
public class AdvancedStringTester {
    @Test
    public void testPalindrome1() {
        AdvancedString adString = new AdvancedString("a man. a pl!an a canal. panama!");
        assert adString.isPalindrome();
    }

    @Test
    public void testPalindrome2() {
        AdvancedString adString2 = new AdvancedString("hello my name is ari");
        assert !adString2.isPalindrome();
    }

    @Test
    public void testPalindrome3() {
        AdvancedString adString3 = new AdvancedString("abcd dcb..a");
        assert adString3.isPalindrome();
    }

    @Test
    public void testPalindrome4() {
        AdvancedString adString4 = new AdvancedString("taqfat");
        assert !adString4.isPalindrome();
    }

    @Test
    public void testGenomeFormat1() {
        AdvancedString genomeString = new AdvancedString("john");
        assert genomeString.genomeFormat().

                equals("joh n");
    }

    @Test
    public void testGenomeFormat2() {
        AdvancedString genomeString2 = new AdvancedString("ACTGCTAGA");
        assert genomeString2.genomeFormat().

                equals("ACT GCT AGA");
    }


    @Test
    public void testPigLatin1() {
        AdvancedString pigLat = new AdvancedString("");
        assert pigLat.toPigLatin().

                equals("");
    }

    @Test
    public void testPigLatin2() {
        AdvancedString pigLat2= new AdvancedString("");
        assert pigLat2.toPigLatin().

                equals("");
    }

    @Test
    public void testPigLatin3() {
        AdvancedString pigLat3 = new AdvancedString("");
        assert pigLat3.toPigLatin().

                equals("");
    }

}