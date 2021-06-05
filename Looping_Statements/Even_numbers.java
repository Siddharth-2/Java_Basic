package Looping_Statements;

public class Even_numbers {
	
//Even numbers using while loop
	public static void main(String[] args) {
		int m=1;
		while(m<10) {
			if(m%2==0) {
				System.out.println("Even numbers till 10: " + m);
			}
		  m++;
		}
	}

}
