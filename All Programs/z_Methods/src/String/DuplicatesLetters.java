package String;

import java.util.Scanner;

public class DuplicatesLetters {

	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("enter string...");
		String str=sc.nextLine();
		findduplicates(str);
	}
	public static void findduplicates(String s)
	{
		int count;
		for(int i=0;i<s.length();i++)
		{
			count=1;
			char c =s.charAt(i);
			if(c==' ')
			{
				continue;
			}
			for(int j=i+1; j<s.length();j++)
			{
				if(c==s.charAt(j))
				{
					count++;
					s=s.substring(0, j)+s.substring(j+1);
				}
			}
			if(count>1)
			{
				System.out.println(c);
			}
		}
	}

}
