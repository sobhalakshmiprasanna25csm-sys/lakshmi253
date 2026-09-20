interface Sports {
    void play();
}

interface Music {
    void listen();
}

class Student implements Sports, Music {

    public void play() {
        System.out.println("Student is playing");
    }

    public void listen() {
        System.out.println("Student is listening to music");
    }
}

public class MultipleInterfaceDemo {
    public static void main(String[] args) {

        Student s = new Student();

        s.play();
        s.listen();
    }
}
