package Forloop;

import java.util.Scanner;

public class ReverseAString {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		String var=sc.nextLine();
		String rev="";
		for(int i=var.length()-1;i>=0;i--)
		{
			rev=rev+var.charAt(i);
		}
		System.out.println(rev);
	}

}
