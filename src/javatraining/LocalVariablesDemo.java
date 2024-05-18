package javatraining;

public class LocalVariablesDemo {

	int a; // instance var
	static int b; // static var

	public static void main(String[] args) {
 
		//Local variable
		int myInt;
		myInt=20;
		
		LocalVariablesDemo lvd = new LocalVariablesDemo();
		System.out.println(lvd.a);
		
		System.out.println(myInt);
		
	}

	public void doSomething() {
		
	//	System.out.println(myInt);
	
	}

}
