package SalaryGreater_lesser;

import java.util.Scanner;

public class SalaryCalcultion 
{
	public static void main(String[] args) 
	{
	Scanner sc=new Scanner (System.in);
	System.out.println("Enter your salary");
	int sal=sc.nextInt();
	if(sal >= 50000)
	{
		System.out.println("sal too large");
	}
		else if( sal >=40000 && sal<=50000)
		{
			System.out.println("f sal is 40k-50k its 1st highet");
		}
		else if( sal<=40000)
		{
			System.out.println("sal too small");
		}
	
	else
	{
	System.out.println("conditionds are not followed...");	
	}
	}
}
