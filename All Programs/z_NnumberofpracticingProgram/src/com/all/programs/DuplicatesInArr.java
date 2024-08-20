package com.all.programs;

import java.util.Scanner;

public class DuplicatesInArr {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("enter size...");
	int size=sc.nextInt();
	
	int [] arr=new int[size];
	System.out.println("enter array elements...");
	for(int i=0;i<size;i++)
	{
		arr[i]=sc.nextInt();
	}
	for(int i=0;i<arr.length;i++)
	{
		for(int j=i;j<arr.length;j++)
		{
			if(arr[i]==arr[j])
			{
				System.out.print(arr[i]+" ");
				break;
			}
		}
	}
}
}
