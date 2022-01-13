/*4. Write a Java program to read a number and print its square.
create a function static void printSquare(int n) to display the Square. */

import java.util.Scanner;

public class A14_Square {

	public static void main(String[] args) {
		
Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		int n =  sc.nextInt();
		
		printSquare(n); 
	}
	
	public static void printSquare(int n) 
	{
	      int  result = n * n;
	      System.out.println("Square is "+result);
	}


}
