package MtoNPrintProgams;

import java.util.Scanner;

public class StrongNumbersMtoN {

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
				for(int j=i;j!=0;j/=10)
				{
					int last=j%10;
					int fact=1;
					for(int k=1;k<=last;k++)
					{
						fact*=k;
						
					}
					sum=sum+fact;
				}
		if(sum==i)
		{
			System.out.println(sum);
		}
		
		}
	}

}
