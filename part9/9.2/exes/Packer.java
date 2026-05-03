// Packer.java
/*
	The packer class does not rely on the class that implements the interface instead it relys on the interface.
*/
public class Packer {
	public static void main(String[] args) {
		Packer packer = new Packer();
		Box boxWithThings = packer.giveABoxOfThings();
		System.out.println(boxWithThings);
	}
	private Factory factory;

	public Packer(){
		this.factory = new Factory();
	}

	public Box giveABoxOfThings(){
		Box box = new Box(100);

		int i = 0;
		while( i < 10){
			Packable newThing = factory.produceNew();
			box.add(newThing);
			i ++;
		}
		return box;
	}
}