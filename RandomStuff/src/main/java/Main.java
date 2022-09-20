/**
 * @author Ari
 * @version 9-8-22
 */

public class Main {
    public static void main(String[] args) {

        //Mexican Population
        int year = 2010;
        double population = 111.2;
        while (population < 120) {
            population = population * 1.13;
            year++;
        }
        System.out.println("Year: " + year + ", Population: " + population + " million");

        //Print Stars Backwards
        for (int i = 5; i >= 1; i--) {
            String stars = "*";
            System.out.println(stars.repeat(i));
        }

        //Replace Dashes With Stars
        StringBuilder printer = new StringBuilder();
        printer.append("____");
        System.out.println(printer);
            for(int n = 0; n < 4; n++){
                printer.replace(n,n + 1,"*");
                System.out.println(printer);
            }

        String s1 = "A";
        String s2 = "A";
        String s3 = "A";
        String s4 = new String("A");

        System.out.println(s1 + " .compareTo " + s2 + ": " + (s1.compareTo(s2)));

        SecondLab s = new SecondLab();
        System.out.println(s.coinCombinations(50));
    }
}
