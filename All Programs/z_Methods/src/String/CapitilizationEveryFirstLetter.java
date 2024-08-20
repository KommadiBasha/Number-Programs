package String;

import java.util.Scanner;

public class CapitilizationEveryFirstLetter {

	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("enter string...");
		String str=sc.nextLine();
		String print=capotilaztion(str);
		
	}
	public static String capotilaztion(String s)
	{
		String store="";
		s.toLowerCase();
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			if( ch>='a'&& ch<='z')
			{
				char c=(char)(ch-32);
				
				store=store+c;
			}
		}
		return store;
		
	}
			

}
