package com.String.BasicPrograms.Pratices;

import java.util.Scanner;

public class ReverseProgram {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter string ...");
	String rev="";
	String str=sc.nextLine();
	for(int i=str.length()-1;i>=0;i--)
	{
		rev=rev+str.charAt(i);
		rev+='-';
	}
	
	System.out.println(rev);
}
}
