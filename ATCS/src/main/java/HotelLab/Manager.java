package HotelLab;

import java.util.ArrayList;
import java.util.Random;

/**
 * Represents a manager and has ArrayList of employees
 * unlike the other classes.
 *
 * @author Ari Camhi
 * @version 3-8-23
 */
public class Manager extends Person {
    private int salary;
    private ArrayList<Employee> workers;


    /**
     * Empty Constructor
     */
    public Manager() {

    }

    /**
     * Overloaded Constructor
     */
    public Manager(int salary, ArrayList<Employee> workers) {
        this.salary = salary;
        this.workers = workers;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setWorkers(ArrayList<Employee> workers) {
        this.workers = workers;
    }

    @Override
    public String toString() {
        return "Manager{" +
                "salary=" + salary +
                ", workers=" + workers +
                ", name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", id='" + getId() + '\'' +
                '}';
    }

    public Manager generateManager(){
        Manager m = new Manager();
        Random r = new Random();
        m.setSalary(r.nextInt(200000));
        m.setAge(r.nextInt(90-21) + 21);
        m.setId("m" + r.nextInt(99999));
        return m;
    }

}
