package ConvertingDecimal_to_Binary;

import java.util.Scanner;

public class ConOctal_to_Decimal {

	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter a number...");
		int oct=sc.nextInt();
		System.out.println("octal  number..."+oct);
		int temp=oct;
		int base=1;
		int decimal=0;
		while(temp>0)
		{
			int rem=temp%10;
			temp/=10;
			decimal +=rem *base;
			base=base*8;
			
		}
		System.out.println("Decimal number..."+decimal);
	}

}