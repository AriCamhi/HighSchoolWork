
/**
 * Simple class for LEDLights
 * The custom constructor is representing a new LED light
 * fresh out of the box
 *
 * @author Ari Camhi
 * @version 9/17/21
 */

public class LEDLight{
    //Fields 
    private boolean isOn;
    private String color;
    
    /**
     * Empty default constructor
     */
    public LEDLight(){

    }
    
    /**
     * Overloaded Constructor with all variables
     */
    public LEDLight(boolean isOn, String color){
        this.isOn = isOn;
        this.color = color;

    }
    
    /**
     * New LEDLights out of the box and 
     * all of its properties
     */
    public LEDLight(String color){
        this.isOn = false;
        this.color = color;

    }
    
    /**
     * Turn off the LEDLight
     * 
     * @return the LED Light turning off
     */
    public boolean turnOff(){
        return isOn = false;
    }
}

