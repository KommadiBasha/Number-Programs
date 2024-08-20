package com.ctp.methodOverloading;

public class VarArgumentMethod {

	
	public void m1(int x)
	{
		System.out.println("general type");
	}
	public void m1(int ... x)
	{
		System.out.println("var arg method");
	}
	public static void main(String[] args) {
		VarArgumentMethod v= new VarArgumentMethod();
		v.m1(12);
		v.m1(12,3654,646);
	}
}
