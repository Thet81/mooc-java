// ParkTest.java

class ParkTest {
	public static void main(String[] args) {
		Person matti = new Person("Matti");
		matti.setWeight(86);
		matti.setHeight(180);

		Person juhana = new Person("Juhana");
		juhana.setWeight(34);
		juhana.setHeight(132);

		AmusementParkRide hurjakuru = new AmusementParkRide("Hurjakuru",140);
		System.out.println(hurjakuru);
		System.out.println();

		if (hurjakuru.allowedToRide(matti)){
			System.out.println(matti.getName() + "is allowed on the ride");
		}else {
			System.out.println(matti.getName() + "is not allowed on the ride");
		}

		System.out.println(hurjakuru);
		System.out.println(hurjakuru.averageHeightOfPeopleOnRide());
		System.out.println(hurjakuru.getTallest().getName());
	}
}