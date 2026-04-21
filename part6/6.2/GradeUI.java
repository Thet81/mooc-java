// GradeUI.java
import java.util.*;

class GradeUI {
	private GradeRegister register;
	private Scanner scanner;

	public GradeUI(GradeRegister register, Scanner scanner){
		this.register = register;
		this.scanner = scanner;
	}

	public void start(){
		readPoints();
		System.out.println("");
		printGradeDistribution();
	}

	public void readPoints(){
		while(true){
			System.out.print("Points : ");
			String input = scanner.nextLine();

			if(input.equals("")){
				break;
			}

			int score = Integer.valueOf(input);

			if (score < 0 || score > 100) {
				System.out.println("Impossible number!");
				continue;
			}

			register.addGradeBasedOnPoints(score);
		}
	}

	public void printGradeDistribution(){
		int grade = 5;

		while(grade >= 0){
			int stars = register.numberOfGrades(grade);

			System.out.print(grade + ": ");
			printStars(stars);
			System.out.println("");
			grade --;
		}

		double averageOfPoints = register.averageOfPoints();
		double averageOfGrades = register.averageOfGrades();
		System.out.println("The average of points : " + averageOfPoints);
		System.out.println("The average of grades : " + averageOfGrades);
	}

	public static void printStars(int stars){
		while(stars > 0) {
			System.out.print("*");
			stars --;
		}
	}
}