package inheritance.relationships.composition;

public class Main {
	
	public static void main(String[] args) {
		Car car = new Car();
		car.start();
		car = null;
		//System.out.println(car);
		
		car.engine.start();
		//System.out.println(car.engine.start());
		
	
	}

}
