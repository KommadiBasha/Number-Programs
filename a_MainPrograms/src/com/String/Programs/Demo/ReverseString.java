package com.String.Programs.Demo;

public class ReverseString {
public static void main(String[] args) {
	
	String s="String";
	String empty="";
	for(int i=s.length()-1;i>=0;i--)
	{
		if(i>=0)
		{
		empty=empty+s.charAt(i)+"-";
		}
	}
	
	System.out.println(empty);
}
}
