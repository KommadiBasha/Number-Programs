package com.ctp.metodhiding.example1.allstaticn_onstatic;

public class ParentExample {

	
	public static void m1()
	{
		System.out.println("parent static m1");
	}
	public  void m1nonstatic()
	{
		System.out.println("parent non-static m1nonstatic");
	}
	public void parentSpecific()
	{
		System.out.println("parent specific....");
	}
	public void childSpecific()
	{
		System.out.println("child specific method in parent....");
	}
}