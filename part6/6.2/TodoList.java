// TodoList.java
import java.util.*;

public class TodoList {
	private ArrayList<String> todos;

	public TodoList(){
		this.todos = new ArrayList<>();
	}

	public void add(String task){
		this.todos.add(task);
	}

	public void print(){
		int index = 0;
		while(index < this.todos.size()){
			System.out.println( (index + 1) + " : " + this.todos.get(index));
			index ++;
		}
	}

	public void remove(int number) {
		int index = number -1;
		this.todos.remove(index);
	}
}