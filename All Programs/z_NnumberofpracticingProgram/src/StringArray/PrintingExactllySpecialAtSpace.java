package StringArray;

import java.util.Scanner;

public class PrintingExactllySpecialAtSpace {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("enter a string...");
		String sr=sc.nextLine();
		String rev="";
		for(int i=0;i<sr.length();i++)
		{
			if(sr.charAt(i)!=' ')
			{
				rev=rev+sr.charAt(i);
			}
			else
			{
				rev=rev+'-';
			}
		}
		System.out.println(rev);
	}
}
