package Four_Principles_of_OOP;

public class Polymorphism {

	public static void main(String[] args) {
		int a = 2, b = 3;
		int finalvalue = add(a,b);
		System.out.println(finalvalue);
		
		float c =2, d=3;
		float finalvalue2 = add(a,b);
		System.out.println(finalvalue2);
		
		String e ="some", f="String";
		String finalvalue3 = add(e,f);
		System.out.println(finalvalue3);

		int g = 4;
		int sum = add(a,b,g);
		System.out.println(sum);
		
	}

	private static String add(String e, String f) {
		return null;
	}

	static int add(int a, int b) {
		return a+b;
	}
	static int add(int a, int b, int c) {
		return a+b+c;

	}	
	static float add(float a, float b) {
		return a+b;
		
	}
}
