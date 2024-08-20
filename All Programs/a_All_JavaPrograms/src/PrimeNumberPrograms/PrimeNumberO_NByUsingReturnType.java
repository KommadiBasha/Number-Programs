package PrimeNumberPrograms;

import java.util.Scanner;

public class PrimeNumberO_NByUsingReturnType 
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("enter a number");
		int num=sc.nextInt();
		if(isPrimeNumber(num))
		{
			System.out.println("prime");
		}
		else
		{
			System.out.println("not prime");
		}

	}
	public static boolean isPrimeNumber(int n)
	{
		int i=2;
		while(i<=n/2)
		{
			if(n%i==0)
			{
				return false;
			}
			i++;
		}
		return true;
	}

}