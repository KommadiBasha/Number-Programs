package HardWork;

import java.util.Scanner;

public class Palindromepro {

	public static void main(String[] args)
	{
		
		checkPalindrome();
	}
	public static void checkPalindrome()
	{
		
	Scanner sc= new Scanner(System.in);
	System.out.println("enter a string...");
	String str=sc.next();
	String store="";
	for(int i=str.length()-1;i>=0;i--)
	{
		store=store+str.charAt(i);
	}
	if(store.equals(str))
	{
		System.out.println("palindrome");
	}
	else
	{
		 System.out.println("not palindrome...");
	}

	}
}
