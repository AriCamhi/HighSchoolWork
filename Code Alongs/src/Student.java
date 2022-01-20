
/**
 * Simple template for a student to see
 * where they are and who they are as a student
 *
 * @author Ari Camhi
 * @version 9/15/21
 */
public class Student
{
    //Fields 

    private int gradeLevel;
    private char firstLetterName;
    private boolean isHappy;
    private double gpaAverage;
    private String favoriteClass;

    /**
     * The default constructor
     */
    public Student(){
    }

    /**
     * Overloaded constructor with all 
     * of our variables
     */public Student(int gradeLevel, char firstLetterName, boolean isHappy,
    double gpaAverage, String favoriteClass) {
        this.gradeLevel = gradeLevel;
        this.firstLetterName = firstLetterName;
        this.isHappy = isHappy;
        this.gpaAverage = gpaAverage;
        this.favoriteClass = favoriteClass;
    }

    /**
     * Getter for gradeLevel
     * 
     * @return this students gradeLevel
     */
    public int getGradeLevel(){
        return gradeLevel;
    }

    /**
     * Getter for firstLetterName
     * 
     * @return this students firstLetterName
     */
    public char getFirstLetterName(){
        return firstLetterName;
    }

    /**
     * Getter for isHappy
     * 
     * @return this students isHappy
     */
    public boolean isHappy(){
        return isHappy;
    }

    /**
     * Getter for gpaAverage
     * 
     * @return this students gpaAverage
     */
    public double getGpaAverage(){
        return gpaAverage;
    }

    /**
     * Getter for favoriteClass
     * 
     * @return this students favoriteClass
     */
    public String getFavoriteClass(){
        return favoriteClass;
    }

    /**
     * Setter for gradeLevel
     * 
     * @param   gradeLevel   the new gradeLevel for this Student
     */
    public void setGradeLevel(int newGradeLevel){
        gradeLevel = newGradeLevel;
    }

    /**
     * Setter for firstLetterName
     * 
     * @param   firstLetterName   the new firstLetterName for this Student
     */
    public void setFirstLetterName(char newFirstLetterName){
        firstLetterName = newFirstLetterName;
    }

    /**
     * Setter for isHappy
     * 
     * @param   isHappy   the new isHappy for this Student
     */
    public void setIsHappy(boolean newIsHappy){
        isHappy = newIsHappy;
    }

    /**
     * Setter for gpaAverage
     * 
     * @param   gpaAverage   the new gpaAverage for this Student
     */
    public void setGpaAverage(double newGpaAverage){
        gpaAverage = newGpaAverage;
    }

    /**
     * Setter for favoriteClass
     * 
     * @param   favoriteClass   the new favoriteClass for this Student
     */
    public void setFavoriteClass(String newFavoriteClass){
        favoriteClass = newFavoriteClass;
    }
    
}
