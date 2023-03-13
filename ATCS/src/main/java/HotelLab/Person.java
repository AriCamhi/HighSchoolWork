package HotelLab;

/**
 * Class that every other gains inheritance from. Highest
 * on the hierarchy among all the classes.
 *
 * @author Ari Camhi
 * @version 3-8-23
 */
public class Person {
    protected String name;
    protected int age;
    protected String id;

    /**
     * Empty Constructor
     */
    public Person() {

    }

    /**
     * Overloaded Constructor
     */
    public Person(String name, int age, String id) {
        this.name = name;
        this.age = age;
        this.id = id;
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
