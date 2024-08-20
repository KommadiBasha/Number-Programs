package MtoNPrintProgams;

import java.util.Scanner;

public class PerfectNumberMtoN {

	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);

		System.out.println("enter the start number...");
		int m=sc.nextInt();
		System.out.println("Enter end Number...");
		int n=sc.nextInt();
	
		for(int i=m;i<=n;i++)
		{
			int sum=0;		
			for(int j=1;j<=i/2;j++)
			{
				if(i%j==0)
				{
					sum=sum+j;
				}
			}	
			if(sum==i)
			{
				System.out.println(i);	
			}
		}
		
	}

}
