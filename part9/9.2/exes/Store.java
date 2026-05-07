// Store.java

import java.util.*;

public class Store {
	
	public static void main(String[] args) {
		Warehouse warehouse = new Warehouse();
	    warehouse.addProduct("coffee", 5, 10);
	    warehouse.addProduct("milk", 3, 20);
	    warehouse.addProduct("cream", 2, 55);
	    warehouse.addProduct("bread", 7, 8);

	    Scanner scanner = new Scanner(System.in);

	    Store store = new Store(warehouse, scanner);
	    store.shop("John");
	}
	private Warehouse warehouse;
	private Scanner scanner;

	public Store (Warehouse warehouse, Scanner scanner){
		this.warehouse = warehouse;
		this.scanner = scanner;
	}

	public void shop(String customer){
		ShoppingCart cart = new ShoppingCart();
		System.out.println("Welcome to the store " +customer);
		System.out.println("Our selections : ");

		for(String product : this.warehouse.products()){
			System.out.println(product);
		}

		while(true){
			System.out.println("What to put in the cart (Press enter to go to the register)");
			String product = scanner.nextLine();
			if (product.isEmpty()){
				break;
			}

			// Add the product to the cart
			if(this.warehouse.take(product)){
				int price = this.warehouse.price(product);
				cart.add(product,price);
			}
		}

		System.out.println("your shoppingcart contents:");
        cart.print();
        System.out.println("total: " + cart.price());
	}
}