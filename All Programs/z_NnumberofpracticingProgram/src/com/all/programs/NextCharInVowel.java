package com.all.programs;

import java.util.Scanner;

public class NextCharInVowel {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("enter String...");
	String str=sc.nextLine();
	String con="aeiouAEIOU";
	con.toCharArray();
	String store="";
	StringBuilder sb=new StringBuilder();
	for(char c:str.toCharArray())
	{
		if(con.indexOf(c)!=-1)
		{
			sb.append((char)(c+1));
		}
		else
		{
			sb.append(c);
		}
	}
	System.out.println(sb.toString());
}
}
