package PerfectNumberPrograms;

import java.util.Scanner;

public class PerfectNumberMtoNFunctions {

	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter m number");
		int m=sc.nextInt();
		System.out.println("Enter n number");
		int n=sc.nextInt();
		
		mtoNPerfectNumbers(m, n);

	}
	public static void mtoNPerfectNumbers(int start,int end)
	{
		
		for(int i=start;i<=end;i++)
		{
			int sum=0;
			for(int j=1;j<i;j++)
			{
				if(i%j==0)
				{
					sum+=j;
				}
			}
		
		if(sum==i)
		{
			System.out.println(i);
		}
		}
		
	}

}
