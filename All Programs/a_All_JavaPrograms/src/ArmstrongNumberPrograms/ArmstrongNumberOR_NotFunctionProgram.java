package ArmstrongNumberPrograms;

import java.util.Scanner;

public class ArmstrongNumberOR_NotFunctionProgram 
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner (System.in);
		System.out.println("Enter a number");
		int num=sc.nextInt();
		
		checkNumber(num);

	}
	public static void checkNumber(int number)
	{
		int countNumber=number;
		int extraNumber=number;
		
		int count=0;
		int sum=0;
		while(countNumber>0)
		{
			count++;
			countNumber/=10;
		}
		while(extraNumber>0)
		{
			int rem=extraNumber%10;
			int fact=1;
			
			for(int i=1;i<=count;i++)
			{
				fact=fact*rem;
			}
			sum+=fact;
			extraNumber/=10;
		}
		if(sum==number)
		{
			System.out.println("Armstrong number");
		}
		else
		{
			System.out.println("Not a Armstrong number...");
		}
				
		
		
	}
}
