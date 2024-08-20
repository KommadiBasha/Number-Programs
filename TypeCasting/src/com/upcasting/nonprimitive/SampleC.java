package com.upcasting.nonprimitive;

public class SampleC extends DemoP{

	public void m1NonStatic()
	{
		System.out.println("child class m1 non static method...");
	}
	
	public static void m1Static()
	{
		System.out.println("child class m1 static method...");
	}
	public void same11NonStatic()
	{
		System.out.println("child non-static same11 method...");
	}
	public static void same22Static()
	{
		System.out.println("child  static same22 method...");
	}
	public static void method1InChildStatic()
	{
		System.out.println("child static own method...1");
	}
	public void method2InChildNonStatic()
	{
		System.out.println("child non-static own method...2");
	}
}
