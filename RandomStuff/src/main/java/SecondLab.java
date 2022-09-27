/**
 * Second Lab with 4 methods for ATCS
 *
 * @author Ari Camhi
 * @version 9-19-22
 */
public class SecondLab {

    public String coinCombinations(int cents) {
        int quarters = 0;
        int dimes = 0;
        int nickels = 0;
        int pennies = 0;
        while(cents >= 0){
            if(cents % 25 != cents){
                cents = cents % 25;
                quarters += cents / 25;
            }
            else if(cents % 10 != cents){
                cents = cents % 10;
                dimes += cents / 10;
            }
            else if(cents % 5 != cents){
                cents = cents % 5;
                nickels += cents / 5;
            }
            else {
                cents = 0;
                pennies += cents;
            }
        }
        System.out.println("Quarters: " + quarters + " Dimes: " + dimes + " Nickels: " + nickels
                + " Pennies: " + pennies);
        String j = "hello";
        return j;
    }

//    public String seventeen76(){
//        int num = 1;
//        int denom = 1;
//        int desired = 17 / 76;
//
//    }

    /**
     * Method to return the stars in the shape of an upside down
     * pyramid. Using a StringBuilder instead of just a string to make
     * it easier. Example: int n = 5
     * Should return:
     *    *
     *   ***
     *  *****
     *
     * @param n
     * @return pic of pyramid
     */
    public StringBuilder starPyramid ( int n){
        StringBuilder output = new StringBuilder();
        output.append(" ".repeat(n));
        output.replace(n / 2, (n / 2) + 1, "*");
        int tracker = 1;
        System.out.println(output);
        for (int i = 0; i < n; i++) {
            //Adding to the both side
            int beginning = (n / 2) - tracker;
            int end = (n / 2) + tracker;
            output.replace((n / 2) - tracker, (n / 2) + tracker, "*".repeat(end - beginning + 1));
            tracker++;
            System.out.println(output);
        }
        return output;
        }
}

