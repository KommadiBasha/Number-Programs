package HardWork;

import java.util.Scanner;

public class Primeornot {

	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("You are printing whole numbers ok...");
		System.out.println("enter the  number...");
		int num=sc.nextInt();
		for(int i=2;i<=num;i++)
		{
			if(num%2==0)
			{
				System.out.println("not a prime...");
				break;
				
			}
			else
			{
				System.out.println(num +"  is prime");
				break;
			}
			
		}

	}

}
