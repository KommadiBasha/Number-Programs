package RealTimePraticedPrograms;

import java.security.DrbgParameters.NextBytes;
import java.util.Scanner;

public class ElligibleForDonateBloodor_Not {

	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("we need to know your personal info Sex,Age,Weight after That we will decide ");
		System.out.println();
		System.out.println("Enter your age...");
		int age=sc.nextInt();
		System.out.println("Enter your weight...");
		int weight=sc.nextInt();
		System.out.println("Enter your sex...");
		char sex = sc.next().charAt(0);
		
		if(age>=20 && age<=70)
		{
			if(weight>=50 && weight<=90)
			{
				if(sex=='M' || sex=='F' || sex=='m' || sex=='f')
				{
					System.out.println("All are perfext matched just wait 5 mins we will call u...");
				}
			}
			else
			{
				System.out.println("Weight is below 50 or above 90 so its risc for u");
			}
		}
		else
		{
			System.out.println("Age below 20 or above 70 pls serach for another person...");
		}
	}

}
