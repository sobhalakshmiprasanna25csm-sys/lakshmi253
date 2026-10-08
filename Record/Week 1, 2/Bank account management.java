package recordprograms;

import java.util.Scanner;

abstract class Account {

    private String accountNumber;
    private double balance;
    private String accountType;

    public Account(String accountNumber, double balance, String accountType) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.accountType = accountType;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public String getAccountType() {
        return accountType;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: Rs." + amount);
            System.out.println("New Balance: Rs." + balance);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    protected void deductBalance(double amount) {
        balance -= amount;
    }

    protected void addBalance(double amount) {
        balance += amount;
    }

    public abstract void withdraw(double amount);

    public abstract void calculateInterest();

    public void transfer(Account receiver, double amount) {

        if (amount <= 0) {
            System.out.println("Invalid transfer amount.");
            return;
        }

        if (this.getBalance() >= amount) {
            this.deductBalance(amount);
            receiver.addBalance(amount);

            System.out.println("Transfer Successful!");
            System.out.println("Transferred Rs." + amount +
                    " from " + this.accountNumber +
                    " to " + receiver.getAccountNumber());
        } else {
            System.out.println("Insufficient balance for transfer.");
        }
    }

    public void displayAccountDetails() {
        System.out.println("\nAccount Number : " + accountNumber);
        System.out.println("Account Type   : " + accountType);
        System.out.println("Balance        : Rs." + balance);
    }
}

class SavingsAccount extends Account {

    private double interestRate;

    public SavingsAccount(String accountNumber,
                          double balance,
                          double interestRate) {

        super(accountNumber, balance, "Savings Account");
        this.interestRate = interestRate;
    }

    @Override
    public void withdraw(double amount) {

        if (amount > 0 && amount <= getBalance()) {
            deductBalance(amount);

            System.out.println("Withdrawal Successful!");
            System.out.println("Withdrawn: Rs." + amount);
            System.out.println("Remaining Balance: Rs." + getBalance());

        } else {
            System.out.println("Insufficient balance or invalid amount.");
        }
    }

    @Override
    public void calculateInterest() {

        double interest = getBalance() * interestRate / 100;

        System.out.println("Interest Rate: " + interestRate + "%");
        System.out.println("Interest Earned: Rs." + interest);

        addBalance(interest);

        System.out.println("Balance after interest: Rs." + getBalance());
    }
}

class CurrentAccount extends Account {

    private double overdraftLimit;

    public CurrentAccount(String accountNumber,
                          double balance,
                          double overdraftLimit) {

        super(accountNumber, balance, "Current Account");
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public void withdraw(double amount) {

        if (amount > 0 &&
            amount <= getBalance() + overdraftLimit) {

            deductBalance(amount);

            System.out.println("Withdrawal Successful!");
            System.out.println("Withdrawn: Rs." + amount);
            System.out.println("Remaining Balance: Rs." + getBalance());

        } else {
            System.out.println("Withdrawal exceeds overdraft limit.");
        }
    }

    @Override
    public void calculateInterest() {
        System.out.println("Current Account does not earn interest.");
    }

    public double getOverdraftLimit() {
        return overdraftLimit;
    }
}

public class BankAccountManagement {

    public static void main(String[] args) {

        SavingsAccount savings =
                new SavingsAccount("SA1001", 10000, 5);

        CurrentAccount current =
                new CurrentAccount("CA2001", 20000, 5000);

        System.out.println("===== ACCOUNT DETAILS =====");

        savings.displayAccountDetails();
        current.displayAccountDetails();

        System.out.println("\n===== DEPOSIT =====");

        savings.deposit(5000);
        current.deposit(3000);

        System.out.println("\n===== WITHDRAWAL =====");

        savings.withdraw(2000);
        current.withdraw(25000);

        System.out.println("\n===== INTEREST =====");

        savings.calculateInterest();
        current.calculateInterest();

        System.out.println("\n===== TRANSFER =====");

        savings.transfer(current, 3000);

        System.out.println("\n===== POLYMORPHISM & DYNAMIC BINDING =====");

        Account account1 = new SavingsAccount(
                "SA3001", 15000, 4);

        Account account2 = new CurrentAccount(
                "CA4001", 25000, 10000);

        account1.withdraw(2000);
        account2.withdraw(30000);

        account1.calculateInterest();
        account2.calculateInterest();

        System.out.println("\n===== FINAL ACCOUNT DETAILS =====");

        savings.displayAccountDetails();
        current.displayAccountDetails();
    }
}
