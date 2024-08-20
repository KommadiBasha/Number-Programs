package com.upcasting.nonprimitive;

public class MainDriver {

	
	public static void main(String[] args) {
		
		DemoP d1= new SampleC();
		SampleC c= (SampleC)d1;
		c.m1NonStatic();
		c.m1Static();
		c.same11NonStatic();
		c.same22Static();
		c.method2InChildNonStatic();
		c.method1InChildStatic();
		c.specificMethod1();
		c.specificMethod2();
		
		//Not at all posible ...SampleC s1= new DemoP();
		

	}
}
