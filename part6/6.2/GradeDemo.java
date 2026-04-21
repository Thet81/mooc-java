// GradeDemo.java
import java.util.*;

class GradeDemo {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<Integer> grades = new ArrayList<>();

		while(true){
			System.out.println("Points : ");
			String input = scanner.nextLine();

			if(input.equals("")){
				break;
			}

			int score = Integer.valueOf(input);

			if(score < 0 || score > 100){
				System.out.println("Impossible number");
				continue;
			}

			int grade = 0;

			if (score < 50){
				grade = 0;
			}else if (score < 60){
				grade = 1;
			}else if (score < 70) {
				grade = 2;
			}else if (score < 80){
				grade = 3;
			}else if (score < 90){
				grade = 4;
			}else {
				grade = 5;
			}

			grades.add(grade);
		}


		System.out.println("");
		int grade = 5;

		while ( grade >= 0 ) {
			int star = 0;
			for(int received : grades) {
				if(received == grade){
					star++;
				}
			}
			System.out.print(grade + ": ");

			while( star > 0){
				System.out.print("*");
				star--;
			}

			System.out.println("");
			grade = grade -1;
		}
		// for(int grade : grades){
		// 	System.out.println(grade);
		// }
	}
}