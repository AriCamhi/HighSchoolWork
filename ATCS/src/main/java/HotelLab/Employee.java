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
        super();
        this.salary = 0;
        this.empsManager = null;
    }

    /**
     * Overloaded Constructor
     */
    public Employee(int salary, Manager empsManager) {
        this.salary = salary;
        this.empsManager = empsManager;
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
                ", empsManager=" + getEmpsManager() +
                ", name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", id='" + getId() + '\'' +
                '}';
    }

    public void generateEmployee(){
        Employee e = new Employee();
        Random r = new Random();
        e.setSalary(r.nextInt(100000));
        e.setAge(r.nextInt(90-21) + 21);
        e.setId("e" + r.nextInt(99999));
    }
}
