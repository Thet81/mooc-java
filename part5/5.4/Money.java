// Money.java

public class Money {
	private final int euros;
	private final int cents;

	public Money (int euros, int cents) {
		this.euros = euros;
		this.cents = cents;
	}

	public int euros () {
		return this.euros;
	}

	public int cents () {
		return this.cents;
	}

	public Money plus(Money addition){
		int newEuro = this.euros + addition.euros;
		int newCent = this.cents  + addition.cents;
		if(newCent >= 100){
			newEuro++;
			newCent = 0;
		}
		return new Money(newEuro,newCent);
	}

	public boolean lessThan(Money compared){
		if(this.euros < compared.euros){
			return true;
		}

		if(this.euros > compared.euros){
			return false;
		}

		if(this.cents < compared.cents){
			return true;
		}

		if(this.cents > compared.cents){
			return false;
		}

		return false;
	}

	public Money minus (Money decreaser){
		int newEuro = this.euros - decreaser.euros;
		int newCents = this.cents - decreaser.cents;
		// if(newCents <= 0) {
		// 	if(newEuro > 0) {
		// 		newEuro--;
		// 		if(newEuro <= 0){
		// 			newEuro = 0;
		// 		}
		// 	}
		// 	newCents = 100 - newCents;
		// }
		
		return new Money(newEuro,newCents);
	}

	public String toString(){
		String zero = "";
		if(cents <= 10) {
			zero = "0";
		}

		return euros + "." + zero + cents + "e";
	}
}