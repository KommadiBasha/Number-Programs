package MtoNPrintProgams;

import java.util.Scanner;

public class PrimeNumberMtoN {

	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the start number...");
		int m=sc.nextInt();
		System.out.println("Enter end Number...");
		int n=sc.nextInt();
		for(int i=m;i<=n;i++)
		{
			boolean b= true;
			for(int j=2;j<=i/2;j++)
			{
				if(i%j==0)
				{
				b=false;
				}
			}
			if(b==true)
			{
				System.out.println(i);
			}
		}
	}

}
