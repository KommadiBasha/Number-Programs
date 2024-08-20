package com.String.Programs.Demo;

import java.util.Scanner;

public class palindrome {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("enter string ");
	String str=sc.nextLine();
	
	String original=str;
	String store="";
	for(int i=str.length()-1;i>=0;i--)
	{
		store=store+str.charAt(i);
	}
	if(original.equalsIgnoreCase(store))
	{
		System.out.println("palindrome   "   + original +"   "+ store);
	}
	else
	{
		System.out.println("not a palindrome  "  + original +"   "+ store);
	}
}
}
