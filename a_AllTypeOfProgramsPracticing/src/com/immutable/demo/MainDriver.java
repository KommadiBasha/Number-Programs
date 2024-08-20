package com.immutable.demo;

public class MainDriver {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
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
