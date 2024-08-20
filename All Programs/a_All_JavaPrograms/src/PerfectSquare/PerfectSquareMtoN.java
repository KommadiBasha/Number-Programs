package PerfectSquare;

import java.util.Scanner;

public class PerfectSquareMtoN {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner (System.in);
		System.out.println("enter m number");
		int m=sc.nextInt();
		
		System.out.println("enter n number");
		int n=sc.nextInt();
		
		
		for(int i=m;i<=n;i++)
		{
			int temp=i;
			for(int j=1;j<=i;j++)
			{
				int square=j*j;
				if(square==temp)
				{
					System.out.print(temp+" ");
					break;
				}
			}
		}
	}

}
