package com.all.programs;

import java.util.Scanner;

public class InputArray {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	
	System.out.println("enter size...");
	int size=sc.nextInt();
	System.out.println("enter values for n values "+size);
	int [] arr=new int [size];
	for(int i=0;i<arr.length;i++)
	{
		arr[i]=sc.nextInt();
	}
	for(int i:arr)
	{
		System.out.print("  "+i+"");
	}
}
}
