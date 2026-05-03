// Box.java
import java.util.*;

public class Box implements Packable{

	public static void main(String[] args) {
		Box box = new Box(10);

		box.add(new Book("Fyodor Dostoevsky","Crime and Punishment",2));
		box.add(new Book("Rober Martin","Clean Code",1));
		box.add(new Book("Kent Beck","Test Driven Development",0.7));

		box.add(new CD("Pink Floyd","Dark Side of the moon",1973));
		box.add(new CD("Wigwam","Nuclear Nightclub",1975));
		box.add(new CD("Ba Din","NayYar",1992));
		box.add(new Book("James Doe","All programming in one book",10));

		System.out.println(box);

		Box two = new Box(20);
		Box three = new Box(10);

		box.add(new CD("Wigwam","Nuclear Nightclub",1975));
		box.add(new CD("Ba Din","NayYar",1992));

		two.add(box);
		two.add(three);
		System.out.println(two);
	}
	private double maxCapacity;
	private ArrayList<Packable> packables;

	public Box(double capacity){
		this.maxCapacity = capacity;
		this.packables = new ArrayList<>();
	}

	public void add(Packable packable){
		double total = weight() + packable.weight();
		if(total <= this.maxCapacity){
			this.packables.add(packable);
		}
	}

	public double weight (){
		double weight = 0;
		for(Packable packable : this.packables){
			weight += packable.weight();
		}
		return weight;
	}

	@Override
	public String toString(){
		return "Box : " + this.packables.size() + " items, total weight " + weight() + " kg"; 
	}
}