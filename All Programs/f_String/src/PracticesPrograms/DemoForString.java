package PracticesPrograms;

import java.util.Scanner;

public class DemoForString 
{
	static String tripFrom;
	static String tripTo;
	
	int numOfPersons;
	public String locaton(String s)
	{
		System.out.println(tripFrom);
		System.out.println(tripTo);
		return s;
	}
	public static void main(String [] args)
	{
		Scanner sc= new Scanner (System.in);
		System.out.println("Enter your trip from...");
		tripFrom =sc.next();
		System.out.println("Enter your trip to...");
		tripTo=sc.next();
		
		DemoForString  d= new DemoForString ();
		System.out.println("Enter noof persons...");
		d.numOfPersons=sc.nextInt();
		
		if(d.numOfPersons==2)
		{
			System.out.println("2 persons......");
			System.out.println(tripFrom +" to "+tripTo);
		}
		else
		{
			System.out.println("more than 2 or less than 2 are not allowed...");
		}
	}
}
