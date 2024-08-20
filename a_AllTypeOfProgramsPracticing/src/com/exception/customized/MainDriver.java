package com.exception.customized;

import java.util.Scanner;

public class MainDriver {

	public static void main(String[] args) throws AutoLate,BusMissing
	{
		System.out.println("Try to catch bus at 10 pm exactly...");
		Scanner sc= new Scanner(System.in);
		System.out.println("please enter your at what time you will there...");
		double late=sc.nextInt();
		
		if(late==10.00)
		{
			System.out.println("you will catch bus");
		}
		else if (late>=0 && late<=5) {
			System.out.println("late by 5 mins");
			throw new AutoLate("May be you ill get bus...");
			
		}
		else
		{
			System.out.println("You late by more tham 5 mins");
			throw new BusMissing("Already bus is went...");
			
		}
	}

}
