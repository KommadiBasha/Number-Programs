package com.ctp.ConstructorOverloadingStudentDetails;

public class MainDriver {

	
	public static void main(String[] args) {
		
		StudentDetails c1=new StudentDetails();
		StudentDetails c2=new StudentDetails("Basha");
		StudentDetails c3=new StudentDetails("Basha",998520826l);
		StudentDetails c4=new StudentDetails("Basha",9985270826l,'M',207);
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(c4);
		
		StudentCollegeDetails s1= new StudentCollegeDetails();
		StudentCollegeDetails s2= new StudentCollegeDetails("Basha",9985270826l,'M',207);
		StudentCollegeDetails s3= new StudentCollegeDetails("Basha",9985270826l,'M',207,"RGMCET");
		StudentCollegeDetails s4= new StudentCollegeDetails("Basha",9985270826l,'m',1122,"rgcet",404);
		StudentCollegeDetails s5= new StudentCollegeDetails("Basha",9985270826l,'M',207,"RGMCET",404,207);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		System.out.println(s5);
	}
	
	
}
