package SumofOddDigits;

import java.util.Scanner;

public class SumOfDigits_Methods 
{
	public static void main(String [] args)
	{
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter digits....");
		int num=sc.nextInt();
		int sum=0;
		if(num==0 || num==62767 || num<=-1)
		{
			System.out.println("Invalid input...");
		}
		else
		{
			while(num>0)
			{
				int last=num%10;
				if(num%2==1)
				{
					sum+=last;
				}
				num/=10;
			}
		}
		System.out.println(sum);
	}
}
