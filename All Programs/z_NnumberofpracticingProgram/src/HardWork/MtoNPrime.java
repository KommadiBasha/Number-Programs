package HardWork;

import java.util.Scanner;

public class MtoNPrime {

	public static void main(String[] args)
	{

		Scanner sc =new Scanner (System.in);
		System.out.println("Enter a m  number .");
		int m=sc.nextInt();
		System.out.println("Enter a n  number.");
		int n=sc.nextInt();
		for(int i=m;i<=n;i++)
		{
			for(int j=2;j<=i;j++)
			{
				if(i%j==0)
				{
					
					System.out.println(i);
				}
				
			}
		}
	}

}
