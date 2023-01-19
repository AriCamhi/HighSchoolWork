import java.util.ArrayList;

/**
 * Lab 4 for ATCS
 *
 * @author Ari Camhi
 * @version 10-6-22
 */
public class LipogramAnalyzer {
    private String text;

    public LipogramAnalyzer(String text) {
        this.text = text;
    }

    /**
     * Changes the letter inputted with a #
     *
     * @param letter to replace
     * @return the new string with #s
     */
    public String mark(char letter) {
        return text.replace(letter, '#');
    }

    /**
     * Finds all words in an inputted string and scans for any word
     * marked with the character that you input into the method
     *
     * @param letter to scan for
     * @return each word with that letter in it
     */
    public String allWordsWith(char letter) {
        String list = "";
        ArrayList<String> strings = new ArrayList<String>();
        int last = 0;
        text += " ";
        for (int i = 0; i < text.length(); i++) {
            String temp = "";
            Character c = text.charAt(i);
            if (!Character.isLetterOrDigit(c) && c != '\'' && c != '-') {
                temp = text.substring(last, i);
                strings.add("");
                if (temp.indexOf(letter) != -1) {
                    temp = temp.trim();
                    for (int j = 0; j < strings.size(); j++) {
                        if (!strings.contains(temp)) {
                            strings.add(0, temp);
                            list += temp + '\n';
                        }
                    }
                }
                last = i;
            }
        }
        return list.trim();
    }

    /**
     * Testing below
     */
    public static void main(String[] args) {
        LipogramAnalyzer l = new LipogramAnalyzer("will run the test and we will see if it works");
        System.out.println(l.allWordsWith('t'));
        System.out.println(l.mark('w'));
    }

}