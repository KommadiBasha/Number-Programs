package ConvertingDecimal_to_Binary;

import java.util.Scanner;

public class ConHexa_to_Decimal {

	public static void main(String[] args) 
	{
		Scanner sc= new Scanner (System.in);
		System.out.println("Enter a Hexa value...");
		String hexa= sc.next();
		hexa=hexa.toUpperCase();
		int len=hexa.length();
		int base=1;
		int dec=0;
		for(int i=len-1;i>=0;i--)
		{
			if(hexa.charAt(i) >= '0' && hexa.charAt(i) <='9')
			{
				dec +=(hexa.charAt(i)-48)*base ;
				base*=16;
			}
			else if(hexa.charAt(i) >= 'A' && hexa.charAt(i) <='F')
			{
				dec +=(hexa.charAt(i)-55)*base;
				base *=16;
			}
		}
		System.out.println(dec);

	}

}
