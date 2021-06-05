package Basic_Java;

public class Modifiers {
	
	private int privatevariable = 01;//Further reference in Hello World class
	int defaultvariable = 02;//Example in For loop class.
	protected int protectedvariable=03;//Example in MainCar class.
	public int publicvariable = 04;//Example in For loop class.
	
	public static void main(String[] args) {
		Modifiers modifiers = new Modifiers();
		System.out.println(modifiers.privatevariable);
		System.out.println(modifiers.defaultvariable);
		System.out.println(modifiers.protectedvariable);
		System.out.println(modifiers.publicvariable);

	}

}
