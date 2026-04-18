// PersonWithDateTest.java

class PersonWithDateTest {
	public static void main(String[] args) {
		SimpleDate date = new SimpleDate(24,3,2017);
		SimpleDate date2 = new SimpleDate(24,3,2017);

		PersonWithDate leo = new PersonWithDate("Leo", date,62,9);
		PersonWithDate lily = new PersonWithDate("Leo", date2,62,9);

		if(leo.equals(lily)){
			// System.out.println("Is this quite correct?");
			System.out.println("They are equals.");
		}else {
			System.out.println("They are not equals");
		}

	}
}