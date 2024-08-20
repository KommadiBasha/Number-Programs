package PalindromeNumberPrograms;

import java.util.Scanner;

public class PalindromeO_N_W 
{

	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter a number...");
		int number=sc.nextInt();
		int temp=number;
		int sum=0;	
		while(number!=0)
		{
			int last =number%10;
			sum=(sum*10)+last;
			number/=10;
		}
		if(sum==temp)
		{
			System.out.println("palindrome...");
		}
		else
		{
			System.out.println("not a palindrome...");
		}
	}

}
