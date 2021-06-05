package Basic_Java;

public class Operators {

	public static void main(String[] args) {
		System.out.println("\nFollowing are Arithmetic Operators: ");
		int a = 5;
		int b = 6;
		
		int c = a + b;
		System.out.println(" 1]Addition of values: " + c);
		
        int d = a - b;
        System.out.println(" 2]Subtraction of values: " + d);
        
        int e = a * b;
        System.out.println(" 3]Multiplication of values: " + e);
        
        float m = b / a;
        System.out.println(" 7]Division of values: " + m);
       
        float f = a % b;
        System.out.println(" 4]Modulus of values: " + f);
        
        float g = a++ ;
        System.out.println(" 5]Incremented value: " + a);
        
        float h = b-- ;
        System.out.println(" 6]Decremented value: " + b);
        
        System.out.println("\nFollowing are Assignment Operators: ");
        
        int i = a += b;
        System.out.println(" 1]Value of ADD AND operator: " + i);
        
        int j = a -= b;
        System.out.println(" 2]Value of SUBTRACT AND operator: " + j);
        
        int k = a *= b;
        System.out.println(" 3]Value of MULTIPLY AND operator: " + k);
        
        int l = b /= a;
        System.out.println(" 4]Value of DIVIDE AND operator: " + l); 
        
        int n = b %= a;
        System.out.println(" 5]Value of MODULUS AND operator: " + n);
        
        System.out.println("\nFollowing are Comparison Operators: ");
        
        if (a == b) {
        System.out.println("true");
        }
        else{
        System.out.println("false");
        }
        		
        if (a>=b) {
        System.out.println("true");
        }
        else{
        System.out.println("false");	
        }
        
           
        
	}

}
