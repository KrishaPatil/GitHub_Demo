//8. Write a Java to take an integer from user and print its table. For example if number is 3 : 3*1=3 3*2=6 3*3=9 ….. 3*10=30

import java.util.Scanner;
public class A18_Table {

	public static void main(String[] args) {
		
Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter anumber: ");
	    int n = sc.nextInt();
	    
	    System.out.println("Multiplicaton table of "+n+ " is :");
	    table(n);
	}
	
	public static void table(int n)
	{
		int mul=0;
		for(int i=1;i<=10;i++) {
			mul = n * i;
			System.out.println(n +" * " +i+" = "+mul);
		}
	}

}
