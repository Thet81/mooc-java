// FeedInput.java

import java.util.*;

class FeedInput {
	public static void main(String[] args) {
		String input = "one\n" + "two\n" + 
						"three\n" + "four\n" +
						"five\n" + "one\n" + 
						"six\n";

		Scanner reader = new Scanner(input);

		ArrayList<String> read = new ArrayList<>();

		while(true){
			System.out.println("Enter an input : ");
			String line = reader.nextLine();

			if(read.contains(line)){
				break;
			}

			read.add(line);
		}
	}
}