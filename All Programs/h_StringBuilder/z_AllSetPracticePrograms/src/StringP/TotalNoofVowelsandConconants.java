package StringP;

import java.util.Scanner;

public class TotalNoofVowelsandConconants 
{
	
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a string");
		String s=sc.nextLine();
		int countV=0;
		int countC=0;
		
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)!=' ')
			{
			if(s.charAt(i)=='a' || s.charAt(i)=='e'|| s.charAt(i)=='i'|| s.charAt(i)=='o'||s.charAt(i)=='u'
					||s.charAt(i)=='A'|| s.charAt(i)=='E'||s.charAt(i)=='I'||s.charAt(i)=='O'||s.charAt(i)=='U')
			{
				countV++;
			}
			else
			{
				countC++;
			}
			}
		}
		System.out.print("vowels count"+countV);
		System.out.println();
		System.out.print("conconates count"+countC);
	}
	
	
}
