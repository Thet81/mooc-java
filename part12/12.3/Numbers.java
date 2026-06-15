// Numbers.java
import java.util.*;

public class Numbers {
	public static void main(String[] args) {
			start();
	}

	public static void start(){
		Scanner scanner = new Scanner(System.in);
		while(true){
			System.out.println("How many random numbers should be printed?");
			String input = scanner.nextLine();

			if(input.isEmpty()){
				break;
			}

			int times = Integer.valueOf(input);
			for(int i = 0; i < times; i++){
				Random random = new Random();
				int randomNumber = random.nextInt(10);
				System.out.println(randomNumber);
			}
		}
	}
}