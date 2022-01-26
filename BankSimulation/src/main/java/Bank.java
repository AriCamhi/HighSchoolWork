import java.io.*;
import java.util.*;

/**
 * The bank class will be able to hold
 * multiple accounts for clients which also have fields
 * within them, and also have the ability to withdraw or deposit cash
 * into their accounts. Clients can have as many accounts as they want, but
 * the bank can hold only 1000 clients in total due to the exclusivity of
 * the bank.
 *
 * @author Ari Camhi
 * @version 1-25-22
 */
public class Bank {
    //Fields
    private ArrayList<Client> clientList = new ArrayList<>(1000);

    /**
     * Method that will add a new client to the bank. This will have the
     * client's data already filled out and is essentially registration
     * for a client
     *
     * @param client
     */
    public void addClient(Client client) {
        clientList.add(client);
    }

    /**
     * Method to get the number of clients
     */
    public int getNumberOfClients() {
        return clientList.size();
    }

}

