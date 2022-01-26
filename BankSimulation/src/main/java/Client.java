import java.util.ArrayList;

/**
 * Client class will be used for making a new object
 * (client) for the bank. These clients will have
 * a firstName, lastName, and clientID
 *
 * @author Ari Camhi
 * @version 1-25-22
 */
public class Client extends Object {
    //Fields
    private String firstName;
    private String lastName;
    private int clientID;
    private ArrayList<Account> accountList;


    /**
     * Overloaded constructor...
     * Just creates a new client with all fields filled out
     */
    public Client(String firstName, String lastName, int clientID,
                  ArrayList<Account> accountList) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.clientID = clientID;
        this.accountList = accountList;
    }


    //All setters and getters below, just in case we need them
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getClientID() {
        return clientID;
    }

    public void setClientID(int clientID) {
        this.clientID = clientID;
    }

    public ArrayList<Account> getAccountList() {
        return accountList;
    }

    public void setAccountList(ArrayList<Account> accountList) {
        this.accountList = accountList;
    }

    /**
     * toString for client in case we need to print anything
     *
     * @return output
     */
    public String toString() {
        String output = "";


        return output;
    }
}
