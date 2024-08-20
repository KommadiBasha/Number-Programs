package com.all.programs;

import java.util.Scanner;

public class Factorial {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("enter number..");
	
	int num=sc.nextInt();
	long l=1;
	for(int i=1;i<=num;i++)
	{
		l*=i;
		System.out.println("i value  "+i+"   l value   "+l);
	}
	System.out.println("l factorial is "+l);
}
}
