package com.encapsulation.usingsettersandconstrutor;

public class MainDriver
{
	
	public static void main(String[] args) {
		Setters_Construtors s= new Setters_Construtors("lingala", 'M', 516396);
		
		
		s.setAccountNumber(998877665544l);
		s.setName("Ganesh");
		
		
		System.out.println(s.getName());
		System.out.println(s.getAccountNumber());
		System.out.println(s.getAddress());
		System.out.println(s.getGender());
		
		System.out.println(s.getPincode());
		
		
	}
}
