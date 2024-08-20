package PerfectNumberPrograms;

import java.util.Scanner;

public class PerfectNumberOR_NOT_F 
{

	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter number");
		int number=sc.nextInt();
		
		int sum=0;
		for(int i=1;i<=number/2;i++)
		{
	//Here number is always same for every iteration only i value is increases
			if(number%i==0)
			{
				sum=sum+i;
			}
		}
		if(sum==number)
		{
			System.out.println("perfect number");
		}
		else
		{
			System.out.println("Not a Perfect Number");
		}

	}

}
