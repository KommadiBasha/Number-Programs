package StringArray;

import java.util.Scanner;

public class StringWithSpecialChar {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("enter string...");
	String str=sc.nextLine();
	String rev="";
	for(int i=0;i<str.length();i++)
	{
		if(i>=0 )
		{
			rev=rev+str.charAt(i)+'-';
			
		}
	}
	
	System.out.println(rev);
}
}
