// Reader.java
import java.util.*;

class Reader {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int numberOfRead = 0;
		while(true) {
			String line = scanner.nextLine();

			if (line.equals("end")){
				break;
			}
			System.out.println(line.isEmpty());
			numberOfRead ++;
		}	

		System.out.println(numberOfRead);
	}
}