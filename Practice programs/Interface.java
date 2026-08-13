package javacore;

interface TestInterface {
	void sample();
	void example();
}

public class InterfaceExample implements TestInterface {

	public void sample() {
		System.out.println("This is a test method");
	}

	public void example() {
		System.out.println("This is another test method");
	}

	public static void main(String[] args) {

		// object
		InterfaceExample obj = new InterfaceExample();

		obj.sample();
		obj.example();
	}
}
