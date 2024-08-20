package PrimeNumberPrograms;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter a number");
		int num=sc.nextInt();
		int count=0;
		if(num==1)
		{
			System.out.println("not a prime");
			return ;
		}
		for(int i=2;i<=num/2;i++)
		{
			if(num%i==0)
			{
				System.out.println("not a prime");
				return;
			}
		}
		System.out.println("prime");
	}

}
