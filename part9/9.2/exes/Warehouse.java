// Warehouse.java

import java.util.*;

public class Warehouse {

	public static void main(String[] args) {
		Warehouse warehouse = new Warehouse();
		warehouse.addProduct("milk",3,10);
		warehouse.addProduct("coffee",5,7);
		System.out.println("Prices : ");
		// System.out.println(warehouse.price("milk"));
		warehouse.price("milk");
		warehouse.price("coffee");
		warehouse.price("sugar");
		System.out.println(warehouse.take("coffee"));
		System.out.println(warehouse.take("sugar"));
		System.out.println("stock : ");
		System.out.println("coffee : " + warehouse.stock("coffee"));
		System.out.println("sugar : " + warehouse.stock("sugar"));
		System.out.println("products : ");
		for(String product : warehouse.products()){
			System.out.println(product);
		}
	}

	private Map<String,Integer> products;
	private Map<String,Integer> balances;

	public Warehouse(){
		this.products = new HashMap<>();
		this.balances = new HashMap<>();
	}

	public void addProduct(String product, int price, int stock){
		this.products.put(product,price);
		this.balances.put(product,stock);
	}
	/*
		Returns the current remaining stock of the product in the warehouse
		If the product hasn't been added to the warehouse, the method must return 0

	*/
	public int stock(String product){
		if(this.balances.containsKey(product)){
			return this.balances.get(product);
		}
		return 0;
	}

	/*	
		Reduces the stock remaining for the product it received as a parameter by one, and returns true if there was stock
		remaining.
		If the product was not available in the warehouse the method returns false.
		A product's stock can't go below zero.
	*/

	public boolean take(String product){
		if(this.balances.containsKey(product)){
			int stockBalance = this.balances.get(product);
			this.balances.put(product,stockBalance -1);
			return true;
		}
		return false;
	}

	public Set<String> products (){
		return this.products.keySet();
	}

	public int price(String product){
		if(!(this.products.containsKey(product))){
			return -99;
		}
		return this.products.get(product);
	}
}