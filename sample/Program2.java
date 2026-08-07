package sample;
class example{
	int x=3,y=8;
	int z=x+y;

	void addition() {
		System.out.println("the addition is:"+z);
	}
}
public class Program2 {

	public static void main(String[]args) {
		int x=3,y=8;
		int a=x-y;
		
		System.out.println("the substruction is:"+ a);
		
		example e = new example();
		e.addition();
		}
	}
	

