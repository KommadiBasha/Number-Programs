package com.ctp.methodhiding.commandArgs;

public class MainDriver {

	public static void main(String[] args) {
		
		int [] i= {75,4,6456,6};
		char [] c={'j','g','v'};
		
		Parent p = new Parent();System.out.println("parent refferenece");
		p.m1();
		p.main(c);
		p.main(i);
		Child child= new Child();System.out.println("child refference");System.out.println();
		child.m1();
		child.main(c);
		child.main(i);
		
		Parent p1= new Child();System.out.println("parent ref and child object...");System.out.println();
		p1.m1();
		p1.main(c);
		p1.main(i);
	}
	
}
