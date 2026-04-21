// MoneyPlus.java

class MoneyPlus{
	public static void main(String[] args) {
		Money a = new Money(10,0);
		Money b = new Money(3,50);
		Money c = a.minus(b);
		System.out.println(c);
	}
}