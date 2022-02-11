package Practice;

import java.util.Scanner;

public class Factorial {
//trying fetch option
	public static void main(String[] args) {
		int number = 0;		
		System.out.println("Please enter a number\n");
		Scanner input = new Scanner(System.in);
		if(input.hasNextInt()) {
			number = input.nextInt();
			input.close();
		} //just test
		//again changes
		
		if(number > 0) {
			factorialByLoop(number);	
			factorialByRecursion(number);

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
	
	public static void factorialByRecursion(int number) {
		int fact = 1;
		System.out.println("Factorial by Recursion Method\n");
		fact = factorial(number);
		System.out.println(number + "! is : " +fact);
		
	}
	
	public static int factorial(int number) {
		if(number > 0) {
			return (number * factorial(number-1));
		}
		else {
			return 1;
		}
	}


}
