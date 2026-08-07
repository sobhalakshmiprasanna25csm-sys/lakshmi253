package inheritance253;

abstract class Base{
	int x;
	
	
	void sayMyName() {
		System.out.println("My Name is SITa");
	}
	abstract void sayMyAge(); 
}

public class Abstract extends Base{
	
	void sayMyAge() {
		System.out.println("Age in sub class is 13");
	}
	
	public static void main(String[]args) {
		Abstract a=new Abstract();
		System.out.println(a.x);
		a.sayMyName();
		a.sayMyAge();
	}
	
	}