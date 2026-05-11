// UserInput.java
import java.util.*;

public class UserInput {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		List<String> inputs = new ArrayList<>();

		while(true){
			String input = scanner.nextLine();
			if(input.isEmpty()){
				break;
			}

			inputs.add(input);
		}

		inputs.stream()
			.forEach(i -> System.out.println(i));
	}
}