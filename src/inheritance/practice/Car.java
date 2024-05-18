package inheritance.practice;

public class Car {

	Engine engine;
	
	/*
	 * Car() { 
	 * //tightly coupled - composition //
	 * engine = new Engine();
	 *  }
	 */

	Car(Engine engine){
		this.engine = engine;
	}
	
	public void startCar() {
		System.out.println("Starting car");
		engine.startEngine();
	}

}
