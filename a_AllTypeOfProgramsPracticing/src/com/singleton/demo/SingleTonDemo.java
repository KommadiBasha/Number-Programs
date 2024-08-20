package com.singleton.demo;

public  class SingleTonDemo {

	static SingleTonDemo sd;
	
	private SingleTonDemo()
	{
		
	}
	public static SingleTonDemo oneTimeObject()
	{
		if(sd==null)
		{
			sd= new SingleTonDemo();
		}
		return sd;
	}
	public static void main(String[] args) {
		
		System.out.println(sd.oneTimeObject());
		SingleTonDemo sd1= new SingleTonDemo();
		SingleTonDemo sd2= new SingleTonDemo();
		System.out.println(sd1.oneTimeObject());
		System.out.println(sd2.oneTimeObject());
	}
	
}
