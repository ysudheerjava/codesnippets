package abstraction.interfaces.multipleinterfaces;

public class Thar implements Car, MediaPlayer {

	public void steer(String direction) {
		System.out.println("Changing the direction to "+direction);
	}

	public void accelerate(int speed) {
		System.out.println("Accelerating to "+ speed);
	}

	public void stop() {
		System.out.println("ABS is implemented");
	}

	@Override
	public void pause() {
		System.out.println("Mediaplayer pausing");

	}

	@Override
	public void play() {
		System.out.println("Started MEdiaplayer");

	}

	@Override
	public void off() {
		System.out.println("MEdiaplayer turned off");

	}

}
