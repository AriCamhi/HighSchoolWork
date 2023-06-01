import java.text.ParseException;
import java.util.HashMap;
import java.util.Scanner;

/**
 * Class that implements the data given from HTMLScanning. Contains a user
 * interface, and also the algorithm to calculate the percent chance of
 * a snow day.
 *
 * @author Ari Camhi
 * @version 5-23-23
 */
public class SnowDayCalculatorUI extends HTMLScanning {

    public static void main(String[] args) throws ParseException {
        SnowDayCalculatorUI ui = new SnowDayCalculatorUI();
        ui.snowUI();
    }

    /**
     * UI for a person to use that can calculate snow day given
     * a zipcode, type of school, and the amount of previous
     * snow days the school has already had.
     *
     * @throws ParseException //
     */
    public void snowUI() throws ParseException {
        Scanner sc = new Scanner(System.in);
        boolean runAgain = true;
        System.out.println("Welcome to the snow day calculator!");
        while (runAgain) {
            System.out.println("Please type in the following data for an accurate reading " +
                    "for your percent chance of a snow day!");
            System.out.println("Zipcode: ");
            int zipcode = Integer.parseInt(sc.next());
            System.out.println("Type of school (public/private): ");
            String school = sc.next();
            System.out.println("How many snow days have you already had?");
            int prevSnowDays = Integer.parseInt(sc.next());
            if (prediction(zipcode, school, prevSnowDays) <= 5) {
                System.out.println("Limited percent chance of snow day.");
            } else {
                System.out.println("Percent chance of snow day: " + (int) prediction(zipcode,
                        school, prevSnowDays) + "%");
            }
            System.out.println("Would you like to try a different zipcode? (yes/no)");
            String response = sc.next();
            if (response.equalsIgnoreCase("yes")) {
                runAgain = true;
            } else if (response.equalsIgnoreCase("no")) {
                runAgain = false;
            }
        }
        sc.close();
    }

    /**
     * Actual formula for calculating a snowDay
     *
     * @param zipcode      of area
     * @param school       that is given through UI
     * @param prevSnowDays amount of previous snow days in area
     * @return percent chance of a snow day
     * @throws ParseException //
     */
    public double prediction(int zipcode, String school, int prevSnowDays) throws ParseException {
        HashMap<String, Double> map = weatherData(zipcode);
        double finalPrediciton = 1.0;
        finalPrediciton += (map.get("snow") * 16);
        if (prevSnowDays <= 2) {
            finalPrediciton *= 1.15;
        } else if (prevSnowDays <= 5) {
            finalPrediciton *= 1;
        } else if (prevSnowDays <= 7) {
            finalPrediciton *= 0.7;
        } else {
            finalPrediciton *= 0.6;
        }
        if (map.get("preciptype") == 1.0 && map.get("temp") < 32) {
            finalPrediciton *= 2;
        } else if (map.get("preciptype") == 3.0) {
            finalPrediciton *= 1.2;
        } else {
            finalPrediciton *= 1.1;
        }
        if (school.equalsIgnoreCase("private")) {
            finalPrediciton *= 1.1;
        }
        if (map.get("tempmin") < 32) {
            finalPrediciton *= 1.5;
        }
        if (map.get("temp") < 32) {
            finalPrediciton *= 1.5;
        } else {
            finalPrediciton *= 0.95;
        }

        //If above 100, very likely but not 100 percent, sets to 97 by default
        //If between 0 and 5 very unlikely but not 0, so sets to 3 percent by default
        if (finalPrediciton >= 0 && finalPrediciton < 5) {
            finalPrediciton = 3;
        } else if (finalPrediciton >= 100) {
            finalPrediciton = 97;
        }
        return finalPrediciton;
    }
}
