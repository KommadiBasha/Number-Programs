package com.rtp.methodOverriding.example;

public class MainDriver {

	
	public static void main(String[] args) {
		
		
		Parent p= new Parent();
		Child c= new Child();
		
		p.property();
		p.marry();
		
		
		System.out.println();
		
		c.property();
		c.marry();
		
		System.out.println();
		System.out.println("parent refference child object");
		Parent p1= new Child();
		p1.property();
		p1.marry();
	}
}
