package IFStatement;

import java.util.Scanner;

public class IFStatement
{
	public static void main(String [] args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("enter a number...");
		int num=sc.nextInt();
		
		int byear=1999;
		
		if(byear==num)
		{
			System.out.println("Your enter birth is correct....");
		}
	}
}
