class Student {
    public String name = "Prasanna";

    public void display() {
        System.out.println("Name: " + name);
    }
}

public class PublicDemo {
    public static void main(String[] args) {
        Student s = new Student();

        // Public members can be accessed from another class
        System.out.println("Name: " + s.name);
        s.display();
    }
}
