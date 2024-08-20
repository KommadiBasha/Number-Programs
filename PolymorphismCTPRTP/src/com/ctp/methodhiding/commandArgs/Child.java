package com.ctp.methodhiding.commandArgs;

public class Child extends Parent{

	public static void m1()
	{
		System.out.println("m1 static child..");
	}
	
	public static void main(int [] i)
	{
		System.out.println("int [] type main method child...");
		//System.out.println(i);
		  for (int elem : i) {
	            System.out.print(elem + " ");
	        }
		  System.out.println();
	}
	public static void main(char [] c)
	{
		System.out.println("char array child ... ");
		System.out.println(c);
	}
	
}
