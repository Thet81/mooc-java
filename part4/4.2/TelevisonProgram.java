// TelevisonProgram.java
import java.util.*;

class TelevisonProgram {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<Television> televisionList = new ArrayList<>();
		System.out.println("Enter the details of televison");

		while(true) {
			String details = scanner.nextLine();

			if (details.isEmpty()){
				break;
			}

			String[] parts = details.split(",");
			String name = parts[0];
			int duration = Integer.valueOf(parts[1]);
			televisionList.add(new Television(name,duration));
		}

		System.out.println("Television list has " + televisionList.size());
		System.out.println("Program's maximum duration ? ");
		int maximumDuration = Integer.valueOf(scanner.nextLine());

		for(Television television : televisionList){
			if (television.getDuration() <= maximumDuration) {
				System.out.println(television);
			}
		}
	}
}