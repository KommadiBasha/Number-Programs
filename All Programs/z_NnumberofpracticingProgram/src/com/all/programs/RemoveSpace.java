package com.all.programs;

import java.util.Scanner;

public class RemoveSpace {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("enter string...");
	String str=sc.nextLine();
	
	String rev="";
	for(int i=0;i<str.length();i++)
	{
		if(str.charAt(i)!=' ')
		{
			rev=rev+str.charAt(i);
			rev+="-";
		}
	}
	//System.out.println(rev);
	rev=rev.substring(0, rev.length()-1);
	System.out.println(rev);
}
}
