// HideOut.java

public class HideOut<T>{
	public static void main(String[] args) {
		HideOut<String> den = new HideOut<>();
		System.out.println(den.isInHideout());
		den.putIntoHideout("peekaboo");
		System.out.println(den.isInHideout());
		System.out.println(den.takeFromHideout());
		System.out.println(den.isInHideout());
		den.putIntoHideout("toodaloo");
		den.putIntoHideout("heello");
		System.out.println(den.isInHideout());
		System.out.println(den.takeFromHideout());
		System.out.println(den.isInHideout());

		System.out.println("------------");
		HideOut<Integer> denTwo = new HideOut<>();
		System.out.println(denTwo.isInHideout());
		denTwo.putIntoHideout(1);
		System.out.println(denTwo.isInHideout());
		System.out.println(denTwo.isInHideout());
		System.out.println(denTwo.takeFromHideout());
		System.out.println(denTwo.isInHideout());
	}
	private T thingToHide =null;

	public HideOut(){
		this.thingToHide = null;
	}

	public HideOut(T thingToHide){
		this.thingToHide = thingToHide;
	}

	public void putIntoHideout(T toHide){
		this.thingToHide = toHide;
	}

	public T takeFromHideout(){
		if(this.thingToHide == null){
			return null;
		}
		T hiddenThing = this.thingToHide;
		this.thingToHide = null;
		return hiddenThing;
	}

	public boolean isInHideout(){
		if(this.thingToHide == null){
			return false;
		}
		return true;
	}
}