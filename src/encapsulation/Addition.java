package encapsulation;

public class Addition {
	
	public void sum() {
		int a=10;
		int b =20;
		System.out.println(a+b);
	}
	
	//overload sum method
	public void sum(int num1, int num2) {
		System.out.println(num1 + num2 );
	}
	
	
	public void sum(int num1, int num2, int num3) {
		System.out.println(num1 + num2+ num3 );
	}
	
	public void sum(int num1, int num2, String name) {
		System.out.println(num1 + num2+ name );
	}
	

}
