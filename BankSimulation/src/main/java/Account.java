/**
 * The accounts class will have a name and ID attached to it, and
 * clients will hold this class inside it with all the methods as well
 *
 * @author Ari Camhi
 * @version 1-25-22
 */
public class Account {
    //Fields
    private String accountName;
    private int accountID;

    //Getters and Setters for the fields just in case
    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public int getAccountID() {
        return accountID;
    }

    public void setAccountID(int accountID) {
        this.accountID = accountID;
    }

    /**
     * Overloaded Constructor
     */
    public Account(String accountName, int accountID) {
        this.accountName = accountName;
        this.accountID = accountID;
    }


}
