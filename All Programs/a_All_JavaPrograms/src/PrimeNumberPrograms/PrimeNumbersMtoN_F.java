package PrimeNumberPrograms;

import java.util.Scanner;

public class PrimeNumbersMtoN_F {

	public static void main(String[] args) 
	{

		Scanner sc =new Scanner(System.in);
		System.out.println("Enter m value");
		int m=sc.nextInt();
		System.out.println("Enter n value");
		int n=sc.nextInt();
		//if u give input as 2 it takes 3 b'z increasing +1
		for(int i=m+1;i<=n;i++)
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
				System.out.print(i+" ");
			}
		}
	}

}
