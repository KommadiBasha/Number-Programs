package com.tables;

import java.util.Scanner;

public class Tables {

	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in); 
		
		System.out.println("Enter any one Number ");
		int number=sc.nextInt();
		System.out.println("You entered number is "+number);
		for(int i=1;i<=10;i++)
		{
			int result=i*number;
			
			System.out.println(number +"  * "+i+"   =   "+result);
		}
		
		
	}
	
	
	
}
