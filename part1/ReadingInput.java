import java.util.Scanner;

public class ReadingInput {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println(scanner);
		System.out.println("Enter a message: ");
		String message = scanner.nextLine();
		System.out.println(message);

	}
}