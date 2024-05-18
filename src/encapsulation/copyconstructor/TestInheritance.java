package encapsulation.copyconstructor;

public class TestInheritance {

	public static void main(String[] args) {
     
		Apple apple = new Apple();
		
		//using parent class properties
		apple.setName("Green apple");
		apple.setColor("Green");
		
		//property of Apple 
		apple.setAppleType("Swiss Apple");
		
		System.out.println(apple);
		
		
		
	}

}
