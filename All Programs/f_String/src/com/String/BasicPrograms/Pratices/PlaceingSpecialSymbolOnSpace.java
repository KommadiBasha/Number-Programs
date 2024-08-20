package com.String.BasicPrograms.Pratices;

public class PlaceingSpecialSymbolOnSpace {
	public static void main(String[] args) {
		
	
	String s= "the sky is blue";
	String str="";
	for (int i=0;i<s.length();i++)
	{
		if(i>=0 && s.charAt(i)!=' ')
		{
			str=str+s.charAt(i);
		}
		else
		{
			str=str+"-";
		}
	}
	System.out.println(str);
	System.out.println(s.length());
}
}