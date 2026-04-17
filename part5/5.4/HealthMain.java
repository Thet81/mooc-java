// HealthMain.java

class HealthMain {
	public static void main(String[] args) {
		Person ethan = new Person("Ethan",1,110,7);
		Person peter = new Person("Peter",33,176,85);

		HealthStation childrenHospital = new HealthStation();

		System.out.println(ethan.getName() + " weight : " + childrenHospital.weigh(ethan) + " kilos");
		System.out.println(peter.getName() + " weight : " + childrenHospital.weigh(peter) + " kilos");

		childrenHospital.feed(ethan);
		childrenHospital.feed(ethan);
		childrenHospital.feed(ethan);

		System.out.println("");
		System.out.println(ethan.getName() + " weight : " + childrenHospital.weigh(ethan) + " kilos");
		System.out.println(peter.getName() + " weight : " + childrenHospital.weigh(peter) + " kilos");

		System.out.println("Wighings performed " + childrenHospital.wighings());
	}
}