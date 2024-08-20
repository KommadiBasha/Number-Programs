package StringP;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {

	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a string First word");
		String s1=sc.nextLine();
		System.out.println("Enter a string second word");
		String s2=sc.nextLine();
		
		s1.toLowerCase();
		s2.toLowerCase();
		
		if(s1.length()==s2.length())
		{
			char [] c1=s1.toCharArray();
			char [] c2=s2.toCharArray();
			Arrays.sort(c1);
			Arrays.sort(c2);
			s1=new String(c1);
			s2=new String(c2);
			if(s1.equals(s2))
			{
				System.out.println("Anagram");
			}
			else
			{
				System.out.println("not a anagram");
			}
		}
		else
		{
			System.out.println("Not a anagram will in lenth only");
		}
	}

}
