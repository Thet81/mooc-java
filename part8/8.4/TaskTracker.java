// TaskTracker.java

import java.util.*;

public class TaskTracker {
	private HashMap<String,ArrayList<Integer>> completedExercises;

	public static void main(String[] args) {
		TaskTracker tracker = new TaskTracker();
		tracker.add("Ada",3);
		tracker.add("Ada",4);
		tracker.add("Ada",3);

		tracker.print();
	}
	public TaskTracker(){
		this.completedExercises = new HashMap<>();
	}

	public void add(String user, int exercise){
		this.completedExercises.putIfAbsent(user, new ArrayList<>());

		ArrayList<Integer> completed = this.completedExercises.get(user);
		completed.add(exercise);
	}

	public void print(){
		for(String name : this.completedExercises.keySet()){
			System.out.println(name + ": " + completedExercises.get(name));
		}
	}
}