package ArmstrongNumberPrograms;

import java.util.Scanner;

public class ArmstrongNumberORNotWhenWeKnowTheDigits {

	public static void main(String[] args) 
	{
		int number=1634;
		int store=number;
		int sum=0;
		while(number>0)
		{
			int rem=number%10;
			sum+=(rem*rem*rem*rem);
			number/=10;
			
		}
		if(store==sum)
			System.out.println("Armstrong Number");
		else
			System.out.println("Not a ArmStrong Number");
		
		
	}

}
