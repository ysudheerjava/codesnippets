package inheritance.relationships.aggregation;

public class Main {
	
	public static void main(String[] args) {
		
		Engine engine = new Engine();	
		Car car = new Car(engine);
		car=null;
		engine.start();
			
	
	}

}
