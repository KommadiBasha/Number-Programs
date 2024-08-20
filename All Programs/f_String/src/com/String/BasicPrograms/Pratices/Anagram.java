package com.String.BasicPrograms.Pratices;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter s1 String...");
	String s1=sc.nextLine();
	System.out.println("enter s2 String...");
	String s2=sc.nextLine();
	s1.toLowerCase();
	s2.toLowerCase();

	char [] c1=s1.toCharArray();
	char [] c2=s2.toCharArray();
	
	Arrays.sort(c1);
	Arrays.sort(c2);
	s1=new String(c1);
	s2=new String(c2);
	if(s1.equalsIgnoreCase(s2))
	{
		System.out.println("annagram");
	}
	else
	{
		System.out.println("not a angram...");
	}
}
}
