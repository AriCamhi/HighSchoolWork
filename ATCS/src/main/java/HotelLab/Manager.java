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
        Random r = new Random();
        setSalary(r.nextInt(200000 - 100000) + 100000);
        setAge(r.nextInt(65 - 21) + 21);
        setId("m" + getNextID());
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setWorkers(ArrayList<Employee> workers) {
        this.workers = workers;
    }

    public int getSalary() {
        return salary;
    }

    public ArrayList<Employee> getWorkers() {
        return workers;
    }

    @Override
    public String toString() {
        return "Manager{" +
                "salary=" + salary +
                ", name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", id='" + getId() + '\'' +
                '}';
    }

    public String employeeToString() {
        return "Your Manager{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", id='" + getId() + '\'' +
                '}';
    }

    public String employeeInfoToString() {
        String output = "Your Workers: ";
        for (int i = 0; i < workers.size(); i++) {
            output += workers.get(i).getName() + ", ";
        }
        output = output.substring(0, output.length() - 1);
        return output;
    }

    public String employeeRoster() {
        String output = "Your Workers: ";
        for (int i = 0; i < workers.size(); i++) {
            output += workers.get(i).getName() + " ID: ";
            output += workers.get(i).getId() + ", ";
        }
        output = output.substring(0, output.length() - 1);
        return output;
    }

    public Employee findByID(String id) {
        for (Employee worker : workers) {
            if (worker.getId().equalsIgnoreCase(id)) {
                return worker;
            }
        }
        return null;
    }

    public void removeByID(String id) {
        int remover = 0;
        for (int i = 0; i < workers.size(); ++i) {
            if (id.equalsIgnoreCase(workers.get(i).getId())) {
                remover = i;
                break;
            }
        }
        workers.remove(remover);
    }
}
