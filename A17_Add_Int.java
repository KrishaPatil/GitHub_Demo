//7. Write a Java program to display addition of 1 to 10 integer numbers.

import java.util.Scanner;
public class A17_Add_Int {

	public static void main(String[] args) {
		
		int n=0;
		add(n);
	}
	
	
	public static void add(int n)
	{
		int i,sum=0;
		for(i=1;i<=10;i++)
		{
			sum += i;		
		}
	    
	  System.out.println("Addition of integer from 1 to 10 is "+sum);
	}

}
