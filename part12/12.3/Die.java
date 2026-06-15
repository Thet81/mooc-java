// Die.java
import java.util.*;

public class Die {

	public static void main(String[] args) {
		Die die = new Die(6);

		for(int i = 0; i < 10; i++){
			System.out.println(die.throwDie());
		}
	}
	private Random random;
	private int numberOfFaces;

	public Die(int numberOfFaces){
		this.random = new Random();
		this.numberOfFaces = numberOfFaces;
	}

	public int throwDie(){
		int randomNumber = this.random.nextInt(numberOfFaces) + 1;
		return randomNumber;
	}
}