package com.ctp.metodhiding.example1.allstaticn_onstatic;

public class ChildExample extends ParentExample
{
	public static void m1()
	{
		System.out.println("child m1 static ...");
	}
	public  void m1nonstatic()
	{
		System.out.println("child non-static m1nonstatic");
	}
	public void childSpecific()
	{
		System.out.println("child specific....");
	}
	public void childSpecific11()
	{
		System.out.println("child specific11 special....");
	}
}
