import java.text.DecimalFormat;

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
        for (int n = 0; n < 4; n++) {
            printer.replace(n, n + 1, "*");
            System.out.println(printer);
        }

        //intwork
        int n = -123;
        String s = Integer.toString(n) + "Jimbo";
        System.out.println(s);
        try {
            int num = Integer.parseInt(s);
            num += num;
            System.out.println(num);
        }
        catch(NumberFormatException ex){
            System.out.println("Your string has letters.");
        }

        //Time and money
        DecimalFormat money1 = new DecimalFormat("0.00");
        double number = 5.657893;
        System.out.println(money1.format(number));
        DecimalFormat time = new DecimalFormat("00");
        int hour = 8;
        int minute = 3;
        System.out.println(time.format(hour) + ":" + time.format(minute));

        //Date
        int month = 9, day = 23, yearr = 2022;
        double amount = 2344.8456;
        System.out.printf("Date:%02d/%02d/%d Amount: %7.2f\n", month, day, yearr, amount);



    }
}