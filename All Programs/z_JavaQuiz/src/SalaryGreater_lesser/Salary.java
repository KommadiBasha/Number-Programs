package SalaryGreater_lesser;

import java.util.Scanner;

public class Salary 
{
	public static void main(String[] args) 
	{
	Scanner sc=new Scanner (System.in);
	System.out.println("Enter your salary");
	int sal=sc.nextInt();
	if(sal >= 50000)
	{
		System.out.println("sal is greater than 50000");
	}
		else if( sal >=40000 && sal<=50000)
		{
			System.out.println("f sal is 40k-50k its 1st highet");
		}
		else if( sal >=30000 && sal<=40000)
		{
			System.out.println("f sal is 30k-40k its 2nd highet");
		}
	
	else
	{
	System.out.println("conditionds are not followed...");	
	}

	}

}
