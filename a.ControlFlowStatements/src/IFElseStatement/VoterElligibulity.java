package IFElseStatement;

import java.util.Scanner;

public class VoterElligibulity 
{
 public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	
	System.out.println("enter condition");
	
	int age=sc.nextInt();
	if(age >=18)
	{
	 System.out.println("elligible for vote...");	
	}
	else
	{
		System.out.println("not elligible");
	}
}
}
