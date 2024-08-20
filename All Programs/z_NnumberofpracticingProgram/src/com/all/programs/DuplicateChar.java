package com.all.programs;

import java.util.Scanner;

public class DuplicateChar {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("enter string ");
    String in = sc.nextLine();
    in.toCharArray();
    for(int i=0;i<in.length();i++)
    {
    	for(int j=i+1;j<in.length();j++)
    	{
    		if(in.charAt(i)==in.charAt(j))
    		{
    			System.out.print(in.charAt(i));
    			
    		}
    	}
    }
}
}
