package PrimeNumberPrograms;

import java.util.Scanner;

public class PrimeNumberOr_Not_W {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number...");
		int number =sc.nextInt();
		boolean b=false;
		int i=2;
		int count=0;
		if(number==1)
		{
			System.out.println("1 is not a prime ");
			return ;
		}
		while(i<=number/2)
		{
			if(number%i==0)
			{
				count++;
				break;
			}
			i++;	
		}
		if(count==0)
		{
			System.out.println("prime");
		}
		else 
		{
			System.out.println("not a prime");
		}
	}
}
