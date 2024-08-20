package com.String.BasicPrograms.Pratices;

public class StringRemoveSpace_PtrSpecialChar {

	public static void main(String[] args) {
		String s= "String is immutable";
		String str="";
		
		for(int i=s.length()-1;i>=0;i--)
		{
			if(i>=0&& s.charAt(i)!=' ' )
			{
				str=str+s.charAt(i);
			}
			
		}
		//str=str.substring(0,str.length()-1);
		System.out.println(str);
	}
}
