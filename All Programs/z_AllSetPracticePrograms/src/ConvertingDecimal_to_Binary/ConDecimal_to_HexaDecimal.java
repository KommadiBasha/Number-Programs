package ConvertingDecimal_to_Binary;

import java.util.Scanner;

public class ConDecimal_to_HexaDecimal {

	public static void main(String[] args) 
	{

		Scanner sc =new Scanner(System.in);
		System.out.println("Enter a number...");
		int num=sc.nextInt();
		
		String hexa="";
		int rem=0;
		while(num!=0)
		{
			rem=num%16;
			switch(rem)
			{
			case 10:
				hexa="A"+hexa;
				break;
			case 11:
				hexa="B"+hexa;
				break;
			case 12:
				hexa="C"+hexa;
				break;
			case 13:
				hexa="D"+hexa;
				break;
			case 14:
				hexa="E"+hexa;
				break;
			case 15:
				hexa="F"+hexa;
				break;
			default:
				hexa=rem+hexa;
				break;
			}
			num/=16;
			
		}
		System.out.println(hexa);
	}

}
