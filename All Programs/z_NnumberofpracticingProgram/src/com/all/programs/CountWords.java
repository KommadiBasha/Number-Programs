package com.all.programs;

import java.util.Scanner;

public class CountWords {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("enter string...");
	String str=sc.nextLine();
	int Charcount=0;
	int Spacecount=0;
	for(int i=0;i<str.length();i++)
	{
		
		if( str.charAt(i)!=' ' || str.charAt(i)!=' ' && str.charAt(i-1)==' ')
		{
			
			Charcount++;//publicstaticvoidmain
		}
		else
		{
						Spacecount++;
		}
	}
	System.out.println(Charcount);
	System.out.println(Spacecount);
}
}
