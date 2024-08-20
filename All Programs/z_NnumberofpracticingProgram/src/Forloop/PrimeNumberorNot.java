package Forloop;

import java.util.Scanner;

public class PrimeNumberorNot {

	public static void main(String[] args) 
	{
			Scanner sc =new Scanner (System.in);
			System.out.println("enter a number ...");
			int num1=sc.nextInt();
			for(int i=2;i<=num1;i++)
			{
				if(num1%i==0)
				{
			
					if(i==num1)
					{
						System.out.println("prime");
						break;
					}
					else
					{
						System.out.println("not a prime");
						break;
					}
				}
			}
			
			
	
			
		
			
	}

}
