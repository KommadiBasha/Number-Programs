package PrimeNumberPrograms;

import java.util.Scanner;

public class PrimeNumberO_NDoWhile {

	public static void main(String[] args) 
	{
		Scanner sc =new Scanner (System.in);
		System.out.println("enter a number");
		int num=sc.nextInt();
		int i=2;
		do
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
					System.out.println("not a prime");
					break;
				}
			}
			i++;
		}while(i<=num);

	}

}
