// TodoTest.java
import java.util.*;

class TodoTest {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		TodoList todolist = new TodoList();
		ToDoUI ui = new ToDoUI(todolist,scanner);
		ui.start();
	}
}