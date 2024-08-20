package com.singleton.program;

public class Example
{
 
	static Example e;
	
	private Example()
	{
		
	}
	public static Example modify()
	{
		if(e==null)
		{
			e= new Example();
		}
		return e;
		
	}
	
	public static void main(String[] args) {
		Example e1= e.modify();
		Example e2= e.modify();
		System.out.println(e.modify());
		System.out.println(e1);
		System.out.println(e2);
	}
}
