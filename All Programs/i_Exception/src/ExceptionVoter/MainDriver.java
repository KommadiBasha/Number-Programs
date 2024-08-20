package ExceptionVoter;

import java.util.Scanner;
public class MainDriver
{
	public static void main(String[] args) throws Exception
	{
		Scanner sc= new Scanner(System.in);
		int age= sc.nextInt();
		if(age==18)
		{
			System.out.println("Equals 18");
			throw new YoungAgeException ("Your are elligible for your 1st time vote");
		}
		else if(age>18)
		{
			System.out.println("Greater than 18");
			throw new ToOldException ("Your age is above 18 ");
		}
		else
		{
			System.out.println("Not elligible...");
		}
	}
	
}
