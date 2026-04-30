// TacoDemo.java

class TacoDemo {
	public static void main(String[] args) {
		TripleTacoBox tpb = new TripleTacoBox();
		tpb.eat();
		tpb.eat();
		tpb.eat();
		tpb.eat();
		System.out.println(tpb.tacosRemaining());
	}
}