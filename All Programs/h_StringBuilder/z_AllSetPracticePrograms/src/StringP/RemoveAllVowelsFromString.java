package StringP;

import java.util.Scanner;

public class RemoveAllVowelsFromString 
{
	public static void main(String[] args) 
	{
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter a string");
	String s=sc.nextLine();
	String remove="";
	for(int i=0;i<s.length();i++)
	{
		
		if(s.charAt(i)!='a' && s.charAt(i)!='e'&& s.charAt(i)!='i'&& s.charAt(i)!='o'&&s.charAt(i)!='u'
				&&s.charAt(i)!='A'&& s.charAt(i)!='E'&&s.charAt(i)!='I'&&s.charAt(i)!='O'&&s.charAt(i)!='U')
		{
			remove=remove+s.charAt(i);
		}
	}
	System.out.println(remove);
	}
}
		
