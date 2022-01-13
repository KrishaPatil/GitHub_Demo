//6. Write a Java program to enter a number and print whether it is positive or negative. 

import java.util.Scanner;
public class A16_pve_nve {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a number: ");
		int n =  sc.nextInt();

		num(n);

	}

	public static void num(int n)
	{
		if(n > 0) {
			System.out.println("Number is Positive");
		}
		else
		{
			System.out.println("Number id Negative");
		}
	}

}
