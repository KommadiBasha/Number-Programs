package PrimeNumberPrograms;

import java.util.Scanner;

public class PrimeNumberOrNot_F {

	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter a number");
		int num=sc.nextInt();
		
		 for(int i=2;i<=num;i++)
		{
			if(num%i==0)
			{
				if(i==num)
				{
					System.out.println("prime");
					break;
				}
				else
				{
					System.out.println("Not a prime number...");
					break;
				}
				
			}
		}
	}

}
