package Set1;

import java.util.Scanner;

public class EvenOddFor {

	public static void main(String[] args) 
	{
		Scanner sc= new Scanner (System.in);
		System.out.println("Please enter one number...");
		int num=sc.nextInt();
		if(num%2==0)
		{
			System.out.println("Even number...");
		}
		else
			
		System.out.println("Odd number...");
	}

}
