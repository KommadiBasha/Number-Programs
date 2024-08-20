package com.ctp.ConstructorOverloadingStudentDetails;

public class StudentCollegeDetails extends StudentDetails
{
	String studentCollegeName;
	int studentId;
	int studentRoom;
	
	public StudentCollegeDetails() {
		// TODO Auto-generated constructor stub
	}
	public StudentCollegeDetails(String name,long number, char gender, int same) {
		super(name,number,gender,same);
	}
	
	public StudentCollegeDetails(String name,long number, char gender, int same,String collegeName) {
		super(name,number,gender,same);
		this.studentCollegeName=collegeName;
	}
	
	public StudentCollegeDetails(String name,long number, char gender, int same,String collegeName,int id) {
		super(name,number,gender,same);
		this.studentCollegeName=collegeName;
		this.studentId=id;
	}
	public StudentCollegeDetails(String name,long number, char gender, int same,String collegeName,int id,int room) {
		super(name,number,gender,same);
		this.studentCollegeName=collegeName;
		this.studentId=id;
		this.studentRoom=room;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString()+" "+ studentCollegeName+" "+studentId+" "+studentRoom;
	}
}
