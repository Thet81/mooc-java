// Archive.java
import java.util.*;

class Archive {
	public static void main(String[] args) {
		ArrayList<Item> archiveList = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);

		while(true) {
			System.out.println("Enter identifier (Empty will stop)");
			String identifier = scanner.nextLine();
			if(identifier.isEmpty()){
				break;
			}
			System.out.println("Name?");
			String name = scanner.nextLine();
			Item newItem = new Item(identifier,name);
			
			if(!(archiveList.contains(newItem))){
				archiveList.add(newItem);
			}
		}

		System.out.println("==Items==");

		for(Item item : archiveList){
			System.out.println(item);
		}
	}
}