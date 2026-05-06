// Item.java
import java.util.*;

public class Item {

	public static void main(String[] args) {
		Item item = new Item("milk",4,2);
		System.out.println("total price of " + item + " is " + item.price());
		System.out.println(item);
		item.increaseQuantity();
		System.out.println(item);
	}

	private String product;
	private int qty;
	private int unitPrice;

	public Item(String product, int qty, int unitPrice){
		this.product = product;
		this.qty = qty;
		this.unitPrice = unitPrice;
	}

	public void increaseQuantity (){
		this.qty++;
	}

	public int price(){
		return this.qty * this.unitPrice;
	}

	@Override
	public String toString(){
		return this.product + " : " + this.qty;
	}
}