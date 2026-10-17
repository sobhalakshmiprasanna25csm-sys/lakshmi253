
interface PaymentService {
    void pay(String receiverUPI, double amount)
            throws InvalidUPIException, InvalidAmountException,
                   InsufficientBalanceException;

    void checkBalance();
}

// Custom exception for insufficient balance
class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String message) {
        super(message);
    }
}

// Custom exception for invalid UPI ID
class InvalidUPIException extends Exception {
    public InvalidUPIException(String message) {
        super(message);
    }
}

// Custom exception for invalid amount
class InvalidAmountException extends Exception {
    public InvalidAmountException(String message) {
        super(message);
    }
}

// Wallet class
class Wallet {
    private String userName;
    private String mobileNumber;
    private String upiId;
    private double balance;

    // Constructor
    public Wallet(String userName, String mobileNumber,
                  String upiId, double balance) {
        this.userName = userName;
        this.mobileNumber = mobileNumber;
        this.upiId = upiId;
        this.balance = balance;
    }

    // Add money to wallet
    public void addMoney(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Money added: Rs." + amount);
        } else {
            System.out.println("Cannot add zero or negative amount.");
        }
    }

    // Get balance
    public double getBalance() {
        return balance;
    }

    // Deduct money
    public void deductMoney(double amount) {
        balance -= amount;
    }

    // Display wallet details
    public void displayWalletDetails() {
        System.out.println("User Name : " + userName);
        System.out.println("Mobile Number : " + mobileNumber);
        System.out.println("UPI ID : " + upiId);
        System.out.printf("Balance : Rs.%.2f%n", balance);
    }
}

// UPI Payment class
class UPIPayment implements PaymentService {
    private Wallet wallet;

    // Constructor
    public UPIPayment(Wallet wallet) {
        this.wallet = wallet;
    }

    // Make UPI payment
    @Override
    public void pay(String receiverUPI, double amount)
            throws InvalidUPIException, InvalidAmountException,
                   InsufficientBalanceException {

        // Validate UPI ID
        if (receiverUPI == null || !receiverUPI.contains("@")
                || receiverUPI.startsWith("@")
                || receiverUPI.endsWith("@")) {
            throw new InvalidUPIException("Invalid UPI ID.");
        }

        // Validate amount
        if (amount <= 0) {
            throw new InvalidAmountException(
                    "Amount must be greater than zero.");
        }

        // Check balance
        if (amount > wallet.getBalance()) {
            throw new InsufficientBalanceException(
                    "Insufficient wallet balance.");
        }

        // Deduct amount
        wallet.deductMoney(amount);

        System.out.println("Payment successful!");
        System.out.println("Paid Rs." + amount + " to " + receiverUPI);
    }

    // Check balance
    @Override
    public void checkBalance() {
        System.out.printf("Available Balance: Rs.%.2f%n",
                wallet.getBalance());
    }
}

// Main class
public class DigitalWalletSystem {
    public static void main(String[] args) {

        // Create wallet
        Wallet wallet = new Wallet(
                "Prasanna",
                "9876543210",
                "prasanna@upi",
                1000
        );

        // Create payment object
        UPIPayment payment = new UPIPayment(wallet);

        System.out.println("===== WALLET DETAILS =====");
        wallet.displayWalletDetails();

        System.out.println("\n===== ADD MONEY =====");
        wallet.addMoney(500);

        System.out.println("\n===== CHECK BALANCE =====");
        payment.checkBalance();

        System.out.println("\n===== UPI PAYMENT =====");

        try {
            payment.pay("ravi@upi", 300);
        } catch (InvalidUPIException | InvalidAmountException |
                 InsufficientBalanceException e) {
            System.out.println("Transaction failed: " + e.getMessage());
        } finally {
            System.out.println("Transaction process completed.");
        }

        System.out.println("\n===== INVALID PAYMENT TEST =====");

        try {
            payment.pay("invalidupi", 2000);
        } catch (InvalidUPIException | InvalidAmountException |
                 InsufficientBalanceException e) {
            System.out.println("Transaction failed: " + e.getMessage());
        } finally {
            System.out.println("Transaction process completed.");
        }

        System.out.println("\n===== FINAL WALLET DETAILS =====");
        wallet.displayWalletDetails();
        payment.checkBalance();
    }
}
