/**
 * Class for the first lab inn AT comp sci, 3 methods
 *
 * @author Ari Camhi
 * @version 9-13-22
 */
public class FirstLab {

    /**
     * Method to determine if a year given in the input
     * is a leap year or not. If the year is divisible by 100
     * it must be divisible by 400 to be a true leap year. But if
     * the year is not divisible by 100 it just needs ot be divisible by 4.
     *
     * @param year
     * @return true or false if the year is a leap year
     */
    public boolean leapYear(int year) {
        boolean status = year % 4 == 0;
        if (year % 100 == 0 && year % 400 != 0) {
            status = false;
        }
        String helper = "";
        if (!status) {
            helper = "not ";
        } else if (status) {
            helper = "";
        }
        System.out.println("The year " + year + " is " + helper + "a leap year");
        return status;
    }

    /**
     * Return the value of the cost given the distance
     * given as the input.
     *
     * @param distance
     * @return cost
     */
    public double costDistanceMethod(int distance) {
        double cost = 0;
        if (distance >= 0 && distance <= 100) {
            cost = 5.00;
        } else if (distance > 100 && distance <= 500) {
            cost = 8.00;
        } else if (distance > 500 && distance < 1000) {
            cost = 10.00;
        } else if (distance >= 1000) {
            cost = 12.00;
        }
        System.out.println("The cost of this distance: " + distance + " is equal to: " + cost);
        return cost;
    }


    /**
     * Find the multiples of 3 and 5 under 200, accounts for duplicates
     * and eliminates them from the final total
     *
     * @return finalTotal with no duplicates
     */
    public int multiplesOf3or5() {
        int totalI = 0;
        int totalN = 0;
        int totalJ = 0;
        int finalTotal = 0;
        int i = 3;
        int n = 5;
        int j = 15;
        while (i <= 200) {
            totalI += i;
            i += 3;
        }
        while (n <= 200) {
            totalN += n;
            n += 5;
        }
        while (j <= 200) {
            totalJ += j;
            j += 15;
        }
        finalTotal = (totalI + totalN) - totalJ;
        System.out.println("Multiples of 3 and 5 below 200, with no duplicates: " + finalTotal);
        return finalTotal;
    }
}
