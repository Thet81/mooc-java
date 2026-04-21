// DateTest.java

class DateTest {
	public static void main(String[] args) {
		SimpleDate date = new SimpleDate(0,0,1990);
		// date.advance();
		// date.advance();

		date.advance(400);
		// date.advance(30);
		// SimpleDate datetwo = new SimpleDate(1,0,0);

		// SimpleDate dateAfter = datetwo.afterNumberOfDays(367);
		// System.out.println("dateAfter is " + dateAfter);

		System.out.println(date);
	}
}