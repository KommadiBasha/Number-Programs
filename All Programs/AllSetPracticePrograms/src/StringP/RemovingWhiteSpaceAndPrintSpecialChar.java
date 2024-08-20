package StringP;

import java.util.Scanner;

public class RemovingWhiteSpaceAndPrintSpecialChar 
{
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a string");
		String s=sc.nextLine();
		String space="";
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)!=' ')
			{
				space=space+s.charAt(i);
			}
			else
			{
				space=space+"-";
			}
			
		}
		System.out.println(space);
	}
}
