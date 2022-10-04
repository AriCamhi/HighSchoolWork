/**
 * Lab 4 for ATCS
 * @author Ari Camhi
 * @version 10-4-22
 */
public class Lipogrammer {
    private String text;

    public Lipogrammer(String text){
        this.text = text;
    }

    public String mark(char letter){
        text.replace(letter, '#');
        text.replaceAll(String.valueOf(letter), "#");
        System.out.println(text);
        return text;
    }

//    public String allWordsWith(char letter){
//
//    }

    public static void main(String [] args){
        Lipogrammer l = new Lipogrammer("Type or paste your text here");
        l.mark('e');
    }

}
