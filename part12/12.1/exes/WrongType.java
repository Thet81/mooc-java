// WrongType.java
import java.util.*;

public class WrongType {
	public static void main(String[] args) {
		ArrayList<String> strings = new ArrayList<>();
		strings.add("1");
		int number = Integer.parseInt(strings.get(0));
		System.out.println(number);
	}
}