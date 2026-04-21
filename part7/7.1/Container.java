// Container.java
import java.util.*;

public class Container {
	private int liquid;

	public Container(){
		this.liquid = 0;
	}

	public int contains (){
		return this.liquid;
	}

	public void add(int amount){
		if(amount <= 100 && amount > 0){
			this.liquid += amount;
		}else if (amount > 100){
			this.liquid = 100;
		}
	}

	public void remove(int amount){
		if(amount <= this.liquid){
			this.liquid -= amount;
		}else if (amount > this.liquid){
			this.liquid = 0;
		}
	}

	public String toString(){
		return this.liquid + "/100";
	}
}