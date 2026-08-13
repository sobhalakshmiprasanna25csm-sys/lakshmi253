package javacore;

public class MethodsExample {

	int a = 10;
	int b = 20;

	void add() {
		int c = a + b;
		System.out.println("Addition: " + c);
	}

	void subtract() {
		int c = a - b;
		System.out.println("Subtraction: " + c);
	}

	void multiply() {
		int c = a * b;
		System.out.println("Multiplication: " + c);
	}

	public static void main(String[] args) {

		// object
		MethodsExample obj = new MethodsExample();

		System.out.println("Variable a: " + obj.a);
		System.out.println("Variable b: " + obj.b);

		obj.add();
		obj.subtract();
		obj.multiply();
	}
}
