//5. Write a Java program to enter a number and print whether it is even or odd. 

import java.util.Scanner;

public class A15_Even_Odd {

	public static void main(String[] args) {
	
Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		int n =  sc.nextInt();
		
		Even_Odd(n);
	}
	
	public static void Even_Odd(int n)
	{
		if(n%2 == 0) {
			System.out.println("Number is even");
		}
		else
		{
			System.out.println("Number id odd");
		}
	}

}
