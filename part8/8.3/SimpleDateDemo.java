// SimpleDateDemo.java
import java.util.*;

class SimpleDateDemo {
	public static void main(String[] args) {
		SimpleDate d = new SimpleDate(1,2,2000);
		System.out.println(d.equals("heh"));

		System.out.println(d.equals(new SimpleDate(5,2,2012)));
		System.out.println(d.equals(new SimpleDate(1,2,2000)));

		HashMap<SimpleDate,String> dates = new HashMap<>();
		SimpleDate myBirthYear = new SimpleDate(29,5,1999);
		dates.put(myBirthYear,"My brith year");

		System.out.println(dates.get(new SimpleDate(29,5,1999)));
	}
}