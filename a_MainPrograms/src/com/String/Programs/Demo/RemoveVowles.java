package com.String.Programs.Demo;

public class RemoveVowles {

	public static void main(String[] args) {
		String s= "String is immutable AA class objects ";
		String store="";
		for(int i=0;i<s.length();i++)
		{
			if(i>=0 && s.charAt(i)!='a' && s.charAt(i)!='e' && s.charAt(i)!='i' && s.charAt(i)!='o' && s.charAt(i)!='u'
					&& s.charAt(i)!='A' && s.charAt(i)!='E' && s.charAt(i)!='I' && s.charAt(i)!='O' && s.charAt(i)!='U')
			{
				store =store+s.charAt(i);
			}
		}
		System.out.println(store);
	}
}
