package ConvertingDecimal_to_Binary;

import java.util.Scanner;

public class ConBinary_to_Decimal {

	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter a number...");
		long bin=sc.nextLong();
		 
		long decimal=0;
		long base=1;
		long temp=bin;
		
		while(temp>0)
		{
			long rem= temp%10;
			temp/=10;
			decimal	+=rem*base;
			base=base*2;
		}
		System.out.println(decimal);
	}

}
