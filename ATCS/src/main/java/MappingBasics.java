import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Basics to mapping, more specifically
 * HashMaps... Learning the syntax of maps and also
 * some of the basic methods within HashMaps and what
 * they are capable of
 *
 * @author Ari Camhi
 * @version 1-24-22
 */
public class MappingBasics {

    public static void main(String[] args) {
        //Syntax below for creating a new map called testingMap
        //Statements initializing keys, and values
        //Maps are just sets of key which hold values
        //Syntax below for "putting" new values in
        //Print statements below, just run the main if you want to see what they do
        //Making new map below
        HashMap testingMap = new HashMap();
        testingMap.put("Ari", "Camhi");
        //Maps can hold nay type of datatype within, no limitations
        testingMap.put("Jason Williams", 55);
        testingMap.putIfAbsent("Ari", "Camhi");
        System.out.println(testingMap.entrySet());
        //No if statement needed for putIfAbsent()
        System.out.println(testingMap.get("Ari"));
        System.out.println(testingMap.keySet());
        System.out.println(testingMap.values());
        System.out.println(testingMap.entrySet());
        System.out.println(testingMap.containsKey("Jason Williams"));

        //Another way to initialize a map, this can only hold Strings for the keys
        //And Integers for the values
        HashMap<String, Integer> anotherTestingMap = new HashMap<String, Integer>();

        //If given the key "Ari", how to retrieve the value
        anotherTestingMap.put("Ari", 23);
        System.out.println(anotherTestingMap.get("Ari"));
        //How to replace a value from a key value pair
        anotherTestingMap.put("Steven", 24);
        anotherTestingMap.replace("Steven", 25);
        System.out.println(anotherTestingMap.values());
    }
}
