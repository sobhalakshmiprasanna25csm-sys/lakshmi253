package javacore;

abstract class TestAbstract {

	int a = 120;

	abstract void sample();

	void example() {
		System.out.println("This is another test method");
	}
}

public class AbstractExample extends TestAbstract {

	void sample() {
		System.out.println("This is a test method");
	}

	public static void main(String[] args) {

		// object
		AbstractExample obj = new AbstractExample();

		System.out.println("variable: " + obj.a);

		obj.sample();
		obj.example();
	}
}
