interface StudentData {
}

class Student implements StudentData {

    void display() {
        System.out.println("Student data is available");
    }
}

public class MarkerInterfaceDemo {
    public static void main(String[] args) {

        Student s = new Student();

        s.display();
    }
}
