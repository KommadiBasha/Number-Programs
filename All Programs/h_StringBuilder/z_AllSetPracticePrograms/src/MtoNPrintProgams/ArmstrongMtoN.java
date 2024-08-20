package MtoNPrintProgams;

import java.util.Scanner;

public class ArmstrongMtoN {

	public static void main(String[] args) 
	{

		Scanner sc =new Scanner(System.in);
		System.out.println("enter the start number...");
		int m=sc.nextInt();
		System.out.println("Enter end Number...");
		int n=sc.nextInt();
		
		for(int i=m;i<=n;i++)
		{
			int count=0;
			int sum=0;
			int store=0;
			for(int j=i;j!=0;j/=10)
			{
				count++;
			}
			for(int k=i; k!=0; k/=10)
			{
				int fact=1;
				store=k%10;
				for(int l=1;l<=count;l++)
				{
					fact*=store;
				}
				sum+=fact;
			}
			if(sum==i)
			{
				System.out.println(sum);
			}
		}
	}

}
