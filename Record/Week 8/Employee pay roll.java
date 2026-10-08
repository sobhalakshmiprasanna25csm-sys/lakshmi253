package recordprograms;

import java.util.Scanner;

interface Payroll {
    void displaySalaryDetails();
}

class RegularEmployee implements Payroll {

    String employeeId;
    double basicPay = 25000;
    double hra = 15000;
    double ta = 5000;

    RegularEmployee(String employeeId) {
        this.employeeId = employeeId;
    }

    @Override
    public void displaySalaryDetails() {

        double total = basicPay + hra + ta;

        System.out.println("Salary Details:");
        System.out.println("Employee Id: " + employeeId);
        System.out.println("Basic Pay: " + basicPay);
        System.out.println("HRA: " + hra);
        System.out.println("T.A: " + ta);
        System.out.println("Total Amount: " + total);
    }
}

class ContractEmployee implements Payroll {

    String employeeId;
    double basicPay = 12000;
    double hra = 0;
    double ta = 3000;

    ContractEmployee(String employeeId) {
        this.employeeId = employeeId;
    }

    @Override
    public void displaySalaryDetails() {

        double total = basicPay + hra + ta;

        System.out.println("Salary Details:");
        System.out.println("Employee Id: " + employeeId);
        System.out.println("Basic Pay: " + basicPay);
        System.out.println("HRA: " + hra);
        System.out.println("T.A: " + ta);
        System.out.println("Total Amount: " + total);
    }
}

public class EmployeePayroll {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Employee Id: ");
        String employeeId = sc.nextLine().trim().toUpperCase();

        Payroll employee;

        if (employeeId.startsWith("R")) {
            employee = new RegularEmployee(employeeId);
        }
        else if (employeeId.startsWith("C")) {
            employee = new ContractEmployee(employeeId);
        }
        else {
            System.out.println("Invalid Employee Id.");
            sc.close();
            return;
        }

        employee.displaySalaryDetails();

        sc.close();
    }
}
