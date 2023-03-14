package HotelLab;

import java.util.Random;

/**
 * Extends Person which allows to have access to its methods
 * and fields.
 *
 * @author Ari Camhi
 * @version 3-8-23
 */
public class Employee extends Person {
    private int salary;
    //The employees manager
    private Manager empsManager;

    /**
     * Empty Constructor
     */
    public Employee() {
        Random r = new Random();
        setSalary(r.nextInt(100000));
        setId("e" + getNextID());
        setAge(r.nextInt(65 - 21) + 21);
    }


    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setEmpsManager(Manager empsManager) {
        this.empsManager = empsManager;
    }

    public int getSalary() {
        return salary;
    }

    public Manager getEmpsManager() {
        return empsManager;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "salary=" + getSalary() +
                ", empsManager=" + getEmpsManager().getName() +
                ", name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", id='" + getId() + '\'' +
                '}';
    }
}
