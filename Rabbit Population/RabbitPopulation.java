import java.lang.Math;
/**
 * A class to represent Rabbit population and the changes
 * 
 * @author Ari Camhi
 * @version 10/29/21
 */
public class RabbitPopulation{
    private double replicationChance;
    private double deathChance;
    private double crowdingCoefficient;
    private double numberOfRabbits;

    /**
     * Empty Constructor
     */
    public RabbitPopulation(){

    }

    /**
     * Overloaded Constructor
     */
    public RabbitPopulation(double replicationChance, double deathChance,
    double crowdingCoefficient, double numberOfRabbits){
        this.replicationChance = replicationChance;
        this.deathChance = deathChance;
        this.crowdingCoefficient = crowdingCoefficient;
        this.numberOfRabbits = numberOfRabbits;
    }

    //Getter and Setter for Rabbit Population:
    /**
     * Returns the numebr of rabbits only as an int, cannot be decimal
     */
    public int getNumberOfRabbits(){
        return (int) numberOfRabbits;
    }

    /**
     * Setter for the Number of Rabbits, will only set to a positive
     * number... Not a negative
     */
    public void setNumberOfRabbits(double numberOfRabbits){
        if (numberOfRabbits < 0) {
            numberOfRabbits = 0;
        }
        else {
            this.numberOfRabbits = numberOfRabbits;
        }
    }

    //Mutation Methods:
    /**
     * Method to represent one year of unlimited growth of 
     * these rabbits
     *  
     */
    public void oneYearOfUnlimitedGrowth(){
         setNumberOfRabbits(numberOfRabbits + (replicationChance - deathChance) 
         * numberOfRabbits);

    }

    /**
     * Method to represent one year of limited growth
     * with the rabbits due to carrying capacity
     * 
     */
    public void oneYearOfLimitedGrowth(){
        setNumberOfRabbits(numberOfRabbits + (replicationChance - deathChance
            - crowdingCoefficient * numberOfRabbits) 
            * numberOfRabbits);
        
    }
    
    /**
     * Method to represent the rabbits getting
     * eaten by foxes
     */
    public void foxHunt(){
        setNumberOfRabbits(numberOfRabbits - 5);
    }
}