// Operation.java
import java.util.*;
public abstract class Operation {
	private String name;

	public Operation(String name) {
		this.name = name;
	}

	public String getName(){
		return this.name;
	}

	public abstract void execute(Scanner scanner);
}