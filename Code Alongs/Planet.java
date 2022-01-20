import java.lang.Math;
/**
 * A class to represent Aliens colonizing
 * different planets with differen characteristics
 *
 * @author Ari Camhi
 * @version 9-22-21
 */
public class Planet{
    
    //Fields with all of our objects and variables
    private String color;
    private boolean atmosphere;
    private double radius;
    private Alien leader;
    private int population;

    
    /**
     * Empty constructor that holds all
     * of our objects
     */
    public Planet(){

    }

    /**
     * Overloaded constructor with all of our objects 
     * and variables
     */
    public Planet(String color, boolean atmosphere,
    double radius, Alien leader,
    int population){
        this.color = color;
        this.atmosphere = atmosphere;
        this.radius = radius;
        this.leader = leader;
        this.population = population;
    }
    
    /**
     * Getter for color of planet
     * 
     * @return the color of planet
     */
    public String getColor(){
        return color;
    }
    
    /**
     * Getter for atmosphere of the planet
     * 
     * @return the status of the atmosphere of the planet
     */
    public boolean getAtmosphere(){
        return atmosphere;
    }
    
    /**
     * Getter for radius of planet
     * 
     * @return the radius of planet
     */
    public double getRadius(){
        return radius;
    }
    
    /**
     * Getter for leader of planet
     * 
     * @return the leader of planet
     */
    public Alien getLeader(){
        return leader; 
    }
    
    /**
     * Getter for population of planet
     * 
     * @return the population of planet
     */
    public int getPopulation(){
        return population;
    }
    
    /**
     * Setter for color of planet
     * 
     * @param new color of planet
     */
    public void setColor(String newColor){
        color = newColor;
    }
    
    /**
     * Setter for atmosphere of planet
     * 
     * @param new atmosphere status of planet
     */
    public void setAtmosphere(boolean newAtmosphere){
        atmosphere = newAtmosphere;
    }
    
    /**
     * Setter for radius of planet 
     * 
     * @param new radius of planet
     */
    public void setRadius(double newRadius){
        radius = newRadius;
    }
    
    /**
     * Setter for leader of planet
     * 
     * @param new leader for the planet
     */
    public void setLeader(Alien newLeader){
        leader = newLeader;
    }
    
    /**
     * Setter for population of planet
     * 
     * @param new population for the planet
     */
    public void setPopulation(int newPopulation){
        population = newPopulation;
    }
    
    //Fancy accessor method
    /**
     * Implement volume formula using math lang
     * 
     * @return the volume of planet
     */
    public double getVolume(){
        return 4.0/3.0 * Math.PI * Math.pow(radius, 3);
    }
    
    //Fancy mutator method
    /**
     * Setter for the increasing of population
     * 
     * @param total population
     */
    public void increasePopulation(){
        population++;
    }
    
    /**
     * toString
     * 
     * @return a String representaion of the object
     */
    public String toString(){
        String output = "";
        
        output = output + "Planet: " + "\n";
        output = output + "Color: " + color + "\n";
        output = output + "Atmosphere Status: " + atmosphere + "\n";
        output = output + "Radius: " + radius + "\n";
        output = output + "Leader: " + leader + "\n";
        output = output + "Population: " + population + "\n";
        output = output + "Volume: " + getVolume() + "\n";
        
        
        return output;
    }
}