package com.exception.program;

public class MainDriver {

	
	public static void main(String[] args) {
		
		
		System.out.println("Main class...");
		
		try
		{
			new CustomizedException("yeah exception is handeld");
		}
		catch(Exception e)
		{
			
		}
	}
}
