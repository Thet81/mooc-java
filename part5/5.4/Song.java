// Song.java

public class Song {
	private String title;
	private String artist;
	private int duration;

	public Song(String title,String artist, int duration){
		this.title = title;
		this.artist = artist;
		this.duration = duration;
	}

	public boolean equals(Song compared) {
		if (this == compared){
			return true;
		}

		if(!(compared instanceof Song)){
			return false;
		}

		Song comparedSong = (Song) compared;
		if (this.title.equals(comparedSong.title) &&
			this.duration == comparedSong.duration &&
			this.artist.equals(comparedSong.artist)
		   ){
			return true;
		}

		return false;
	}
}