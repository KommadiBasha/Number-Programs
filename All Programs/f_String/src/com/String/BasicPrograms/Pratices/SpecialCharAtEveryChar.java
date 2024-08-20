package com.String.BasicPrograms.Pratices;

import java.util.Scanner;

public class SpecialCharAtEveryChar {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("enter a string...");
	String str=sc.nextLine();
	String rev="";
	for(int i=0;i<=str.length()-1;i++)
	{
		rev=rev+str.charAt(i);
		rev+='*';
	}
	rev=rev.substring(0, rev.length()-1);
	System.out.println(rev);
}
}
