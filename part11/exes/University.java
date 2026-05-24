// University.java
import java.util.*;

public class University {
	private String name;
	private List<Student> students;

	public University(String name){
		this.name = name;
		this.students = new ArrayList<>();
	}

	public void addStudent(Student student){
		this.students.add(student);
	}

	@Override
	public String toString(){
		return name;
	}
}