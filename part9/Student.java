// Student.java

public class Student extends Person{
	private int credit;

	public Student(String name, String address){
		super(name,address);
		this.credit = 0;
	}

	public void study (){
		this.credit ++;
	}

	public String credits(){
		return "Study credits " + this.credit;
	}
	@Override
	public String toString(){
		return super.toString() + "\n" + "\t" + "Study credits " + this.credit;
	}
}