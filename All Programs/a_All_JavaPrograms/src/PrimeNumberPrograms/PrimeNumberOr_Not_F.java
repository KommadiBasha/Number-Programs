package PrimeNumberPrograms;

import java.util.Scanner;

public class PrimeNumberOr_Not_F {

	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter end number");
		int num=sc.nextInt();
		int count=0;
		if(num==1)
		{
			System.out.println("1 is not a prime number...");
			return;
		}
		for(int i=2;i<=num;i++)
		{
				
				if(num%i==0 )
				{
					count++;
				
				}
		}		
		
				if(count<=2)
				{
					System.out.println("prime number...");
				}
				else
				{
					System.out.println("not a prime");
				}
		
		
	}

}
