package com.upcasting.nonprimitive;

public class DemoP {

	
	public void m1NonStatic()
	{
		System.out.println("super class m1 non static method...");
	}
	
	public static void m1Static()
	{
		System.out.println("parent class m1 static method...");
	}
	public void same11NonStatic()
	{
		System.out.println("parent non-static same11 method...");
	}
	public static void same22Static()
	{
		System.out.println("parent  static same22 method...");
	}
	public void specificMethod1()
	{
		System.out.println(" parent Method1 specific non-static...");
	}
	public static  void specificMethod2()
	{
		System.out.println(" parent Method2 specific static...");
	}
}
