package javacore;

class A {
	void displayA() {
		System.out.println("This is class A");
	}
}

interface B {
	void displayB();
}

class C extends A implements B {

	public void displayB() {
		System.out.println("This is interface B");
	}

	void displayC() {
		System.out.println("This is class C");
	}
}

public class HybridExample extends C {

	void displayD() {
		System.out.println("This is class D");
	}

	public static void main(String[] args) {

		// object
		HybridExample obj = new HybridExample();

		obj.displayA();
		obj.displayB();
		obj.displayC();
		obj.displayD();
	}
}
