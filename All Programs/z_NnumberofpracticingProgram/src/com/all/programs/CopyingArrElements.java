package com.all.programs;

import java.util.Scanner;

public class CopyingArrElements {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter size ...");
		int size=sc.nextInt();
		
		int [] arr1=new int [size];
		int [] arr2=new int[size];
		int [] arr3=new int [size*2];
		System.out.println("enter elements");
		for(int i=0;i<arr1.length;i++)
		{
			arr1[i]=sc.nextInt();
		}
		System.out.println("enter second array elements for tyhe size :"+size);
		for(int i=0;i<arr1.length;i++)
		{
			arr2[i]=sc.nextInt();
		}
		
		for(int i=0;i<arr1.length;i++)
		{
			arr3[i]=arr1[i];
		}
		int j=0;
			for(int x=arr1.length;x<arr3.length;x++)
			{
			arr3[x]=arr2[j++];
			}
		
		

			for(int i=0;i<arr3.length;i++)
			{
				System.out.print(arr3[i]+" ");
			}
		
		
		

	}

}
