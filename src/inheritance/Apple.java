package inheritance;

public class Apple extends Fruit {
	
	String appleType;
	
	
	  Apple(String name, String color, String appleType){ 
		  //super();
	  this.appleType=appleType; 
	  this.color=color; this.name=name;
	  
	  }
	 
	
	
	//Apple(){}
	
	
	public static void main(String[] args) {
		//Apple apple = new Apple();
	}
	
	
	
	

	@Override
	public String toString() {
		return "Apple [appleType=" + appleType + ","
				+ " name=" + name + ","
						+ " color=" + color + "]";
	}
	
	
	
	
	
	

}
