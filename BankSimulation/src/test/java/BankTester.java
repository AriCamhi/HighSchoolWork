import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Random;

/**
 * Class will just make a tiny database of clients that
 * you can test for different methods needed
 */
public class BankTester {

    public static final String SPACER = "\n---------------------------------------------------------------------------------\n";

    public static Bank database;

    @Test
    public void testThatTheBankHasClients() {
        assert (10 == database.getNumberOfClients());
    }

    /**
     * Methods which generates a fake list of accounts
     */
    public static ArrayList<Account> createAccounts() {
        ArrayList<Account> fakeAccounts = new ArrayList<>();
        fakeAccounts.add(new Account("Checking", 235423));
        fakeAccounts.add(new Account("Savings", 123564));
        fakeAccounts.add(new Account("Pin Money", 994322));
        return fakeAccounts;
    }


    /**
     * Create a mini database of clients for the Bank
     *
     * @return bankDatabase
     */
    @BeforeAll
    public static void createBankTester() {
        Random rng = new Random();
        Bank bankDatabase = new Bank();
        int accountID = 1000;

        bankDatabase.addClient(new Client("Ari",
                "Camhi",
                accountID++, createAccounts()));

        bankDatabase.addClient(new Client("Steven",
                "Camhi",
                accountID++, createAccounts()));

        bankDatabase.addClient(new Client("Alissa",
                "Camhi",
                accountID++, createAccounts()));

        bankDatabase.addClient(new Client("Olivia",
                "Camhi",
                accountID++, createAccounts()));

        bankDatabase.addClient(new Client("Michael",
                "Jordan",
                accountID++, createAccounts()));

        bankDatabase.addClient(new Client("John",
                "John",
                accountID++, createAccounts()));

        bankDatabase.addClient(new Client("Jeff",
                "Jeff",
                accountID++, createAccounts()));

        bankDatabase.addClient(new Client("Jason",
                "Williams",
                accountID++, createAccounts()));

        bankDatabase.addClient(new Client("Danny",
                "Duncan",
                accountID++, createAccounts()));

        bankDatabase.addClient(new Client("Larry",
                "David",
                accountID++, createAccounts()));

        database = bankDatabase;
    }
}
