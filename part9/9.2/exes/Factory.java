// Factory.java

import java.util.*;

public class Factory {

	public Factory(){

	}

	public Packable produceNew(){
		Random ticket = new Random();

		int number = ticket.nextInt(4);

		if (number == 0) {
			return new CD("Pink Floyd","Dark Side of the moon",1973);
		}else if (number == 1){
			return new CD("Wigam","Nuclear Nightclub",1975);
		}else if (number == 2){
			return new Book("Robert Martin","Clean Code",1);
		}else {
			return new Book("Kent Beck","Test Driven Development",0.7);
		}
	}
}