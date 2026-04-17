// Teachers.java
import java.util.*;

class Teachers {
	public static void main(String[] args) {
		ArrayList<String> teachers = new ArrayList<>();
		teachers.add("Simon");
		teachers.add("Samuel");
		teachers.add("Ann");
		teachers.add("Anna");

		for (int i = 0; i < teachers.size();i++) {
			System.out.println(teachers.get(i));
		}
	}
}