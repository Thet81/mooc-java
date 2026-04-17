// Product.java

class Product {
	private double price;
	private int quantity;
	private String name;

	public Product (double productPrice, int productQuantity, String productName) {
		this.price = productPrice;
		this.quantity = productQuantity;
		this.name = productName;
	}

	public void printProduct () {
		System.out.println(this.name + ", " + this.price + ", " + this.quantity + "pcs");
	}
}