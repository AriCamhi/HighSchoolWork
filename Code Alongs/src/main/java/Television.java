/**
 * A class describing a television 
 * with different variables
 * 
 * @author Ari Camhi
 * @version 9-30-21
 */
public class Television{

    //Fields for the television
    private boolean isFlatscreen;
    private double size;
    private String brand;
    private double price;
    
    /**
     * Empty constructor holding 
     * all of the variables
     */
    public Television(){

    } 

    /**
     * Overloaded constructor with all
     * of the variables
     */
    public Television(boolean isFlatscreen, double size,
    String brand, double price){
        this.isFlatscreen = isFlatscreen;
        this.size = size;
        this.brand = brand;
        this.price = price;
    }

    //Getters (Accessors) for variables
    public boolean getFlatscreen(){
        return isFlatscreen;
    }

    public double getSize(){
        return size;
    }

    public String getBrand(){
        return brand;
    }

    public double getPrice(){
        return price;
    }

    //Setters (Mutators) for variables
    public void setFlatscreen(boolean newFlatscreen){
        isFlatscreen = newFlatscreen;
    }

    public void setSize(double newSize){
        size = newSize;    
    }

    public void setBrand(String newBrand){
        brand = newBrand;
    }

    public void setPrice(double newPrice){
        price = newPrice;
    }

    
    //Accessor methods for the length, width, and area
    /**
     * Accessor using pythagorean theorem
     * 
     * @return the width
     */
    public double getWidth(){
        return size / 1.90208412;
    }

    /**
     * Accessor using pythagorean theorem
     * 
     * @return the length
     */
    public double getLength(){        
        return getWidth() * 1.618;
    }

    /**
     * Accessor using simple formula of WL = A
     * 
     * @return the area
     */
    public double getArea(){
        return getWidth() * getLength();
    }

    /**
     * toString method for Television
     * 
     * @return toString of television
     */
    public String toString(){
        String output = "";
        
        output =output + "TV Description: " + "\n";
        output = output + "Flatscreen Status: " + isFlatscreen + "\n";
        output = output + "Size: " + size + "\n";
        output = output + "Price: " + price + "\n";
        output = output + "Brand: " + brand + "\n" + "\n";
        output = output + "Dimensions of TV: " + "\n";
        output = output + "Width: " + getWidth() + "\n";
        output = output + "Length: " + getLength() + "\n";
        output = output + "Area: " + getArea() + "\n";

        return output;
    }
}