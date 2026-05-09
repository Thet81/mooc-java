// Dog.java

public class Dog extends Animal implements NoiseCapable{
	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.bark();
		dog.eat();

		Dog fido = new Dog("Fido");
		fido.bark();
		fido.eat();
	}
	public Dog(String name){
		super(name);
	}

	public Dog(){
		super("Dog");
	}

	public void bark(){
		System.out.println(this.name + " barks");
	}

	@Override
	public void makeNoise(){
		this.bark();
	}

}