package NumberPrograms;

import java.util.Scanner;

public class PerfectNumberOrNotForLoop {

	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("enter number...");
		int number=sc.nextInt();
		int sum=0;
		for(int i=1;i<=number/2;i++)
		{
			if(number%i==0)
			{
				sum=sum+i;
			}
		}
		if(sum==number)
		{
			System.out.println("perfect..");
		}
		else
		{
			System.out.println("not peerfect...");
		}
	}

}
