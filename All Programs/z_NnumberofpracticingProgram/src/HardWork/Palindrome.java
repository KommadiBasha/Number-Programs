package HardWork;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) 
	{
		Scanner sc =new Scanner (System.in);
		System.out.println("Enter a number.");
		String s=sc.nextLine();
		
		String rev="";
		String check=s;
		for(int i=s.length()-1;i>=0;i--)
		{
			rev=rev+s.charAt(i);
		}
		System.out.println(rev);
		if(rev.equals(check))
		{
			System.out.println("palimdrome");
		}
		else
		{
			System.out.println("not a palindrome");
		}
			
	}

}
