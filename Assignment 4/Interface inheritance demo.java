interface Student {
    void study();
}

interface CollegeStudent extends Student {
    void attendClass();
}

class AIMLStudent implements CollegeStudent {

    public void study() {
        System.out.println("Student is studying");
    }

    public void attendClass() {
        System.out.println("Student is attending class");
    }
}

public class InterfaceInheritanceDemo {
    public static void main(String[] args) {

        AIMLStudent s = new AIMLStudent();

        s.study();
        s.attendClass();
    }
}
