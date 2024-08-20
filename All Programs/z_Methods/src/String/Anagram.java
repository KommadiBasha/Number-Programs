package String;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) 
	{
		String s1="was";
		String s2="saw";
		
		s1.toLowerCase();
		s2.toLowerCase();
		char [] c1=s1.toCharArray();
		char [] c2=s2.toCharArray();
		
		Arrays.sort(c1);
		Arrays.sort(c2);
		
		s1=new String(c1);
		s2=new String(c2);
		
		if(s1.equals(s2))
		{
			System.out.println("anagaram..");
		}
		else
		{
			System.out.println("not a anagram...");
		}
		
	}

}
