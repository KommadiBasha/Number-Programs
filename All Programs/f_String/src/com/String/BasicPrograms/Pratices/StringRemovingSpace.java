package com.String.BasicPrograms.Pratices;

public class StringRemovingSpace {
	
			public static void main(String[] args) {
		String s= "String is a final class";
		String str="";
		int count=0;
		for(int i=0;i<s.length();i++)
		{
			if(i>=0 && s.charAt(i)!=' ')
			{
				str=str+s.charAt(i);
				count++;
			}
		}
		System.out.println(s.length());
		System.out.println(str);
		System.out.println(count);
	}
}