package HotelLab;

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

    public static void main(String[] args){
        Employee e1 = new Employee();
        e1.generateEmployee();
        e1.setName("John");
        System.out.println(e1.toString());
    }

    public void databaseUI(){
        Scanner sc = new Scanner(System.in);
        boolean logOut = false;
        while(!logOut){
            System.out.println("Hello! Would you like to be a manager or an employee? (e/m)");
            //Making new Employee
            Employee e1 = new Employee();
            e1.generateEmployee();
            String optE = e1.getId();
            //Making new Manager
            Manager m1 = new Manager();
            m1.generateManager();
            String optM = m1.getId();
            //Giving user the choice of being Manager or Employee
            String choice = sc.next();
            if(choice.equalsIgnoreCase("e")){
                System.out.println("Here is your ID: " + e1.getId() + "\n Remember this number to access database");
            }
            else if(choice.equalsIgnoreCase("m")){
                System.out.println("Here is your ID: " + m1.getId() + "\n Remember this number to access database");
            }
            else{
                logOut = true;
            }
            System.out.println("Input ID please");
            String idResponse = sc.next();
            if(idResponse.equals(optE)){
                System.out.println("Hello here is the information you can view: ");
                System.out.println(e1.toString());
            }
            else if(idResponse.equals(optM)){
                //System.out.println()
            }
            else{
                System.out.println("Unfortunately that is not a valid ID");
                logOut = true;
            }
        }
    }
}
