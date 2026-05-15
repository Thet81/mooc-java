// People.java

public class People implements Comparable<People>{
	private String name;
	private String gender;
	private double rate;

	public People (String name,String gender,double rate){
		this.name = name;
		this.gender = gender;
		this.rate = rate;
	}

	@Override
	public String toString(){
		return this.name + "," + this.gender + "," + this.rate;
	}

	public double getRate(){
		return this.rate;
	}

	@Override
	public int compareTo(People people){
		return Double.compare(this.rate, people.getRate());
	}
}