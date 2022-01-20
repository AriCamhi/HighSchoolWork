/**
 * Class to test the methods from
 * AdvancedString through assertions
 * 
 * @author Ari Camhi
 * @version 11-18-21
 */
public class AdvancedStringTester{
    public static void main(String[] args){
        AdvancedString adString = new AdvancedString("a man. a pl!an a canal. panama!");
        assert adString.isPalindrome();
        
        AdvancedString adString2 = new AdvancedString("hello my name is ari");
        assert adString2.isPalindrome();
        
        AdvancedString adString3 = new AdvancedString("abcd dcb..a");
        assert adString3.isPalindrome();
        
        AdvancedString adString4 = new AdvancedString("taqfat");
        assert !adString4.isPalindrome();
        
        AdvancedString genomeString = new AdvancedString("john");
        assert genomeString.genomeFormat().equals("joh n"); 
        
        AdvancedString genomeString2 = new AdvancedString("ACTGCTAGA");
        assert genomeString2.genomeFormat().equals("ACT GCT AGA");
        
        AdvancedString pigLat = new AdvancedString("");
        assert pigLat.toPigLatin().equals("");
        
        AdvancedString pigLat2 = new AdvancedString("");
        assert pigLat2.toPigLatin().equals("");
        
        AdvancedString pigLat3 = new AdvancedString("");
        assert pigLat3.toPigLatin().equals("");
    }
}