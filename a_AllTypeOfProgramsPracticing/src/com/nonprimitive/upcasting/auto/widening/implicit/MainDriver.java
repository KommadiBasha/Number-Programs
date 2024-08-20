package com.nonprimitive.upcasting.auto.widening.implicit;

public class MainDriver {
public static void main(String[] args) {
	System.out.println("parent ref parent object");
	Bike bi=new Bike();
	bi.travel11111111111111111();
	bi.travelBike();
	bi.same();
	System.out.println(".....................");

	System.out.println("child ref child object");
	Cycle c= new Cycle();
	c.travel11111111111111111();
	c.travel22222222222222222();
	c.travelBike();
	c.travelCycle();
	c.same();
	
	System.out.println("....................");
	System.out.println("parent ref child object");
	Bike b= new Cycle();
	b.travelBike();
	b.travel11111111111111111();
	b.same();

	
	//Cycle c1= new Bike();
}
}
