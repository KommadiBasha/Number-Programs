package NumberPrograms;

import java.util.Scanner;

public class PalindromeWhileloop {

	public static void main(String[] args)
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the start number...");
		int num=sc.nextInt();
		int store=num;
		int rev,sum=0;
		while(num>0)
		{
			rev=num%10;
			sum=(sum*10)+rev;
			num/=10;
		}
		if(sum==store)
		{
			System.out.println("palindome");
		}
		else
			System.out.println("not palindrome..");
	}

}
