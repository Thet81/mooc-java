// Cat.java

public class Cat extends Animal implements NoiseCapable{

	public static void main(String[] args) {
		Cat cat = new Cat();
		cat.purr();
		cat.eat();

		Cat garfield = new Cat("Garfield");
		garfield.purr();
		garfield.eat();
	}
	public Cat(String name){
		super(name);
	}

	public Cat(){
		super("Cat");
	}

	public void purr (){
		System.out.println(this.name + " purrs");
	}

	@Override
	public void makeNoise(){
		this.purr();
	}
}