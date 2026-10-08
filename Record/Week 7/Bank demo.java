package recordprograms;

import java.util.Scanner;

class Customer {
    String name;
    String mobileNumber;

    Customer(String name, String mobileNumber) {
        this.name = name;
        this.mobileNumber = mobileNumber;
    }

    void displayCustomer() {
        System.out.println("Customer Name  : " + name);
        System.out.println("Mobile Number  : " + mobileNumber);
    }
}

class Account {
    String accountNumber;
    double balance;

    Account(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    void displayAccount() {
        System.out.println("Account Number : " + accountNumber);
        System.out.println("Balance        : Rs." + balance);
    }
}

// RBI Base Class
class RBI {
    protected double minimumInterestRate = 4.0;

    public double getRateOfInterest() {
        return minimumInterestRate;
    }
}

// SBI Derived Class
class SBI extends RBI {
    @Override
    public double getRateOfInterest() {
        return 7.0;
    }
}

// ICICI Derived Class
class ICICI extends RBI {
    @Override
    public double getRateOfInterest() {
        return 7.5;
    }
}

// PNB Derived Class
class PNB extends RBI {
    @Override
    public double getRateOfInterest() {
        return 6.5;
    }
}

public class BankDemo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print(
            "Enter the Bank name to find the rate of Interest : "
        );

        String bankName = sc.nextLine().trim().toUpperCase();

        RBI bank;

        if (bankName.equals("RBI")) {
            bank = new RBI();
        }
        else if (bankName.equals("SBI")) {
            bank = new SBI();
        }
        else if (bankName.equals("ICICI")) {
            bank = new ICICI();
        }
        else if (bankName.equals("PNB")) {
            bank = new PNB();
        }
        else {
            System.out.println("Invalid Bank Name.");
            sc.close();
            return;
        }

        System.out.println(
            "RBI rate of interest is : "
            + bank.getRateOfInterest() + "%"
        );

        sc.close();
    }
}
