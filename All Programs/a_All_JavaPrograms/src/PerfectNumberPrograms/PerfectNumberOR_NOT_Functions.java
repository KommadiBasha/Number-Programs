package PerfectNumberPrograms;

import java.util.Scanner;

public class PerfectNumberOR_NOT_Functions 
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter number");
		int num=sc.nextInt();
		
		isPerfect(num);
	
	}
	public static void isPerfect(int number)
	{
		int sum=0;
		int div=1;
		while(div<number)
		{
			if(number%div==0)
			{
				sum=sum+div;
			}
			div++;
		}
		if(sum==number)
			System.out.println("Perfect Number");
		else
			System.out.println("Not a Perfect Number...");
	}

}
