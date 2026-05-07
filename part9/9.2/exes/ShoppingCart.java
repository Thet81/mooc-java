// ShoppingCart.java
import java.util.*;

public class ShoppingCart{
	public static void main(String[] args) {
		ShoppingCart cart = new ShoppingCart();
		cart.add("milk",3);
		cart.add("buttermilk",2);
		cart.add("cheese",5);
		System.out.println("cart price" + cart.price());
		cart.add("computer",899);
		cart.add("milk",3);
		System.out.println("cart price"+ cart.price());
		cart.print();
	}
	private Map<String,Item> items;

	public ShoppingCart(){
		this.items = new HashMap<>();
	}

	public void add(String product, int price){
		if(!(this.items.containsKey(product))){
			this.items.put(product,new Item(product,1,price));
		}else {
			Item item = this.items.get(product);
			item.increaseQuantity();
		}
	}

	public int price(){
		int total = 0;
		for (Item item : this.items.values()){
			total += item.price();
		}
		return total;
	}

	public void print(){
		for(Item item : this.items.values()){
			System.out.println(item);
		}
	}
}