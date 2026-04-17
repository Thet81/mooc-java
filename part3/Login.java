// Login.java
import java.util.*;

class Login {
	public static void main(String[] args) {
		// String username = "alex";
		// String password = "sunshine";
		String[] usernames = {"alex","emma"};
		String[] password = {"sunshine","haskell"};

 		Scanner reader = new Scanner(System.in);
		System.out.println("Enter a username");

		String usernameInput = reader.nextLine();

		System.out.println("Enter a password");

		String passwordInput = reader.nextLine();
		
		if ((usernameInput.equals(usernames[0]) || usernameInput.equals(usernames[1])) && (passwordInput.equals(password[0]) || passwordInput.equals(password[1]))) {
			System.out.println("Logged in success!");
		}else {
			System.out.println("Failed to log in.");
		}
	}
}