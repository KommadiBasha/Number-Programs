package PrimeNumberPrograms;

import java.util.Scanner;

public class PrimeNumberO_N_Function 
{
	
	public static void isPrime(int m)
	{
		boolean b= false;
		for(int i=2;i<=m;i++)
		{
			if(m%i==0)
			{
				if(i==m)
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
	
	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter a Number ");
		int m=sc.nextInt();
		
		isPrime(m);
		
	}

}
