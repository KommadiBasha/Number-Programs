package com.all.programs;

import java.util.Scanner;

public class ChangeCharWhenVowelsOccured 
{
	    public static void main(String[] args) 
	    {
	    	Scanner sc= new Scanner(System.in);
	    	System.out.println("enter string ");
	        String input = sc.nextLine();
	      //  input.toCharArray();
	        String vowels="aeiouAEIOU";
	        vowels.toCharArray();
	        String store="";
	        char a='a';char e='e'; char i='i';char  o='o';char u='u';
	        for(int x=0;x<input.length();x++)
	        {
	        	
	        	
	        	if(input.charAt(i)==a||input.charAt(i)==e || input.charAt(i)==i||
	        	   input.charAt(i)==o||input.charAt(i)==u )
	        	{
	        		a+=1;e+=1;i+=1;o+=1;u+=1;
	        		
	        		 
	        	}
	        	
	        	
	        }
	        
	    }

	  
}
