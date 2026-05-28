// TextUI.java
package flightControl.ui;
import flightControl.domain.Flight;
import flightControl.domain.Airplane;
import flightControl.logic.FlightControl;
import java.util.Scanner;

public class TextUI{
	private FlightControl flightControl;
	private Scanner scanner;
	public static void main(String[] args) {
		FlightControl fc = new FlightControl();
		Scanner scanner = new Scanner(System.in);
		TextUI ui = new TextUI(fc,scanner);
		ui.start();
	}
	public TextUI(FlightControl flightControl, Scanner scanner){
		this.flightControl = flightControl;
		this.scanner = scanner;
	}

	public void start(){
		startAssetControl();
		System.out.println();
		// startFlightControl();
		// System.out.println();
	}

	private void startAssetControl(){
		System.out.println("Airport Asset Control");
		System.out.println("---------------");
		System.out.println();

		while(true){
			System.out.println("Choose an action");
			System.out.println("[1] Add an airplane");
			System.out.println("[2] Add a flight");
			System.out.println("[x] Exit Airport Asset Control");
			System.out.print("> ");
			String answer = scanner.nextLine();

			if(answer.equals("1")){
				addAirplane();
			}
		}
	}

	private void addAirplane(){
		System.out.println("Give the airplane id");
		String id = scanner.nextLine();
		System.out.println("Give the airplane capcity");
		int capacity = Integer.valueOf(scanner.nextLine());

		this.flightControl.addAirplane(id,capacity);
	}
}