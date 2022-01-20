package src;

/**
 * src.Main class
 * 
 * @author Ari Camhi
 * @version 10/29/21
 */
public class Main{
    public static void main(String[] args){
        RabbitPopulation rabPop1 = new RabbitPopulation(.10, .05, 0.001, 10);
        RabbitPopulation rabPop2 = new RabbitPopulation(.08, .05, 0.001, 100);
        RabbitPopulation rabPop3 = new RabbitPopulation(.10, .03, 0.001, 20);

        for (double x = 0; x < 50; x++){   
            rabPop1.oneYearOfUnlimitedGrowth();
            System.out.println("Fluffle Population: " + (int) rabPop1.getNumberOfRabbits());
        }

        int numberOfYears = 0;
        while (rabPop2.getNumberOfRabbits() > 0){
            rabPop2.oneYearOfUnlimitedGrowth();
            numberOfYears++;
            rabPop2.foxHunt();
        }
        System.out.println("Years until population dies: " + numberOfYears);

        numberOfYears = 0;
        int previousRabbits = 0;
        while (rabPop3.getNumberOfRabbits() - previousRabbits != 0){
            previousRabbits = rabPop3.getNumberOfRabbits();
            rabPop3.oneYearOfLimitedGrowth();
            numberOfYears++;
        }
        System.out.println("Years until population is the same 2 years in a row: " 
            + numberOfYears);

    }
}