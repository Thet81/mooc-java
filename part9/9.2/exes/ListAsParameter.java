// ListAsParameter.java
import java.util.*;

public class ListAsParameter {

	public static void main(String[] args) {
		List<String> names = new ArrayList<>();
		names.add("First");
		names.add("Second");
		names.add("Third");
		System.out.println(returnSize(names));
	}
	// the method accepts the list interface instead of concrete class
	public static int returnSize(List<String> list){
		return list.size();
	}
}