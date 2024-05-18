package chaining;

public class SuperDemo {

	int var1;
	String name;
	
	SuperDemo(){}
	
	SuperDemo(int var1, String name){
		this.var1=var1;
		this.name=name;
	}
	
	public static void main(String[] args) {
		Superclass.display();
		Subclass.display();
	}
	
	
	
	
}
