package com.encapsulation.setterswith.construtor;

public class InitializingWithConstrutor 
{
	 private String name;
	 private long adhaar;
	 private long mobileNumber;
	 private char sex;
	 
	 
	 public InitializingWithConstrutor(String s, long adhaarl,long mn, char c)
	 {
		this.name=s;
		this.adhaar=adhaarl;
		this.mobileNumber=mn;
		this.sex=c;
		
	}
	 public String getName()
	 {
		 return name;
	 }
	 
	 public long getAdhaar()
	 {
		 return adhaar;
	 }
	 public long getMn()
	 {
		 return mobileNumber;
	 }
	 public char getSex()
	 {
		 return sex;
	 }
	 
	 public static void main(String[] args)
	 {
	;;InitializingWithConstrutor  i= new InitializingWithConstrutor("Basha",820170828781l, 9985270826l, 'm');
			System.out.println(i.getName()+" "+i.getAdhaar()+" " +i.getMn()+" "+ i.sex);
	}
}
