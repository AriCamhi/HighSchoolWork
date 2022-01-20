import java.lang.Math;

/**
 * A class used to represent a point with
 * an x and y coordinate
 * 
 * @author Ari Camhi
 * @version 9/27/21
 */
public class Point{
    //Fields
    private double xCoordinate;
    private double yCoordinate;

    /**
     * Overloaded constructor
     */
    public Point(double xCoordinate, double yCoordinate){
        this.xCoordinate = xCoordinate;
        this.yCoordinate = yCoordinate;
    
    }
    
    /**
     * Getter for the xCoordinate
     * 
     * @return xCoordinate position
     */
    public double getXCoordinate(){
        return xCoordinate;
    }
    
    /**
     * Getter for the yCoordinate 
     * 
     * @return yCoordinate position
     */
    public double getYCoordinate(){
        return yCoordinate;
    }
    
    /**
     * toString
     * 
     * @return a string representation of the point
     */
    public String toString(){
        String output = "";
        
        output = output + "Point Position: " + "\n";
        output = output + "(" + xCoordinate + "," + yCoordinate + ")";
        
        return output;
    }
    
    /**
     * Implement the distance formula 
     * 
     * @param  p  the point we are calculating the distance to 
     * @return    the distance to the other point
     */
    public double distanceTo(Point p){
        double delX = p.getXCoordinate() - this.xCoordinate;
        double delY = p.getYCoordinate() - this.yCoordinate;
    
        //return Math.sqrt(delX * delX + delY * delY);
        
        return Math.sqrt( Math.pow(delX, 2) + Math.pow(delY, 2) );
    }
    
    /**
     * Reflect the point over the y-axis
     */    
    public void reflectOverYAxis(){
        this.xCoordinate = -this.xCoordinate;
    }
}
