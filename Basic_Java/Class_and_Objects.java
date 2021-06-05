package Basic_Java;

public class Class_and_Objects {

	public static void main(String[] args) {
		// Creating object from class
		Class_and_Objects object = new Class_and_Objects();
		object.printAnything();
		//after using static no need to use object, can directly access it.
		printAnything2();
	}
	public void printAnything() {
		System.out.println("this method is basic oop");
	}
	public static void printAnything2() {
		System.out.println("this method is basic oop2");
}
}
