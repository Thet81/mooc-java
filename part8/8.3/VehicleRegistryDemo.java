// VehicleRegistryDemo.java

class VehicleRegistryDemo {
	public static void main(String[] args) {
		VehicleRegistry vehReg = new VehicleRegistry();

		LicensePlate finnish = new LicensePlate("FI","ABC-123");
		LicensePlate finnishTwo = new LicensePlate("FI","EFG-554");
		LicensePlate finnishThree = new LicensePlate("FI","ETR-349");

		String ownerOne = "Arto";
		boolean wasSuccess = vehReg.add(finnish,ownerOne);
		vehReg.add(finnishThree,"Arto");
		vehReg.add(finnishTwo,"Juger");
		String ownerTwo = "Other";
		boolean wasSuccessTwo = vehReg.add(finnish,ownerTwo);
		System.out.println(wasSuccess);
		System.out.println(wasSuccessTwo);
		System.out.println(vehReg.get(finnish));
		System.out.println("----Plates----");
		vehReg.printLicensePlates();
		System.out.println("----Owners----");
		vehReg.printOwners();
	}
}