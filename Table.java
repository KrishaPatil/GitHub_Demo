import java.util.Scanner;

public class Table {

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
