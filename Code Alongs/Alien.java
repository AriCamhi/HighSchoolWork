/**
 * This class is our own datatype and so 
 * that we can create variables that represent 
 * Aliens
 * 
 * @author Ari Camhi
 * @version 9/13/21
 */
public class Alien {
    // Fields 
    
    /*
     * When a variable describes a characteristic 
     * of the datatype that we are creating and is 
     * declared outside of any methods, 
     * it is called a field
     */
    private String firstName;
    private char middleInitial;
    private boolean isAlive;
    private int ageInYears;
    private double heightInMeters;
    
    /**
     * Empty (default) Constructor for objects 
     * of the class Alien
     */
    public Alien() {
        
    }
    
    /**
     * Overloaded constructor for objects of the 
     * class Alien
     */
    public Alien(String firstName,char middleInitial, 
                boolean isAlive, int ageInYears,
                double heightInMeters) {
        this.firstName = firstName;
        this.middleInitial = middleInitial;
        this.isAlive = isAlive;
        this.ageInYears = ageInYears;
        this.heightInMeters = heightInMeters;
        
    }
    
    /**
     * Custom Constructor that represnts an Alien 
     * that has just been born
     */
    public Alien(String firstName, char middleInitial, double heightInMeters){
        this.firstName = firstName;
        this.middleInitial = middleInitial;
        this.isAlive = true;
        this.ageInYears = 0;
        this.heightInMeters = heightInMeters;
    }
    
    /**
     * Simple accesor (getter) for the field firstName
     * 
     * @return this Alien's first name
     */
    public String getFirstName(){
        return firstName;
    }
        
    /**
     * Simple mutator (setter) for the field firstName
     * 
     * @param   newFirstName   the new name for the Alien
     */
    public void setFirstName(String newFirstName){
        firstName = newFirstName;
    }
    
    /**
     * toString
     * 
     * @return A String representation of the object
     */
    public String toString(){
        String output = "";
        
        output = output + "Alien:" + "\n";
        
        output = output + "First name: " + firstName + "\n";
        
        output = output + "Middle initial:" + middleInitial + "\n";
        
        output = output + "Is alive:" + isAlive + "\n";
        
        output = output + "Age: " + ageInYears + " Years\n";
        
        output = output + "Height: " + heightInMeters + " Meters\n";
        
        return output;
    }
    
    
    
    
}