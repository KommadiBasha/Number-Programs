package ArmstrongNumberPrograms;

import java.util.Scanner;

public class ArmStrongOR_Not {

	public static void main(String[] args) 
	{
		Scanner sc= new Scanner (System.in);
		System.out.println("Enter number");
		int inputNum= sc.nextInt();
		int numForCount=inputNum;
		int numForExtarct=inputNum;
		int numForCheck=inputNum;
		int count=0;
		int sum=0;
		System.out.println(numForCount);
		System.out.println(numForCount);
		System.out.println(numForExtarct);
	
		while(numForCount>0)
		{
			count++;
			numForCount/=10;
		}
		System.out.println(count +" count");
		while(numForExtarct>0)
		{
			int last=numForExtarct%10;
			int fact=1;
		
			for(int i=1;i<=count;i++)
			{
				fact=fact*last;
			}
			sum=sum+fact;
			numForExtarct/=10;
		}
		if(sum==numForCheck)
		{
			System.out.println("ArmStrong...");
		}
		else
		{
			System.out.println("Not ArmStrong...");
		}
	}

}
