// AverageNumber.java

import java.util.*;

public class AverageNumber {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		List<String> inputs = new ArrayList<>();
		System.out.println("Input number, type \"end\" to stop");

		while(true){
			String row = scanner.nextLine();
			if (row.equals("end")){
				break;
			}
			inputs.add(row);
		}

		double average = inputs.stream()
			.mapToInt(s -> Integer.valueOf(s))
			.average()
			.getAsDouble();

		double negativeAverage  = inputs.stream()
			.mapToInt(s -> Integer.valueOf(s))
			.filter(number -> number <  0)
			.average()
			.getAsDouble();

		double positiveAverage  = inputs.stream()
			.mapToInt(s -> Integer.valueOf(s))
			.filter(number -> number >  0)
			.average()
			.getAsDouble();


		System.out.println("Print the average of the negative numbers of the positive numbers?");
		String choice = scanner.nextLine();
		if(choice.equals("n")){
			System.out.println("printing the negative average " + negativeAverage);
		}else if(choice.equals("p")){
			System.out.println("printing the positive avarage " + positiveAverage);
		}
	}
}