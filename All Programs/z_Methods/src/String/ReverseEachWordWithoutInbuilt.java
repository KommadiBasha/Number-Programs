package String;

import java.util.Scanner;

public class ReverseEachWordWithoutInbuilt {

	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("enter string...");
		String str=sc.nextLine();
		
		String rev="";
		for(int i=0;i<str.length();i++)
		{
			int j=i;
			while(i<str.length() && str.charAt(i)!= ' ')
			{
				i++;
			}
			for(int k=i-1; k>=j;k--)
			{
				rev=rev+str.charAt(k);
			}
			rev=rev+' ';
		}
		System.out.println(rev);
	}

}
