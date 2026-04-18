// Apartement.java

public class Apartment {
	private int rooms;
	private int squares;
	private int pricePerSquare;

	public Apartment(int rooms, int squares, int pricePerSquare){
		this.rooms = rooms;
		this.squares = squares;
		this.pricePerSquare = pricePerSquare;
	}

	public boolean largerThan(Apartment compared) {
		if (this.squares > compared.squares){
			return true;
		}
		return false;
	}

	public boolean moreExpensiveThan(Apartment compared){
		int ownPrice = this.pricePerSquare * squares;
		int comparedPrice = compared.pricePerSquare * squares;

		if (ownPrice > comparedPrice){
			return true;
		}

		return false;
	}

	public int priceDifference(Apartment compared){
		return (this.squares * this.pricePerSquare) - (compared.squares * compared.pricePerSquare);
	}
}