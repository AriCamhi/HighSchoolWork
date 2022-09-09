/**
 * @author Ari
 * @version 9-8-22
 */

public class Main {
    public static void main(String[] args){

        //Mexican Population
        int year = 2010;
        double population = 111.2;
        while(population <  120){
            population = population * 1.13;
            year++;
        }
        System.out.println("Year: " + year + ", Population: "+ population + " million");
    }
}
