// IOUDemo.java

class IOUDemo {
	public static void main(String[] args) {
		IOU mattsIOU = new IOU();
		mattsIOU.setSum("Arthur",51.5);
		mattsIOU.setSum("Michael", 30);
		mattsIOU.setSum("Arthur",40.0);

		System.out.println(mattsIOU.howMuchDoIOweTo("Arthur"));
		System.out.println(mattsIOU.howMuchDoIOweTo("Michael"));
		System.out.println(mattsIOU.howMuchDoIOweTo("Mike"));
	}
}