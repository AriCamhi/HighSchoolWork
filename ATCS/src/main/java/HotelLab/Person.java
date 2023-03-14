package HotelLab;

/**
 * Class that every other gains inheritance from. Highest
 * on the hierarchy among all the classes.
 *
 * @author Ari Camhi
 * @version 3-8-23
 */
public class Person {
    private String name;
    private int age;
    private String id;

    private static int nextID = 0;

    protected static int getNextID() {
        return nextID++;
    }

    /**
     * Empty Constructor
     */
    public Person() {
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getId() {
        return id;
    }
}
