package Forloop;

import java.util.Scanner;

public class PalindromeorNot {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter a String...");
		String str=sc.nextLine();
		String rev="";
		for(int i=str.length()-1;i>=0;i--)
		{
			rev=rev+str.charAt(i);
		}
		System.out.println(rev);
		System.out.println();
		if(rev.equals(str))
		{
			System.out.println("palindrome");
		}
		else
		{
			System.out.println("not a palindrome");
		}
	}

}
