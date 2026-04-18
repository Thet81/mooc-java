// SimpleDate.java

public class SimpleDate {
	private int day;
	private int month;
	private int year;

	public SimpleDate(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}

	public boolean before(SimpleDate compared) {
		if (this.year < compared.year){
			return true;
		}

		if (this.year > compared.year){
			return false;
		}

		if(this.month < compared.month) {
			return true;
		}

		if (this.month > compared.month){
			return false;
		}

		if(this.day < compared.day){
			return true;
		}

		return false;
	}
	public int getDay(){
		return this.day;
	}

	public int getMonth() {
		return this.month;
	}

	public int getYear() {
		return this.year;
	}

	public boolean equals(Object compared){
		// if the variables are located in the same position, they are equal
		// as such SimpleDate first = new SimpleDate();
		// second = first
		if(this == compared){
			return true;
		}

		if(!(compared instanceof SimpleDate)){
			return false;
		}

		SimpleDate comparedSimpleDate = (SimpleDate) compared;

		if (this.day == comparedSimpleDate.day &&
			this.month == comparedSimpleDate.month &&
			this.year == comparedSimpleDate.year
			) {
			return true;
		}

		return false;
	}

	@Override
	public String toString() {
		return this.day + "." + this.month + "." + this.year;
	}
}