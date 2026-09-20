class Student {
    protected String course = "AIML";
}

class CollegeStudent extends Student {
    void display() {
        // Protected member can be accessed in child class
        System.out.println("Course: " + course);
    }
}

public class ProtectedDemo {
    public static void main(String[] args) {
        CollegeStudent s = new CollegeStudent();
        s.display();
    }
}
