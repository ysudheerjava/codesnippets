package abstraction.interfaces;

public class SpotifyPlayer implements AudioPlayer {
	
	public void play() {
		System.out.println("Playing Spotify music");
	}
	
	public void pause() {
		System.out.println("Pausing Spotify music");
	}
	
	public void stop() {
		System.out.println("Stopping Spotify music");
	}

}
