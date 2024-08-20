package SumofOddDigits;

import java.util.Scanner;

public class SumOddDigits 
{
	public static void main(String [] args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("enter digits");
		int i=sc.nextInt();
		int sum=0;
		while(i>0)
		{
			int last= i%10;
			if(i%2==1)
			{
				//System.out.println(i);
				sum=sum+last;
			}
			i/=10;
			
		}
		System.out.println(sum);
	}
	
}
