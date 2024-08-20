package NestedIF_ForStatement;

import java.util.Scanner;

public class BloodDoner 
{
	 public static void main(String [] args)
	 {
		 Scanner sc= new Scanner (System.in);
		 System.out.println("please enter your age...");
		 int age= sc.nextInt();
		 System.out.println("please enter your weight...");
		 int weight=sc.nextInt();
		 
		 if(age>=18)
		 {
			 if(weight >= 45 )
			 {
				 System.out.println(age +" "+ weight +"  "+ "Both age and weight are matched i.e 18+and weight 45+ ");
			 }
			 else
			 {
				 System.out.println("weight is below 45....");
			 }
		 }
		 else
		 {
			System.out.println("age only not support to donate a blood ...."); 
		 }
	 }
}
