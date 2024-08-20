package com.encapsulation.usingsettersandconstrutor;

public class Setters_Construtors 
{
    private String name;
    private long accountNumber;
    private String address;
    private char gender;
    private int pincode;
    
    
    
    public Setters_Construtors(String s, char c, int pin)
    {
		this.address=s;
		this.gender=c;
		this.pincode=pin;
	}
	
   public void setName(String na)
   {
	   this.name=na;
   }
   public void setAccountNumber(long num)
   {
	   this.accountNumber=num;
   }
   
   public String getName()
   {
	   return name;
   }
   public long getAccountNumber()
   {
	   return accountNumber;
   }
   public String getAddress()
   {
	   return address;
   }
   public char getGender()
   {
	   return gender;
   }
	public int getPincode()
	{
		return pincode;
	}
	
	
}
