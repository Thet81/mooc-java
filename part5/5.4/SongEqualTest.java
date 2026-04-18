// SongEqualTest.java

class SongEqualTest {
	public static void main(String[] args) {
		Song jackSparrow = new Song("The Lonely Island","Jack Sparrow",196);
		Song anotherSparrow = new Song("The Lonely Island","Jack Sparrow",196);

		if(jackSparrow.equals(anotherSparrow)){
			System.out.println("Songs are equal.");
		}
	}
}