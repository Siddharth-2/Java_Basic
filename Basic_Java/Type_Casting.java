package Basic_Java;

public class Type_Casting {

	public static void main(String[] args) {
		final int i = 0;
		System.out.println("Final/Const Int: "+ i);
		int j = 0;//int data Type
		j = 1;
		System.out.println("Normal Int:"+ j);
		char someThing = 'c'; //char data Type
		System.out.println("Char: "+ someThing);
		
		boolean some = true;//boolean data Type
		System.out.println("Boolean : " +some); 
		
		float tempFloat = (float) 2.23451234567890123456789034567812345678934567893456789; //float data Type
		System.out.println("Float : " +tempFloat);
		
		double tempDouble = (double) 2.234534567890345675678; //double data Type
		System.out.println("Double : " + tempDouble);
		
		// Narrow Casting Example
				tempFloat = (float) tempDouble; // Narrow Casting double -> float
				System.out.println("Narrow Casting double -> float : " + tempFloat);
				j = (int) tempFloat; // Narrow Casting float -> int
				System.out.println("Narrow Casting float -> int : " + j );
			
		// Widening Casting Example
				float tempFloat2 = j;// Widening Casting int -> float 
				System.out.println("Widening Casting int -> float : "+tempFloat2);
				double tempDouble2 = tempFloat2;// Widening Casting float -> double
				System.out.println("Widening Casting float -> double :" + tempDouble2 );


	}

}
