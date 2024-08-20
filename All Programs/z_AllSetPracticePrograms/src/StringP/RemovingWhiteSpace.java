package StringP;

import java.util.Scanner;

public class RemovingWhiteSpace 
{

	public static void main(String[] args) 
	{
	
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a string");
		String s=sc.nextLine();
		String ws="";
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)!=' ')
			{
				ws=ws+s.charAt(i);
			}
			
		}
	System.out.println(ws);
	}

}
