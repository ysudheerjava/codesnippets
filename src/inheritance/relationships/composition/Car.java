package inheritance.relationships.composition;

//Car has a Engine
public class Car {

	 Engine engine; // Car has an engine

	
	//composition
	Car() {

		engine = new Engine();

	}

	

	public void start() {
		engine.start();
	}

}
