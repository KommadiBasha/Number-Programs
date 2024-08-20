package PalindromeNumberPrograms;

import java.util.Scanner;

public class PalindromeO_N_Functions 
{
	public static void palindomeOR_NOT(int receivingNumber)
	{
		int sum=0;
		int temp=receivingNumber;
		while(receivingNumber>0)
		{
			int last=receivingNumber%10;
			sum=sum*10+last;
			receivingNumber/=10;
		}
		if(temp==sum)
			System.out.println("palindome Number");
		else
			System.out.println("Not a Palindome...");
	}
	public static void main(String[] args) 
	{
		Scanner sc =new Scanner (System.in);
		System.out.println("Enter a number...");
		int sendingNumber=sc.nextInt();
		
		palindomeOR_NOT(sendingNumber);
	}

}
