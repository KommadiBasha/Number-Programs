package StringP;

import java.util.Scanner;

public class NoofWordsinString {

	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a string");
		String s=sc.nextLine();
		int count=0;
		for(int i=0;i<s.length();i++)
		{
			
			if(i==0 && s.charAt(i)!=' '||(s.charAt(i)!=' ' && s.charAt(i-1)==' '))
			{
				count++;
			}
			
			
		}
		System.out.println(count);
	}

}
