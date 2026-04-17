// PersonalInformationCollection.java

import java.util.*;

class PersonalInformationCollection {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<PersonalInformation> personInfo = new ArrayList<>();

		while(true) {
			System.out.println("Enter first name");
			String fName = scanner.nextLine();

			if (fName.isEmpty()){
				break;
			}

			System.out.println("Enter last name");
			String lName = scanner.nextLine();

			System.out.println("Enter person id");
			String id = scanner.nextLine();

			personInfo.add(new PersonalInformation(fName,lName,Integer.valueOf(id)));
		}

		System.out.println("Collection has " + personInfo.size());

		for(PersonalInformation info : personInfo){
			System.out.println(info.getName());
		}
	}
}