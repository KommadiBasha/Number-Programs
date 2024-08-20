package com.singleton.demo;

public final class SingleTonClass 
{
	static SingleTonClass s;
	private SingleTonClass() 
	{
		// TODO Auto-generated constructor stub
	}
	
	public static SingleTonClass instanceMethodForSingleTon()
	{
		if(s==null)
		{
			s=new SingleTonClass();
		}
			return s;
	}
	public static void main(String[] args) 
	{
		
		System.out.println(s.instanceMethodForSingleTon());
		SingleTonClass s1= new SingleTonClass();
		SingleTonClass s2= new SingleTonClass();
		System.out.println(s1.instanceMethodForSingleTon());
		System.out.println(s2.instanceMethodForSingleTon());
	}
}
