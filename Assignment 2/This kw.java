class Student {
    int age;

    Student(int age) {
        this.age = age;
    }

    void display() {
        System.out.println(age);
    }
}

public class Main {
    public static void main(String[] args) {
        Student s = new Student(20);
        s.display();
    }
}
