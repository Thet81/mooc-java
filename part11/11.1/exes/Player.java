// Player.java

public class Player extends Bot{
	private String name;

	@Override
	public void play(){
		System.out.println("The player is playing!");
	}

	public void printName(){
		System.out.println(name);
	}
}