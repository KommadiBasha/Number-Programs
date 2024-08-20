package com.rtp.different.argumentandReturn;

public class MainDriver {

	public static void main(String[] args) {
		ParentRTP p= new ParentRTP();
		p.surname();
		System.out.println(p.myName());
		System.out.println(p.nickName("parent ref obj"));
		
		System.out.println();
		
		
		ChildRTP c= new ChildRTP();
		c.surname();
		System.out.println(c.myName());
		System.out.println(c.nickName("child ref obje"));
		System.out.println();
		
		ParentRTP p1= new ChildRTP();
		p1.surname();System.out.println(p1.myName());;System.out.println(p1.nickName("parent ref child obj"));
	}
}
