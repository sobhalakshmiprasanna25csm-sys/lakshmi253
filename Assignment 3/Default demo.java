class Student {
    // No access modifier means default
    String department = "CSE";

    void display() {
        System.out.println("Department: " + department);
    }
}

public class DefaultDemo {
    public static void main(String[] args) {
        Student s = new Student();

        // Default members can be accessed in the same package
        System.out.println("Department: " + s.department);
        s.display();
    }
}
