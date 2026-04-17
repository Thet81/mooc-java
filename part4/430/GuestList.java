// GuestList.java
import java.util.*;
import java.nio.file.Paths;

class GuestList {
	public static void main(String[] args) {
		ArrayList<String> guests = new ArrayList<>();
		try (Scanner fileScanner = new Scanner(Paths.get("guests.txt"))){
			while(fileScanner.hasNextLine()){
				guests.add(fileScanner.nextLine());
			}
		}catch (Exception e) {
			System.out.println(e);
		}
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a name to search in a list");
		String gustName = scanner.nextLine();

		int index = 0;
		boolean found = false;

		// while(guests.size() > 0) {
		// 	if (gustName.equals(guests.get(index))){
		// 		System.out.println("The name is on the list");
		// 		found = true;
		// 		break;
		// 	}
		// 	index ++;
		// }

		for(String guest : guests) {
			if (guest.equals(gustName)){
				found = true;
				System.out.println("The name is on the list");
			}
		}

		if (found == false){
			System.out.println("The name is not on the list");
		}
	}
}