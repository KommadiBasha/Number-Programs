package com.String.Programs.Demo;

import java.util.Scanner;

public class NormalPrinting {
public static void main(String[] args) {
	
	
	Scanner sc= new Scanner(System.in);
	System.out.println("enter string ");
	String s= "String is final class";
	String str=sc.nextLine();
	String add="";
	
	String addS="";
	for(int i=0;i<str.length();i++)
	{
		addS=addS+str.charAt(i);
	}
	
	System.out.println(addS);
	
	
	
	
	for(int i=0;i<s.length();i++)
	{
			add=add+s.charAt(i);	
	}
	System.out.println(add);
}
}
