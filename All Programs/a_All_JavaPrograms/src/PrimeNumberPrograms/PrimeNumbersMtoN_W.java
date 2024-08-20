package PrimeNumberPrograms;

import java.util.Scanner;

public class PrimeNumbersMtoN_W {

	public static void main(String[] args) 
	{

		Scanner sc =new Scanner(System.in);
		System.out.println("Enter m value");
		int m=sc.nextInt();
		System.out.println("Enter n value");
		int n=sc.nextInt();
		int count;
		int i;
		while(m<=n)
		{
			count =0;
			i=2;
			while(i<=m/2)
			{
				if(m%i==0)
				{
					count++;
					break;
				}
				i++;
			}
			if(count==0 && m!=1)
			{
				System.out.print(m+" ");
			}
			m++;
		}
	}

}
