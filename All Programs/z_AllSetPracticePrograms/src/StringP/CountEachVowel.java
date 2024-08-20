package StringP;

import java.util.Scanner;

public class CountEachVowel {

	public static void main(String[] args) 
	{

		Scanner sc= new Scanner (System.in);
		System.out.println("enter string");
		String s=sc.nextLine();
		
		
		int count=0;
		
		for(int i=0;i<s.length();i++)
		{
			//System.out.println(s[i].charAt(5));
			count++;
			
			
		}
			
		System.out.println(count);
		
	}

}
