package recordprograms;

class Employee {
    String name;
    int id;
    String designation;
    double salary;
    String promotionStatus;

    // Constructor 1: No arguments
    Employee() {
        name = "Unknown";
        id = 0;
        designation = "Not Assigned";
        salary = 0.0;
        promotionStatus = "Not Eligible";
    }

    // Constructor 2: Name and ID
    Employee(String name, int id) {
        this.name = name;
        this.id = id;
        designation = "Employee";
        salary = 20000;
        promotionStatus = "Pending";
    }

    // Constructor 3: Name, ID and Designation
    Employee(String name, int id, String designation) {
        this.name = name;
        this.id = id;
        this.designation = designation;
        salary = 30000;
        promotionStatus = "Pending";
    }

    // Constructor 4: All parameters
    Employee(String name, int id, String designation, double salary, String promotionStatus) {
        this.name = name;
        this.id = id;
        this.designation = designation;
        this.salary = salary;
        this.promotionStatus = promotionStatus;
    }

    // Method to display employee details
    void display() {
        System.out.println("Name             : " + name);
        System.out.println("ID               : " + id);
        System.out.println("Designation      : " + designation);
        System.out.println("Salary           : Rs." + salary);
        System.out.println("Promotion Status : " + promotionStatus);
        System.out.println();
    }
}

// Main class
public class EmployeeDemo {
    public static void main(String[] args) {
        // Object using default constructor
        Employee e1 = new Employee();

        // Object using constructor with 2 parameters
        Employee e2 = new Employee("Arun", 101);

        // Object using constructor with 3 parameters
        Employee e3 = new Employee("Priya", 102, "Manager");

        // Object using constructor with 5 parameters
        Employee e4 = new Employee("Rahul", 103, "Senior Manager", 75000, "Promoted");

        System.out.println("===== EMPLOYEE DETAILS =====");
        e1.display();
        e2.display();
        e3.display();
        e4.display();
    }
}
