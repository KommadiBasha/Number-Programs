package com.ctp.methodOverloading;

import java.util.Scanner;

public class ExampleStatic {

	
	public static void method (String s)
	{
		System.out.println("Searchig by name :"+ s);
	}
	
	public static void method(String s, long l)
	{
		System.out.println("searching by name and  account number :"+ s +"  "+ l);
	}
	public static void method(String s, long l,char c)
	{
		System.out.println("searching by name ,account number and gender :"+ s +"  "+ l +"  "+c);
	}
	public static void main(String[] args) {
		
		
		
		Scanner sc= new Scanner (System.in);
		System.out.println("You can search your details by following type");
		System.out.println("1. search by name");
		System.out.println("2. search by name, account number");
		System.out.println("3. search by name ,account number, gender");
		
		
	
		int i=sc.nextInt();
		if(i==1)
		{
			System.out.println("give me your name...");
			String s1=sc.next();
			method(s1);
		}
		else if(i==2)
		{

			System.out.println("give me your name  and  account number ...");
			String s1=sc.next();
			long l1=sc.nextLong();
			method(s1, l1);
		}
		else if(i==3)
		{
			
			System.out.println("give me your name ,account number and gender in char only  ...");
			String s1=sc.next();
			long l1=sc.nextLong();
			char c1=sc.next().charAt(0);
		method(s1, l1, c1);
		}
		else
			System.out.println("your are selected ut of range...");
	}
	
	
}
