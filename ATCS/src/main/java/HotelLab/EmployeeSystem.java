package HotelLab;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * System for employees and managers to look at information
 * after inputting id number. Allows employee to view salary or view info about
 * their manager. Mangers can add new employees, print information
 * about employees under their management, fire an employee, or raise employee salary.
 *
 * @author Ari Camhi
 * @version 3-8-23
 */
public class EmployeeSystem {

    public static void main(String[] args) {
        EmployeeSystem es = new EmployeeSystem();
        es.databaseUI();
    }

    public void databaseUI() {
        Scanner sc = new Scanner(System.in);
        boolean logOut = false;
        while (!logOut) {
            System.out.println("Hello! Would you like to be a manager or an employee? (e/m)");
            //Making new Employee
            Employee e1 = new Employee();
            String optE = e1.getId();
            //Making new Manager
            Manager m1 = new Manager();
            String optM = m1.getId();
            //Giving user the choice of being Manager or Employee
            String choice = sc.next();
            if (choice.equalsIgnoreCase("e")) {
                System.out.println("Here is your ID: " + e1.getId() + "\n Remember this number to access database");
                System.out.println("What is your name?");
                e1.setName(sc.next());
            } else if (choice.equalsIgnoreCase("m")) {
                System.out.println("Here is your ID: " + m1.getId() + "\n Remember this number to access database");
                System.out.println("What is your name?");
                m1.setName(sc.next());
            } else {
                logOut = true;
            }
            System.out.println("Input ID please");
            String idResponse = sc.next();
            if (idResponse.equals(optE)) {
                System.out.println("Hello! Here is the information you can view: " + "\n");
                m1.setName("Mr. Boss");
                e1.setEmpsManager(m1);
                System.out.println(e1.toString());
                System.out.println(m1.employeeToString() + "\n");
                System.out.println("There are no options for you to change. Have a good day!");
                logOut = true;
            } else if (idResponse.equals(optM)) {
                System.out.println("Hello! Here is the information you can view: " + "\n");
                ArrayList<Employee> ale = new ArrayList<>();

                for (int i = 1; i <= 5; i++) {
                    Employee e = new Employee();
                    e.setName(("minion" + i));
                    e.setEmpsManager(m1);
                    ale.add(e);
                }
                boolean continueEditing = true;
                while (continueEditing) {
                    m1.setWorkers(ale);
                    System.out.println(m1.toString() + "\n");
                    System.out.println(m1.employeeInfoToString() + "\n");
                    System.out.println("You have the ability to raise the salary of an existing employee, fire an employee, " +
                            "hire a new employee, or print information of one of your employees  " + "r {Raise}, f {Fire}, h {Hire}, p {Print}, c {Close System}");
                    String choiceDecision = sc.next();
                    if (choiceDecision.equalsIgnoreCase("r")) {
                        System.out.println("Which employee would you like to raise the salary of? (Enter ID#)" + "\n" + m1.employeeRoster());
                        String raiser = sc.next();
                        System.out.println("What would you like to raise his salary to?");
                        m1.findByID(raiser).setSalary(Integer.parseInt(sc.next()));
                        System.out.println("Would you like to continue making changes? (yes/no)");
                        if (sc.next().equalsIgnoreCase("no")) {
                            continueEditing = false;
                            logOut = true;
                        }
                    } else if (choiceDecision.equalsIgnoreCase("f")) {
                        System.out.println("Which employee would you like to fire? (Enter ID#)" + "\n" + m1.employeeRoster());
                        m1.removeByID(sc.next());
                        System.out.println("Would you like to continue making changes? (yes/no)");
                        if (sc.next().equalsIgnoreCase("no")) {
                            continueEditing = false;
                            logOut = true;
                        }
                    } else if (choiceDecision.equalsIgnoreCase("h")) {
                        Employee e = new Employee();
                        e.setSalary(50000);
                        e.setName("minion" + (m1.getWorkers().size() + 1));
                        e.setEmpsManager(m1);
                        ale.add(e);
                        System.out.println("System just added an employee to your workers with a salary of $50,000");
                        System.out.println("Would you like to continue making changes? (yes/no)");
                        if (sc.next().equalsIgnoreCase("no")) {
                            continueEditing = false;
                            logOut = true;
                        }
                    } else if (choiceDecision.equalsIgnoreCase("p")) {
                        System.out.println(m1.getWorkers());
                        System.out.println("Would you like to continue making changes? (yes/no)");
                        if (sc.next().equalsIgnoreCase("no")) {
                            continueEditing = false;
                            logOut = true;
                        }
                    } else if (choiceDecision.equalsIgnoreCase("c")) {
                        continueEditing = false;
                        logOut = true;
                    }
                }
            } else {
                System.out.println("Unfortunately that is not a valid ID");
                logOut = true;
            }
        }
    }
}