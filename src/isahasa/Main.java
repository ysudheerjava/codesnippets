package isahasa;
// Aggregation Example
class Car {
    private Engine engine; // Car has an Engine

    public Car(Engine engine) {
        this.engine = engine;
    }

    public void start() {
        engine.start();
        System.out.println("Car has started");
    }
}

class Engine {
    public void start() {
        System.out.println("Engine has started");
    }
}

public class Main {
    public static void main(String[] args) {
        // Aggregation Example
        Engine engine = new Engine();
        Car car = new Car(engine); // Car has an Engine (Aggregation)
        car.start(); // Car starts, invoking Engine's start()
    }
}
