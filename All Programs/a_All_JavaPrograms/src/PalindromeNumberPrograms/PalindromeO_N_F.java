package PalindromeNumberPrograms;

import java.util.Scanner;

public class PalindromeO_N_F {

	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter a number...");
		int number=sc.nextInt();
		 
		int temp=number;
		int sum=0;
		for(int i=0;number>0;i++)
		{
			int last=number%10;
			sum =(sum*10)+last;
			number/=10;
			
		}
		if(sum==temp)
		{
			System.out.println("Palindrome...");
		}
		else
		{
			System.out.println("Not a Palindome...");
		}

	
	}

}
