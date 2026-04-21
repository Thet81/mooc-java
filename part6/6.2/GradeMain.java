// GradeMain.java
import java.util.*;

class GradeMain {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		GradeRegister register = new GradeRegister();
		GradeUI ui = new GradeUI(register,scanner);

		// register.addGradeBasedOnPoints(93);
		// register.addGradeBasedOnPoints(92);
		// register.addGradeBasedOnPoints(91);
		// register.addGradeBasedOnPoints(88);
		// System.out.println(register.averageOfPoints());
		ui.start();
	}
}