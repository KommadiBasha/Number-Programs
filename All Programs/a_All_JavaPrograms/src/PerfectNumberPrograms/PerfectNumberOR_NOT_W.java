package PerfectNumberPrograms;

import java.util.Scanner;

public class PerfectNumberOR_NOT_W {

	public static void main(String[] args) 
	{

		Scanner sc= new Scanner(System.in);
		System.out.println("Enter number");
		int num=sc.nextInt();
		int sum=0,divisible=1;
		int temp=num;
		while(divisible<=num/2)
		{
			if(num%divisible==0)
			{
				sum=sum+divisible;
			}
			divisible++;
		}
		if(temp==sum)
		{
			System.out.println("Perfect number");
		}
		else
		{
			System.out.println("Not a perfect Number");
		}
	}

}
