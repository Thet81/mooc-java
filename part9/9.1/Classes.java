// Classes.java

class Classes {
	public static void main(String[] args) {
		C c = new C();
		B b = new B();
		A a = new A();

		a.a();
		b.b();
		c.c();

		
		b.a();
		b.b();
		c.c();

		c.a();
		c.b();
		c.c();
	}
}