package StringP;

import java.util.Scanner;

public class ReverseAStringWordbyWord {

	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a string word");
		String s1=sc.nextLine();
		String rev="";
		for(int i=s1.length();i>0;i--)
		{
			rev=rev+s1.charAt(i-1);
		}
		System.out.println(rev);
	}

}
