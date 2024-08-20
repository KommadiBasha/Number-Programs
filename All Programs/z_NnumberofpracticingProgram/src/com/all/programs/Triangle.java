package com.all.programs;

import java.util.Scanner;

public class Triangle {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter number...");
	int num=sc.nextInt();
	
	for(int i=0;i<=num;i++)
	{
		for(int j=i;j<=num;j++)
		{
			
			System.out.print(" ");
			
		}
		for(int j=1;j<=i;j++)
		{
			
			System.out.print(" *");
		}System.out.println();	
		}
}
}
