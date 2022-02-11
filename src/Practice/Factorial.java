package Practice;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		int number = 0;		
		System.out.println("Please enter a number\n");
		Scanner input = new Scanner(System.in);
		if(input.hasNextInt()) {
			number = input.nextInt();
			input.close();
		}
		
		if(number > 0) {
			factorialByLoop(number);			
		}
	}

	public static void factorialByLoop(int number) {
		int factorial = 1;
		
		System.out.println("Factorial Result by looping\n");
		
		for(int i=1; i<=number;i++) {
			factorial *= i;				
		}
		System.out.println("Factorial of " +number+ " is : "+ factorial);
	}

}
