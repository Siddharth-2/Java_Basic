package Basic_Java;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		
				char Oprator;
				float Num1, Num2, total;
				Scanner Sc= new Scanner(System.in);
				System.out.println(" Choose the Oprator + -  *  / ");
				Oprator = Sc.next().charAt(0);
				System.out.println("Enter first Number :" );
				Num1 =Sc.nextFloat();
				System.out.println(" Enter Second Number");
				Num2 =Sc.nextFloat();
				
				switch(Oprator) {
				case '+' :
					total=Num1 + Num2;
					System.out.println("Total is :"+total);
					break;
				case'-':
					total= Num1 - Num2;
					System.out.println("Total is :"+total);
					break;
				case '*':
					total = Num1 * Num2 ;
					System.out.println("Total is :"+total);
					break;
				case '/':
					total = Num1 / Num2;
					System.out.println("Total is :"+total);
					break;
					default:
						System.out.println("Invalid oprator...");
				break;
					
				
					
					
				}
				Sc.close();

			}

		

	}


