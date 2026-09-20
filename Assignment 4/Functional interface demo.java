@FunctionalInterface
interface Calculator {
    int add(int a, int b);
}

public class FunctionalInterfaceDemo {
    public static void main(String[] args) {

        Calculator c = (a, b) -> a + b;

        System.out.println("Sum = " + c.add(10, 20));
    }
}
