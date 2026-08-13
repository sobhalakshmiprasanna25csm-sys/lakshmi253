package javacore;

class A {
	void displayA() {
		System.out.println("This is class A");
	}
}

class B extends A {
	void displayB() {
		System.out.println("This is class B");
	}
}

public class C extends A {

	void displayC() {
		System.out.println("This is class C");
	}

	public static void main(String[] args) {

		C obj = new C();

		obj.displayA();
		obj.displayC();
	}
}
