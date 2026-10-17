
class Account {
    protected String accountNumber;
    protected String accountHolderName;
    protected double balance;
    protected String accountType;

    // Constructor to initialize account details
    public Account(String accountNumber, String accountHolderName,
                   double balance, String accountType) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
        this.accountType = accountType;
    }

    // Method to deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: Rs." + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // Method to withdraw money
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: Rs." + amount);
        } else {
            System.out.println("Withdrawal failed: Insufficient balance.");
        }
    }

    // Method to transfer money to another account
    public void transfer(Account receiver, double amount) {
        if (amount > 0 && amount <= balance) {
            this.balance -= amount;
            receiver.balance += amount;

            System.out.println("Transferred Rs." + amount
                    + " to " + receiver.accountNumber);
        } else {
            System.out.println("Transfer failed: Insufficient balance.");
        }
    }

    // Method to display account details
    public void displayAccountDetails() {
        System.out.println("Account Number : " + accountNumber);
        System.out.println("Holder Name    : " + accountHolderName);
        System.out.println("Account Type   : " + accountType);
        System.out.printf("Balance        : Rs.%.2f%n", balance);
    }
}

// SavingsAccount inherits from Account
class SavingsAccount extends Account {
    private double interestRate;

    // Constructor
    public SavingsAccount(String accountNumber, String accountHolderName,
                          double balance, double interestRate) {
        super(accountNumber, accountHolderName, balance, "Savings");
        this.interestRate = interestRate;
    }

    // Method to calculate and add interest
    public void calculateInterest() {
        double interest = balance * interestRate / 100;
        balance += interest;

        System.out.printf("Interest added: Rs.%.2f%n", interest);
    }
}

// CurrentAccount inherits from Account
class CurrentAccount extends Account {
    private double overdraftLimit;

    // Constructor
    public CurrentAccount(String accountNumber, String accountHolderName,
                          double balance, double overdraftLimit) {
        super(accountNumber, accountHolderName, balance, "Current");
        this.overdraftLimit = overdraftLimit;
    }

    // Method overriding
    // Allows withdrawal up to the overdraft limit
    @Override
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance + overdraftLimit) {
            balance -= amount;
            System.out.println("Withdrawn: Rs." + amount);
        } else {
            System.out.println(
                "Withdrawal failed: Overdraft limit exceeded."
            );
        }
    }
}

// Main class
public class BankAccountSystem {
    public static void main(String[] args) {

        // Creating SavingsAccount object
        SavingsAccount savings = new SavingsAccount(
                "SA101", "Prasanna", 10000, 5);

        // Creating CurrentAccount object
        CurrentAccount current = new CurrentAccount(
                "CA202", "Ravi", 5000, 3000);

        System.out.println("===== INITIAL ACCOUNT DETAILS =====");

        savings.displayAccountDetails();
        System.out.println();

        current.displayAccountDetails();

        System.out.println("\n===== TRANSACTIONS =====");

        // Savings account transactions
        savings.deposit(2000);
        savings.withdraw(1500);
        savings.calculateInterest();

        // Current account transactions
        current.deposit(1000);
        current.withdraw(8000);

        // Transfer money from savings to current
        savings.transfer(current, 2000);

        System.out.println("\n===== FINAL ACCOUNT DETAILS =====");

        savings.displayAccountDetails();
        System.out.println();

        current.displayAccountDetails();
    }
}
