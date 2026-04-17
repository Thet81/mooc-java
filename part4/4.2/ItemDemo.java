// ItemDemo.java
import java.util.*;

class ItemDemo {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<Item> items = new ArrayList<>();

		while(true) {
			String itemName = scanner.nextLine();
			if (itemName.isEmpty()){
				break;
			}
			items.add(new Item(itemName));
		}

		for(Item item : items) {
			System.out.println(item);
		}
	}
}