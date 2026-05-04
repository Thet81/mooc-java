// SetAsParameter.java
import java.util.*;

public class SetAsParameter {

	public static void main(String[] args) {
		Set<String> names = new HashSet<>();
		names.add("John Doe");
		names.add("James Doe");
		System.out.println(returnSize(names));
	}

	public static int returnSize(Set<String> set){
		return set.size();
	}
}