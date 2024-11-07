package Bank;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BankAccount {
    private String accountNumber;
    private double balance;
    private List<Transaction> transactionHistory ;


    //Constructors
    public BankAccount (String accountNumber) {
        this.accountNumber = accountNumber;
        this.balance = 0;
        this.transactionHistory = new ArrayList<>();

    }

    //Getters

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public List<Transaction> getTransactionHistory() {
        return transactionHistory;
    }


    //Setters

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setTransactionHistory(List<Transaction> transactionHistory) {
        this.transactionHistory = transactionHistory;
    }


    //implement methods for deposit, withdrawal, and displaying the transaction history.

    public void deposit(double amount) {

        if (amount > 0) {
            Transaction transaction = new Transaction(new Date(),"deposit",amount);
            this.balance += amount;

            transactionHistory.add(transaction);
        }

    }

    public void withdrawal(double amount) {

        Transaction transaction = new Transaction(new Date(),"withdrawal",amount);

        if( balance > 0){
            this.balance -= amount;
        }

        transactionHistory.add(transaction);

    }

    public void displayTransactionHistory () {

        for (Transaction transaction : transactionHistory) {
            System.out.println(transaction);
        }

    }




} //end of class

