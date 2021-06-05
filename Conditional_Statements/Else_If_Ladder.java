package Conditional_Statements;

public class Else_If_Ladder {

	public static void main(String[] args) {
		int i = 1;
		int percentage=71;
		
		// Else if Ladder
				if(percentage > 60 && percentage <= 70) 
					System.out.println("I will go for Arts");
				else if(percentage > 70 && percentage <= 80) 
					System.out.println("I will go for Commerce");
				else if(percentage > 80) 
					System.out.println("I will go for Science");
				else
					System.out.println("I dont know");
			}
}


