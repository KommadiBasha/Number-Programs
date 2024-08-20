package com.ctp.ConstructorOverloadingStudentDetails;

public class StudentDetails {
	
	String studentName;
	long   studentPhoneNumber;
	char   studentGender;
	int sameNumber;
	
	public StudentDetails() {
		System.out.println();
	}
	StudentDetails(String name)
	{
		this.studentName=name;
	}
	StudentDetails (String name,long number)
	{
		this(name);
		this.studentPhoneNumber=number;
	}
	StudentDetails(String name,long number, char gender, int same)
	{
		this(name,number);
		this.studentGender=gender;
		this.sameNumber=same;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return studentName +" "+studentPhoneNumber+" "+studentGender+" "+sameNumber;
	}
	
}
