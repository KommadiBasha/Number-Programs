package PerfectNumberPrograms;

import java.util.Scanner;

public class PerfectNumbersMtoN_F 
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter m number");
		int m=sc.nextInt();
		System.out.println("Enter n number");
		int n=sc.nextInt();
		for(int i=m;i<=n;i++)
		{
			int sum=0;
	//j<i works j<=i will not work j<=i/2 works
			for(int j=1;j<i;j++)
			{
				if(i%j==0)
				{
					sum=sum+j;
				}
			}
			if(sum==i)
			{
				System.out.print(i+" ");
			}
		}
	}

}
