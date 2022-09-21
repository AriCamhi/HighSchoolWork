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
    public boolean leapYear(int year){
        boolean status = year % 4 == 0;
        if(year % 100 == 0 && year % 400 != 0){
            status = false;
        }
        String helper = "";
        if (!status){
            helper = "not ";
        }
        else if(status){
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
    public double costDistanceMethod(int distance){
        double cost = 0;
        if(distance >= 0 && distance <= 100){
            cost = 5.00;
        }
        else if(distance > 100 && distance <= 500){
            cost = 8.00;
        }
        else if(distance > 500 && distance < 1000){
            cost = 10.00;
        }
        else if(distance >= 1000){
            cost = 12.00;
        }
        System.out.println("The cost of this distance: " + distance + " is equal to: " + cost);
        return cost;
    }

    /**
     * Method to add up the sum of multiples of either 3 or 5
     * if the input is something other than 3 or 5 the
     * method will return "out of range"
     *
     * @param input
     * @return total
     */
    public int multiplesOf3or5(int input){
        int total = 0;
        if (input == 3){
            int i = 3;
            while (i <= 200){
                total += i;
                i += 3;
            }
            System.out.println("Sum of the multiples for 3 is: " + total);
            }
        else if(input == 5){
            int j = 5;
            while (j <= 200){
                total += j;
                j += 5;
            }
            System.out.println("Sum of the multiples for 5 is: " + total);
        }
        else {
            String printer = "Input: " + input + " is out of range";
            System.out.println(printer);
        }
        return total;
    }

    public int realMultiples(){
        int total = 0;
        int i = 3;
        int n = 5;
        while(i <= 200){
            if(n != i){
           total += i;
           total += n;
            i += 3;
            n += 5;
            }
            else{
                int both = i;
                total += both;
                i += 3;
                n += 5;
            }

        }
        return total;
    }



}
