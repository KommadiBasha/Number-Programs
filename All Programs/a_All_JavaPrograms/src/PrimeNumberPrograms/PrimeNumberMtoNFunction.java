package PrimeNumberPrograms;

import java.util.Scanner;

public class PrimeNumberMtoNFunction {

	public static void main(String[] args) 
	{
		
		Scanner sc= new Scanner(System.in);
		System.out.println("enter a start number");
		int start=sc.nextInt();
		System.out.println("enter a end number");
		int end=sc.nextInt();
		mtonPrimeNumbers(start, end);
		
	}
	public static void mtonPrimeNumbers(int m,int n)
	{
		for(int i=m+1;i<=n;i++)
		{
			boolean b=true;
			for(int j=2;j<=i/2;j++)
			{
				if(i%j==0)
				{
					b=false;
				}
			}
			if(b==true)
			{
				System.out.print(i+" ");
			}
		}
		
		
	}

}