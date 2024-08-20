package NumberPrograms;

import java.util.Scanner;

public class PalindromeOrNot {

	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the start number...");
		int m=sc.nextInt();
		int store=m;
		
		int sum=0;
		for(int i=0;m>i;i++)
		{
			int last=m%10;
			sum=(sum*10)+last;
			m/=10;
		}
		if(sum==store)
		{
			System.out.println("palinrome");
		}
		else
		{
			System.out.println("not palindrome..");
		}
	
		

	}

}
