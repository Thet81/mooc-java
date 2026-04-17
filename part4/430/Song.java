// Song.java
import java.util.*;
import java.nio.file.Paths;

class Song {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter a file name");
		String fileName = input.nextLine();
		try (Scanner scanner = new Scanner(Paths.get(fileName))){
				while(scanner.hasNextLine()){
					String row = scanner.nextLine();
					System.out.println(row);
				}
		}catch(Exception e) {
			System.out.println("Error is " + e);
		}

	}
}