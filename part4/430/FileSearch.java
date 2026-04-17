// FileSearch.java
import java.util.*;
import java.nio.file.Paths;

class FileSearch {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter file name");
		String fileName = input.nextLine();
		ArrayList<String> contents = new ArrayList<>();
		boolean found = false;

		try(Scanner file = new Scanner(Paths.get(fileName))) {
			while(file.hasNextLine()){
				contents.add(file.nextLine());
			}
		}catch (Exception e) {
			System.out.println(e);
		}

		System.out.println("Enter a name to search ");
		String nameToSearch = input.nextLine();

		for(String content : contents ){
			if (content.equals(nameToSearch)){
				System.out.println("The name is on the list");
				found = true;
			}
		}

		if (found == false) {
			System.out.println("The name is not on the list");
		}
	}
}