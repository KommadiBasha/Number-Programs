package PerfectNumberPrograms;

import java.util.Scanner;

public class PerfectNumberOR_NOT_FunctionsByUsingReturnType 
{
	public static boolean numberISPerfect(int n)
	{
		int sum=0;
		for(int i=1;i<n;i++)
		{
			if(n%i==0)
			{
				sum=sum+i;
			}
		}
		if(sum==n)
		{
			return true;
		}
		return false;
	}
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter number");
		int num=sc.nextInt();
		
		boolean b=numberISPerfect(num);
		if(b)
		{
			System.out.println("Perfect number");
		}
		else
		{
			System.out.println("Not a perfect Number");
		}
	}

}
