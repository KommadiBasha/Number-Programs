package String;

import java.util.Scanner;

public class PalindromeWithReversingString {

	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("enter string...");
		String str=sc.nextLine();
		
		String print= palindrome(str);
		//System.out.println(print);
		 if(str.equals(print))
		 {
			 System.out.println("palindrome");
		 }
		 else
		 {
			 System.out.println("Not a palindrome");
		 }
		 
	}
	public static String palindrome(String s)
	{
	 String rev="";
	 for(int i=s.length()-1;i>=0;i--)
	 {
		 rev=rev+s.charAt(i);
	 }
	
	 return rev;
		
		
	}

}
