// Television.java

public class Television {
	private String name;
	private int duration;

	public Television(String name,int duration) {
		this.name = name;
		this.duration = duration;
	}

	public int getDuration (){
		return this.duration;
	}
	@Override
	public String toString() {
		return this.name + ", " + this.duration + "minutes";
	}
}