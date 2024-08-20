package com.all.programs;

import java.util.Scanner;

public class palindrome {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter a number ...");
	int num=sc.nextInt();
	int num1=num;
	int store;
	boolean b=false;
	
	while(num>0)
	{
	
		int last=num%10;
		store=last;
		//System.out.print("store "+store);
		num/=10;
	}
	
	if(b==true)
	{
		System.out.println("palindrome...");
	}
	else
	{
		System.out.println("not a palindrome...");
	}
	
	
	
}
}
