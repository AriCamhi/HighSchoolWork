
/**
 *
 * @author Ari
 * @version 9-3-21
 */

public class Main{
    public static void main(String[] args){
//        // System.out.println("Hello World");
//        //Calling the empty Constructor for the new class alien
//        //Alien playerOne = new Alien();
//        //Calling the overloaded Constructor for the class alien
//        //Alien playerTwo = new Alien("Regina", ' ', true, 16, 1.7);
//        //Calling the custom Constructor for the class alien
//        //Alien playerThree = new Alien("Diego", ' ', 1.8);
//        //Television tvOne = new Television(true, 3.236, "Samsung", 500);
//        //System.out.println(tvOne);
//        //Solution to problem one
//        //Solution to problem two
//        //Solution to problem three
//        //Solution to problem four
//
//
//        //Sum all of the numbers from 1 to 1000
//        int sumSoFar = 0;
//        for (int i = 0; i <= 1000; i++) {
//            sumSoFar += i;
//        }
//        System.out.println(sumSoFar);
//
//        //Write a loop that shows how a tree grows
//        Tree christian = new Tree("oak", 1);
//        //For five seasons make the reaadius grow
//        //and then print out the basal area
//        for (int season = 0; season < 5; season++) {
//            christian.growTree();
//
//            String output = "Season: " + season + "\n"
//                            + "Radius: " + christian.getTrunkRadius() + "\n"
//                            + "Area: " + christian.basalArea();
//            System.out.println(output);
//
//        }


        StringBuilder stars = new StringBuilder();
        for(int i = 5; i > 0; i--){
            stars.append("*");
            System.out.println(stars);
        }
    
    }
}