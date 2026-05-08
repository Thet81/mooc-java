// Herd.java
import java.util.*;

public class Herd implements Movable{

	public static void main(String[] args) {

		Herd herd = new Herd();
		herd.addToHerd(new Organism(57, 66));
		herd.addToHerd(new Organism(73, 56));
		herd.addToHerd(new Organism(46, 52));
		herd.addToHerd(new Organism(19, 107));
		System.out.println(herd);
	}

	private List<Movable> herds;

	public Herd(){
		this.herds = new ArrayList<>();
	}

	@Override
	public String toString(){
		String str = "";
		for (Movable herd : this.herds){
			str += herd.toString() + "\n";
		}
		return str;
	}

	public void addToHerd(Movable movable){
		this.herds.add(movable);
	}

	@Override
	public void move(int dx, int dy){
		for(Movable herd : this.herds){
			herd.move(dx,dy);
		}
	}
}