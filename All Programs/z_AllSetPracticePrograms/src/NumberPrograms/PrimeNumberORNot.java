package NumberPrograms;

import java.util.Scanner;

public class PrimeNumberORNot 
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("enter number...");
		int number=sc.nextInt();
		
		for(int i=2;i<=number;i++)
		{
			if(number%i==0)
			{
				if(i==number)
				{
					System.out.println("prime number");
					break;
				}
				else
				{
					System.out.println("not prime...");
					break;
				}
			}
		}
	}
}
