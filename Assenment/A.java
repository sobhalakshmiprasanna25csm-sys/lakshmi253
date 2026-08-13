package javacore;

class A {
	void displayA() {
		System.out.println("This is class A");
	}
}

public class B extends A {

	void displayB() {
		System.out.println("This is class B");
	}

	public static void main(String[] args) {

		B obj = new B();

		obj.displayA();
		obj.displayB();
	}
}
