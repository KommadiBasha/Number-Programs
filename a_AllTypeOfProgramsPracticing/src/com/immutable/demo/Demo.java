package com.immutable.demo;

public final class Demo {

	private String s;
	
	public Demo(String str) {
		this.s=str;
	}
	public  Demo tryingToModify(String name)
	{
		if(this.s==name)
		{
			return this;
		}
		else
		{
			return (new Demo(name));
		}
		
	}
	
	
	
	
	
	public static void main(String[] args) 
	{
		Demo d1= new Demo("Sani");
		Demo d2= d1.tryingToModify(".Sani");
		Demo d3= d1.tryingToModify("Sohil");
		Demo d4= d1.tryingToModify("SANI");
		Demo d5= d1.tryingToModify("Sani");
		System.out.println(d1==d2);//f
		System.out.println(d2==d3);//f
		System.out.println(d3==d4);  //f
		System.out.println(d1==d5);//t    

	}

}
