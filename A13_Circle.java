//3. Write a Java program to read radius of a circle and print its area and circumference of it.

import java.util.Scanner;

public class A13_Circle {

	public static void main(String[] args) {
		
Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter radius of circle:");
		int r =sc.nextInt();
		
		area(r);
		circ(r);
	}
	
	public static void area(int i)
	{
		float z = 3.142f * i *i;
		System.out.println("Area of circle is "+z);
	}

	public static void circ(int i)
	{
		float z = 2 * 3.142f * i;
		System.out.println("Circumference of circle is "+z);
	}

}
