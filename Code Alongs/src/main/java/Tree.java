import java.lang.Math;
/**
 * It's a tree!
 *
 * @author Mr. Potter
 * @version 10-19-21
 */
public class Tree
{
    private String species;
    private double trunkRadius; // in inches

    /**
     * Empty constructor for objects of class Tree
     */
    public Tree()
    {

    }
    
    /**
     * Overloaded Constructor for objects of class Tree
     */
    public Tree(String species, double trunkRadius)
    {
        this.species = species;
        this.trunkRadius = trunkRadius;
    }

    /**
     * Get the trunk's radius
     * 
     * @return  the radius of the tree trunk in inches
     */
    public double getTrunkRadius() {
        return this.trunkRadius;
    }
    
    // This is a fancy accessor method
    /**
     * Calculate and return the diameter of the tree
     *
     * @return    the diameter of the trunk
     */
    public double diameter()
    {
        return trunkRadius + trunkRadius;
    }
    
    // This is also a fancy accessor method
    /**
     * Calculate and return the min chain saw length needed to cut down
     * the tree
     * 
     * @return  the min chain saw length needed to cut down the tree
     */
    public double minChainSawLength() 
    {
        return 2 + diameter();
    }
    
    /**
     * Calculate the basal area of the tree using pi * r * r
     * 
     * @return  the basal area of the tree in square inches
     */
    public double basalArea() 
    {
        return Math.PI * trunkRadius * trunkRadius;    
    }
    
    // This is a fancy mutator
    /**
     * Add one to the trunkRadius to represent a growth season
     *
     */
    public void growTree() 
    {
        // this.trunkRadius = this.trunkRadius + 1;
        // this.trunkRadius++;
        trunkRadius++;
    }
}