package Set1;

import java.util.Scanner;

public class SmallestOfTwoNumber {

	public static void main(String[] args) 
	{
	Scanner sc = new Scanner (System.in);
	System.out.println("Enter one number");
	int i=sc.nextInt();
	System.out.println("Enter two number");
	int j=sc.nextInt();
	
	if(i<j)
	{
		System.out.println("I is small number...");
	}
	else
		System.out.println("J is largest number..");
	}

}
