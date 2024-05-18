package chaining;

public class MyClass extends SuperDemo{
	
	private int number;
	private String name;
	
	//
	MyClass(){
		super(100,"Code");
		
	}
	
	MyClass(int number, String name){
		this.number = number;
		this.name=name;
	}
	
	MyClass(int number){
		this.number = number;
	
	}

	
	public static void main(String[] args) {
		
		MyClass obj1 = new MyClass();
		System.out.println(obj1.name);
		System.out.println(obj1.number);

	}
	
	


}
