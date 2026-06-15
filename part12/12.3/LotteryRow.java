// Lottery.java
import java.util.*;

public class LotteryRow{

	public static void main(String[] args) {
		LotteryRow row = new LotteryRow();
		ArrayList<Integer> lotteryNumber = row.numbers();

		System.out.println("Lottery numbers");
		for(int number : lotteryNumber){
			System.out.print(number + " ");
		}
		System.out.println("");
	}

	private ArrayList<Integer> numbers;

	public LotteryRow(){
		this.randomizeNumbers();
	}

	public ArrayList<Integer> numbers(){
		return this.numbers;
	}

	public boolean containsNumber(int number){
		return this.numbers.contains(number);
	}

	public void randomizeNumbers(){
		this.numbers = new ArrayList<>();
		Random random = new Random();

		for(int i = 0; i < 7; i++){
			int randNum = random.nextInt(41) + 1;

			if(containsNumber(randNum)){
				randNum = random.nextInt(41) + 1;
			}
			this.numbers.add(randNum);
		}
	}
}