package abstraction.interfaces;

public class Main {

	public static void main(String[] args) {

		AudioPlayer player = new SpotifyPlayer();
		
		
		MP3Player mp3 = new MP3Player();
		mp3.play();
		mp3.pause();
		mp3.stop();
		
		SpotifyPlayer spotify = new SpotifyPlayer();
		spotify.play();
		spotify.pause();
		spotify.stop();
	}

}
