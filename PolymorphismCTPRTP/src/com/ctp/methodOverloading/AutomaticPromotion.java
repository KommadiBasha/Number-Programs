package com.ctp.methodOverloading;

import java.util.Scanner;

public class AutomaticPromotion 
{
	
	public void m1()
	{
		System.out.println("no arrgument method..");
	}
	public void m1(int i)
	{
		System.out.println("int type argument");
	}
	public void m1(float l)
	{
		System.out.println("float type argument...");
	}
	
	public static void main(String[] args) {
		AutomaticPromotion  a= new AutomaticPromotion();
		Scanner sc= new Scanner(System.in);
//		System.out.println("enter any input...");
//		byte b=sc.nextByte();
//		short s= sc.nextShort();
	int in=sc.nextInt();
//		long l= sc.nextLong();
		float fl=sc.nextFloat();
//		double d=sc.nextDouble();
//		char c=sc.next().charAt(0);
//		boolean boo=sc.nextBoolean();
		
	a.m1();
	 a.m1(fl);
	a.m1(in);
	}
	}
