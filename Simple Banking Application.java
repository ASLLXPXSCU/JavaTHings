import java.util.ArrayList;
import java.util.List;

public class Bank {

    // List to store the accounts in the bank
    private List<Account> accounts;

    public Bank() {
        accounts = new ArrayList<>();
    }

    // Method to add an account to the bank
    public void addAccount(Account account) {
        accounts.add(account);
    }

    // Method to get an account from the bank
    public Account getAccount(int accountNumber) {
        for (Account account : accounts) {
            if (account.getAccountNumber() == accountNumber) {
                return account;
            }
        }
        return null;
    }

    // Method to deposit an amount to an account
    public void deposit(int accountNumber, double amount) {
        Account account = getAccount(accountNumber);
        if (account != null) {
            account.deposit(amount);
        } else {
            System.out.println("Invalid account number");
        }
    }

    // Method to
