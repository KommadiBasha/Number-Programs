package com.String.Programs.Demo;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		
		String s1="Meat";
		String s2= "Team";
		s1=s1.toLowerCase();
		s2=s2.toLowerCase();
		System.out.println(s1);
		System.out.println(s2);
		char [] c1=s1.toCharArray();
		char [] c2=s2.toCharArray();
		
		
		Arrays.sort(c2);
		Arrays.sort(c1);
		s1= new String (c1);
		s2= new String (c2);
		
		if(Arrays.equals(c1, c2))
		{
			System.out.println("anagram");
		}
		else
		{
			System.out.println("not anagram..");
		}
		if(s1.equals(s2))
			
		{
			System.out.println("Anagram");
		}
		else
		{
			System.out.println("Not Anagram");
		}
	}
}
