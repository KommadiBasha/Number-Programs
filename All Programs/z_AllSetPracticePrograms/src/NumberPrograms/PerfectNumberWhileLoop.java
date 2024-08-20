package NumberPrograms;

import java.util.Scanner;

public class PerfectNumberWhileLoop 
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("enter number...");
		int number=sc.nextInt();
		int sum=0;
		int i=1;
		while(i<number)
		{
			if(number%i==0)
			{
				sum=sum+i;
			}
			i++;
		}
		if(sum==number)
		{
			System.out.println("perfect...");
		}
		else
		{
			System.out.println("not perfect...");
		}
		
		
	}
	
}
