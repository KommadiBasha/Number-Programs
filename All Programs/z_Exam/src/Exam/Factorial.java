package Exam;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) 
	{
		Scanner sc= new Scanner (System.in);
		System.out.println("enter a number");
		int num1=sc.nextInt();
		int pro=1;
		while(num1!=0)
		{
			int last=num1%10;
			
			pro=pro*last;
			System.out.println(pro);
			num1/=10;
			
			
		}
		
	}

}
