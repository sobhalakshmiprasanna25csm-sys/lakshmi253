package javacore;

interface A {
	void displayA();
}

interface B {
	void displayB();
}

public class C implements A, B {

	public void displayA() {
		System.out.println("This is interface A");
	}

	public void displayB() {
		System.out.println("This is interface B");
	}

	public static void main(String[] args) {

		C obj = new C();

		obj.displayA();
		obj.displayB();
	}
}
