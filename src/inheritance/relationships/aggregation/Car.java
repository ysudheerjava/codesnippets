package inheritance.relationships.aggregation;

//Car has a Engine
public class Car {

	private Engine engine; // Car has an engine

	Car() {

		engine = new Engine();

	}

	Car(Engine engine) {

		this.engine = engine ;

	}

	
	
	
	
	
	
	public void start() {
		engine.start();
	}

}
