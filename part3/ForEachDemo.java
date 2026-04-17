// ForEachDemo.java
import java.util.*;

class ForEachDemo {
	public static void main(String[] args) {
		ArrayList<String> teachers = new ArrayList<>();
		teachers.add("Simon");
		teachers.add("Ann");
		teachers.add("Samuel");

		for(String teacher : teachers) {
			System.out.println(teacher);
		}
	}
}