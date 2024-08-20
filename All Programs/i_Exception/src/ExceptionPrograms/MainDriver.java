package ExceptionPrograms;

import java.util.Scanner;

public class MainDriver 
{
	public static void main(String[] args) throws DemoProgram
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your age...");
		int age=sc.nextInt();

		if(age>=18)
		{
			System.out.println("Elligible for vote...");
		}
		else 
		{
			
		}
	}
	
}
