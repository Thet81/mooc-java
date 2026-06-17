// SongListV1.java
import java.util.*;
public class SongListV1{
	public static void main(String[] args) {
		SongListV1 songlist = new SongListV1();
		songlist.go();
	}
	public void go(){
		List<String> songList = MockSongs.getSongStrings();
		System.out.println(songList);
	}
}