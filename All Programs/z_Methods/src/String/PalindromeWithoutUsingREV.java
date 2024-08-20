package String;

import java.util.Scanner;

public class PalindromeWithoutUsingREV {

	public static void main(String[] args) 
	{
		
		Scanner sc= new Scanner(System.in);
		System.out.println("enter string...");
		String str=sc.nextLine();
		
		 if(ispalindrome(str))
		 {
			 System.out.println("palindrome");
		 }
		 else
		 {
			 System.out.println("Not a palindrome");
		 }
	}
	public static boolean ispalindrome(String s)
	{
		
		for(int i=0;i<s.length()/2;i++)
		{
			if(s.charAt(i)!=s.charAt(s.length()-1-i))
			{
				return false;
			}
		}
		
		
		return true;
	}

}
