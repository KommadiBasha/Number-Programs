package com.ctp.metodhiding.example1.allstaticn_onstatic;

public class MainDriver {

	
	public static void main(String[] args) {
		
	ParentExample e= new ParentExample();System.out.println();
		
		e.m1();e.m1nonstatic();e.childSpecific();e.parentSpecific();System.out.println();
		
		
		ChildExample c= new ChildExample();
		
		
		c.m1();
		c.m1nonstatic();
		c.childSpecific();
		c.childSpecific11();
		ParentExample ref= new ChildExample();System.out.println();
		ref.m1nonstatic();
		ref.m1();
		ref.parentSpecific();
		ref.childSpecific();
	
	}
}
