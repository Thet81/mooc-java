// LongestName.java
import java.util.*;

class LongestName {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		String[] longestNameArray = {"",""};
		int count = 0;
		int yearSum = 0;
		while(true) {
			String input = reader.nextLine();
			if (input == "") {
				break;
			}
			String[] person = input.split(",");
			if (person[0].length() > longestNameArray[0].length()){
				longestNameArray = person;
			}
			yearSum += Integer.valueOf(person[1]);
			count ++;
		}
		System.out.println("Longest name : " + longestNameArray[0]);
		if (count > 0) {
			System.out.println("Average of the birthyear is " + yearSum / count);
		}else {
			System.out.println("No input");
		}

		
	}
}