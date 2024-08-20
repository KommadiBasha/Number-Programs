package StringP;

import java.util.Scanner;

public class ReverseOfString {

	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a string");
		String s=sc.nextLine();
		String space="";
		for(int i=s.length()-1;i>=0;i--)
		{
				space=space+s.charAt(i);
		}
		System.out.println(space);
	}

}
