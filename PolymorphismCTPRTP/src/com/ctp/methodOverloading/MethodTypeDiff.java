package com.ctp.methodOverloading;

import java.util.Scanner;

public class MethodTypeDiff {

	public void cinema()
	{
		System.out.println("You searching for movie ");
		System.out.println("wait a min i will give list of available movies...");
	}
	public int cinema(int time)
	{
		System.out.println("You searching  by the time ");
		System.out.println("wait a min i will give list of time slot...");
		return  time  ;
	}
	public String cinema(int time, String s)
	{
		System.out.println("You searching for movie and time ");
		System.out.println("wait a min i will give list of available movies and time slot both available...");
		return s + " selecting time " + time;
	}
	public static void main(String[] args) throws InterruptedException{
		
		
		MethodTypeDiff m= new MethodTypeDiff();
		
		Scanner sc= new Scanner(System.in);
		System.out.println("1. seaching for movie and theater...");
		System.out.println("2. searching on time..");
		System.out.println("3. Select movie ,time , theater, sourace of buying ticket");
		int number=sc.nextInt();
		
		switch(number)
		{
		
		case 1:
		{
			System.out.println("case 1 for ");
			m.cinema();
			Thread.sleep(1000);System.out.println();
			System.out.println();
			System.out.println("ishq");
			System.out.println("dj tillu");
			System.out.println("salar");
			break;
		}
		case 2:
		{

			System.out.println("case 2 for ");
			System.out.println(m.cinema(6 ));
			Thread.sleep(1000);System.out.println();
			
			System.out.println("show at 11");
			System.out.println("show at 2");
			System.out.println("show at 6");
			System.out.println("show at 10");
			
			break;
		}
		case 3:
		{
			System.out.println("case 3 for ");
			System.out.println(m.cinema(10, "own time movie theater.."));
			Thread.sleep(1000);System.out.println();
			System.out.println("ishq");
			System.out.println("dj tillu");
			System.out.println("salar");
			
			System.out.println("show at 11");
			System.out.println("show at 2");
			System.out.println("show at 6");
			System.out.println("show at 10");
			break;
		}
		default:
		{
			System.out.println("nothing matched...");
		}
			
		}
		
	}
}
